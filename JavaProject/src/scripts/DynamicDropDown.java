package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicDropDown {

	@Test(groups={"Smoke"})
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/**Spice Jet**/
		/*
		driver.get("http://spicejet.com"); //URL in the browser
		//  //a[@value='MAA']  - Xpath for chennai
		//  //a[@value='BLR']
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		 */

		/**rahulshettyacademy**/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();
		//driver.findElement(By.xpath("//td[@class='mapbg']/div/div/div/ul[1]/li[6]")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("BLR");
		Thread.sleep(1000);
		System.out.println("1");
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("MAA");
		System.out.println("2");

		//driver.switchTo().alert().accept();
	}
}