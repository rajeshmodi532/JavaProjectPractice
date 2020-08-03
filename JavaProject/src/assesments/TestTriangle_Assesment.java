package assesments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTriangle_Assesment {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Rajesh\\Desktop\\\\Desktop\\TestTriangle_Assesment.html");
		driver.manage().window().maximize();
		//WebElement temp = driver.findElement(By.xpath("//table//tbody"));
		List<WebElement> tr = driver.findElements(By.xpath("//table//tbody//tr"));
		
		//List<WebElement> tr = temp.findElements(By.tagName("//tr"));
		for (WebElement trlist:tr)
		{
			List<WebElement> td = trlist.findElements(By.tagName("td"));
			for (WebElement tdlist:td)
			{
				String value = tdlist.getText();
				System.out.println(value);
			}
		}
		driver.close();
	}
}