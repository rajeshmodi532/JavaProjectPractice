package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	static boolean B = false;
	static String Script, Execute, Expected = "India";

	public static void main(String[] args) throws InterruptedException{
		
		ChromeProfile.InvokeBrowser();
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Scroll down to view typing in input field
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys("Ind");

		while(!B)
		{
			driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
			Script ="return document.getElementById(\"autocomplete\").value;";
			Execute =(String) js.executeScript(Script);
			if (Execute.equals(Expected))
			{
				B=true;
				System.out.println(Execute);
				driver.findElement(By.cssSelector("#autocomplete")).click();
				break;
			}
		}
		driver.close();
	}
}