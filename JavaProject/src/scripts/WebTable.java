package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		//Access WebTable and limit WebDriver
		WebElement Table = driver.findElement(By.id("product"));

		//Get Count of rows in WebTable
		int rows = Table.findElements(By.cssSelector("table#product tr")).size();
		System.out.println("Count of rows in WebTable : "+rows);

		//Get Count of columns in WebTable
		int columns = Table.findElements(By.cssSelector("table#product tr th")).size();
		System.out.println("Count of columns in WebTable : "+columns);

		//Get count of columns in 2nd row
		int row_2 = Table.findElements(By.cssSelector("table#product tr:nth-child(3) td")).size();

		//Print row_2 text
		for (int u=0;u<row_2;u++)
		{
			System.out.println(Table.findElements(By.cssSelector("table#product tr:nth-child(3) td")).get(u).getText());
		}
		driver.close();
	}
}
