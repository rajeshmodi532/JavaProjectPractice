package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop_OneFrameToAnotherFrame {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ankur.com/projects/FrameGlider/demo/simple/a.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("b");
		WebElement source = driver.findElement(By.id("Dra1"));
		WebElement target = driver.findElement(By.id("Dro1"));
		Actions builder = new Actions(driver);
		//builder.clickAndHold(source).build().perform();
		//System.out.println(source.getLocation());
		//System.out.println(target.getLocation());
		driver.switchTo().frame("c");

		WebElement cSource = driver.findElement(By.id("Dra2"));
		WebElement cTarget = driver.findElement(By.id("Dro2"));
		builder.clickAndHold(cSource).build().perform();
		System.out.println(cSource.getLocation());
		System.out.println(cTarget.getLocation());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("b");
		System.out.println(source.getLocation());
		driver.switchTo().frame("d");

		WebElement dSource = driver.findElement(By.id("Dra3"));
		WebElement dTarget = driver.findElement(By.id("Dro3"));
		builder.moveToElement(dTarget, 5, 5).click(dTarget).build().perform();
		System.out.println(dSource.getLocation());
		System.out.println(dTarget.getLocation());
	}
}