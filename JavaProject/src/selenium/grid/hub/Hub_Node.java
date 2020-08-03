package selenium.grid.hub;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Hub_Node {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setBrowserName("chrome");
		//DC.setBrowserName("firefox");
		DC.setPlatform(Platform.WINDOWS);

		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444/wd/hub"),DC);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.close();


	}

}
