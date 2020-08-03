package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Identifiers {
	//static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		//Set Chrome browser Driver and declare path of ChromeDriver.exe
		System.setProperty("webdriver.chrome.driver","H:\\Softwares\\chromedriver.exe");
		//Declare Object for WebDriver to Initiate ChromeDriver
		WebDriver driver = new ChromeDriver();
		//Invoke URL through Driver Object
		driver.get("https://www.facebook.com/");
		//Maximize browser window
		driver.manage().window().maximize();
		/**UserName Element Locator**/
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9052633980");
		driver.findElement(By.cssSelector("#email")).sendKeys("9052633980");
		/**Password Element Locator**/
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("wrong password");
		//driver.findElement(By.cssSelector("*[id='pass']")).sendKeys("wrong password");
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("wrong password");
		/**Login Element Locator**/
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
		driver.findElement(By.xpath("//*[contains(@id,'u_0')]")).click();
		//Close the current browser window
		//driver.close();

	}
}
