package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(5000L);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);

		/*int i=1;
		while(i<5)
		{
		driver.findElement(By.id("hrefIncAdt")).click();//4 times
		i++;
		}*/

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		/*for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}*/

		Select S = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		S.selectByValue("4");
		driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.id("btnclosepaxoption")).click();
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		//Calendar UI Enabled Or Disabled
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
