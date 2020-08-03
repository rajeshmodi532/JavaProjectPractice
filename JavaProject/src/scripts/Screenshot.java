package scripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "H:\\Softwares\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		//Take Screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			Files.copy(src, new File ("H:\\Project Workspace\\Project1\\Screenshots\\Google.png"));
		}catch(IOException E)
		{
			
		}
	}

}
