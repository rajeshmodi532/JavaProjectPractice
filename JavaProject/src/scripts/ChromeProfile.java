package scripts;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class ChromeProfile {

	@Test(groups={"Smoke"})
	public static void InvokeBrowser()
	{
		DesiredCapabilities ch = new DesiredCapabilities();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ChromeOptions c = new ChromeOptions();
		//c.addArguments("disable-automation");
		//c.addArguments("disable-infobars");
		//c.addArguments("disable-automation","disable-infobars");

		//c.setExperimentalOption("excludeSwitches", new String[] {"enable-infobars"});
		//c.setExperimentalOption("excludeSwitches", Collections.singleton("load-extension"));
		//c.setExperimentalOption("excludeSwitches", new String[]{});

		c.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		c.setExperimentalOption("useAutomationExtension", false);

		
		/*
		 * c.AddAdditionalCapability("useAutomationExtension", false);
		 * c.AddExcludedArgument("enable-automation");
		 */
		c.merge(ch);


		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(c);
		/*
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * driver.close();
		 */
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * InvokeBrowser(); }
	 */

}
