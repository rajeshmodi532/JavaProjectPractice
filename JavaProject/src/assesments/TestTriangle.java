package assesments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTriangle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Rajesh\\Desktop\\TestTriangle_Assesment.html");
		driver.manage().window().maximize();
		
		//Get Count of tr
		//Read count
		//For each tr get count of td
		//On each td get text from element

		int trcount=0;
		int tdcount=0;

		//Get Count of tr
		List<WebElement> tr = driver.findElements(By.xpath("//table//tbody//tr"));
		trcount = tr.size();
		System.out.println("tr count: "+trcount);

		for(int i=1;i<=trcount;i++)
		{
			//get count of td for each tr
			List<WebElement> td = driver.findElements(By.xpath("//table//tbody//tr["+i+"]//td"));
			tdcount=td.size();
			//System.out.println("td count: "+tdcount);

			for(int j=1;j<=tdcount;j++)
			{
				String value = driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td["+j+"]")).getText();
				System.out.println("tr of "+i+", td of "+j+ ": "+value);
			}
			System.out.println();
		}
		driver.close();
	}
}
