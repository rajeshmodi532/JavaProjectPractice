import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFileUtility {

	public static void main(String[] args) throws IOException {
		Properties Pro = new Properties();
		FileInputStream Fis = new FileInputStream("H:\\Project Workspace\\Project1\\Global.properties");
		Pro.load(Fis);
		System.setProperty("webdriver.chrome.driver", "H:\\Project Workspace\\Project1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Pro.getProperty("url"));
		
		Pro.setProperty("url", "https:www.yahoo.com/");
		
		FileOutputStream Fos = new FileOutputStream("H:\\Project Workspace\\Project1\\Global.properties");
		Pro.store(Fos, "url");
		
		driver.close();
	}

}
