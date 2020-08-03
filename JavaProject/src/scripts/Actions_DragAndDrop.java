package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		/**Grab element from Source and Drop in Destination**/
		//Source
		WebElement Source = driver.findElement(By.id("credit2"));
		
		//Destination
		WebElement Dest = driver.findElement(By.id("bank"));
		
		//Drag and drop using Actions
		Actions Act = new Actions(driver);
		Act.dragAndDrop(Source, Dest).build().perform();
	}
}