package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvokeBrowser {
	
	//private static WebDriver driver;
	@Test
	public static void InitiateBrowser()
	{
		System.setProperty("webdriver.chrome.driver","H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser Initated");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("URL invoked");
		//return driver;
	}

}
