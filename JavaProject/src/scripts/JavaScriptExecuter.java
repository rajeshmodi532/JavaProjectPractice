package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	static boolean B = false;
	static String Script, Execute, Expected = "BENGALURU INTERNATION AIRPORT";//CHIKKALSANDRA BENGALURU

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();

		//Scroll down to view typing in input field
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys("Beng");

		while(!B)
		{
			driver.findElement(By.cssSelector("#fromPlaceName")).sendKeys(Keys.DOWN);
			Script ="return document.getElementById(\"fromPlaceName\").value;";
			Execute =(String) js.executeScript(Script);
			//System.out.println(Execute);
			if (Execute.equals(Expected))
			{
				B=true;
				System.out.println(Execute);
				driver.findElement(By.cssSelector("#fromPlaceName")).click();
				break;
			}
		}
		driver.close();
	}
}