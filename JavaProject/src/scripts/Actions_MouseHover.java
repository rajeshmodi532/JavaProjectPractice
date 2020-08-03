package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//Number of links in Google.com
		int link = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of link in google.com page: "+link);

		//Search in text box about Yahoo
		Actions act =new Actions(driver); 
		WebElement Search = driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")); 
		act.moveToElement(Search).keyDown(Keys.SHIFT).sendKeys("Yahoo").build().perform();

		//get "GMail" link font family using CssValue
		WebElement Gmail =	driver.findElement(By.xpath("//*[@class='gb_g']")); 
		act.moveToElement(Gmail).build().perform();

		System.out.println("WebElement link font : "+Gmail.getCssValue("font-family"));
		//driver.findElement(By.xpath("//*[@class='gb_g']")).click();
		driver.close();
	}
}