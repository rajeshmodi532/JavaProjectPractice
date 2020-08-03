package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.out.println("Hi");
		 * String S = "Hi"; int I =1; Double db = 2.00;
		 * System.out.println(S+" "+I+" "+db);
		 */
		//String i="https://google.com/";
		
		/**Chrome Browser**/
		System.setProperty("webdriver.chrome.driver","H:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/**Firefox Browser**/
		//System.setProperty("webdriver.gecko.driver","H:\\Softwares\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		/**IE Browser**/
		//System.setProperty("webdriver.ie.driver","H:\\Softwares\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		driver.get("https://google.com/");
		driver.getTitle();
		
	}
}