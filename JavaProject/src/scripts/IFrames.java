package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@href='/nested_frames']")).click();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		System.out.println(driver.findElements(By.tagName("frame")).size());
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		driver.close();
	
	}

}
