package scripts;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ArrayList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		ArrayList arrlst = new ArrayList();
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeAsyncScript("document.getElementById('Id').value='text'");
		// Enter username
		JS.executeScript("document.getElementById('User').value='Abha_Rathour'");
	}

}
