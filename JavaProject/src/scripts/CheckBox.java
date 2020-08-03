package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");//Launch URL
		driver.manage().window().maximize();//Maximize window
		//Check & Uncheck - First CheckBox
		//Common Elements
		By CheckBox1 = By.xpath("//*[@id='checkBoxOption1']");
		driver.findElement(CheckBox1).click();//Check the Checkbox
		Assert.assertTrue(driver.findElement(CheckBox1).isSelected(),"Pass");//Verify after selecting checkbox
		driver.findElement(CheckBox1).click();//Uncheck the Checkbox
		Assert.assertFalse(driver.findElement(CheckBox1).isSelected(),"Pass");//Verify after selecting checkbox
		
		
		//Get Count of Checkboxes
		System.out.println("Count of Checkboxes:"+driver.findElements(By.xpath("//*[@type='checkbox']")).size());
		/*
		 * driver.get("http://spicejet.com"); //URL in the browser
		 * Assert.assertFalse(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * //Assert.assertFalse(true);System.out.println(driver.findElement(By.
		 * cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		 * driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).
		 * click(); System.out.println(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 * Assert.assertTrue(driver.findElement(By.cssSelector(
		 * "input[id*='SeniorCitizenDiscount']")).isSelected());
		 */
	}
}
