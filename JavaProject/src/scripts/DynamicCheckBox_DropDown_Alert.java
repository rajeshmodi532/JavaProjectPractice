package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicCheckBox_DropDown_Alert {
	static String CheckBoxLable;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		//get text of 3rd checkbox
		CheckBoxLable = driver.findElement(By.xpath("//body/div/div[4]/fieldset/label[3]")).getText().trim();
		System.out.println("3rd Checkbox lable :"+CheckBoxLable);

		//Select 3rd checkbox
		driver.findElement(By.xpath("//body/div/div[4]/fieldset/label[3]/input")).click();

		//Select dropdown using static string
		Select DropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		DropDown.selectByVisibleText(CheckBoxLable);

		//Enter static string value in text box
		driver.findElement(By.cssSelector("#name")).sendKeys(CheckBoxLable);

		//Click on Alert button
		driver.findElement(By.id("alertbtn")).click();

		//Capture text from alert box
		String Text = driver.switchTo().alert().getText();

		//Split the sentence by space
		String [] TextIndex = Text.split(" ");
		System.out.println(TextIndex[1].substring(0, 7));

		//Accept the Alert
		driver.switchTo().alert().accept();
		driver.close();
	}
}