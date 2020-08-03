package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WaitMethod
{
	static String Expected ="Process completed!";
	static String Actual = "";
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit wait
		WebDriverWait ExpWait = new WebDriverWait(driver, 5);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		WebElement ErrorMessage = driver.findElement(By.xpath("//*[@id='content']/div"));
		ExpWait.until(ExpectedConditions.visibilityOf(ErrorMessage));

		Actual = ErrorMessage.getText().trim(); 
		if(Actual.contains(Expected))
		{
			Assert.assertTrue(true);
		}
		driver.close();

	}
}