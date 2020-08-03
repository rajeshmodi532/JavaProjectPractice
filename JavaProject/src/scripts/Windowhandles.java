package scripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(),'Multiple Windows')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("[target='_blank']")).click();

		Set<String> s = driver.getWindowHandles();
		Iterator<String> w=s.iterator();
		String parent = w.next();
		String child = w.next();
		driver.switchTo().window(child);

		String ChildWindowText = driver.findElement(By.cssSelector("[class='example'] h3")).getText();
		System.out.println(ChildWindowText);

		driver.switchTo().window(parent);
		String ParentWindowText = driver.findElement(By.cssSelector(".example h3")).getText();
		System.out.println(ParentWindowText);

		/*
		 * Wait wait = new FluentWait(driver) .withTimeout(timeout, SECONDS)
		 * .pollingEvery(timeout, SECONDS) .ignoring(Exception.class); Wait<WebDriver>
		 * wait = new FluentWait(driver).withTimeout(10,
		 * TimeUnit.SECONDS).pollingEvery(0.5, TimeUnit.SECONDS) WebElement
		 * foo=wait.until(new Function<WebDriver, WebElement>() { public WebElement
		 * apply(WebDriver driver) { return driver.findElement(By.id("foo")); } });
		 */
		driver.quit();
	}
}
