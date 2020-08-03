package webSites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");//Set BrowserDriver and WebDriver paths
		WebDriver driver = new ChromeDriver();//Declare Object to BrowserDriver
		driver.get("https://www.cleartrip.com/");//Launch URL in Browser
		driver.manage().window().maximize();//Maximize browser window
		driver.findElement(By.id("DepartDate")).click();//Select Calendar UI
		//driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();//Select Today's date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();//Select Today's date
		//driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();//DD1
		Select Dp_Dw_A = new Select(driver.findElement(By.xpath("//*[@name='adults']")));//Declare DropDown WebElement of Adults to Select Package
		Dp_Dw_A.selectByValue("2");//Select 2 Adults
		Select Dp_Dw_C = new Select(driver.findElement(By.xpath("//*[@name='childs']")));//Declare DropDown WebElement of Childs to Select Package
		Dp_Dw_C.selectByVisibleText("2");//select 2 child
		driver.findElement(By.id("MoreOptionsLink")).click();//Click on More Options Hyperlink
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Spice Jet");//Enter any Keyword in Text box
		driver.findElement(By.id("SearchBtn")).click();//Click on Search Button
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());//Return Error Message
		driver.close();//Close the current instance of browser
	}
}
