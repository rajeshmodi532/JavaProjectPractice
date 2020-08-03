package com.Testng;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.Files;
import scripts.ChromeProfile;
import scripts.InvokeBrowser;

public class Links extends InvokeBrowser {
	
	public static final void Test()
	{
		
	}
	
	public static WebDriver driver;
	@BeforeTest
	public void Browser_URL()
	{
		System.setProperty("webdriver.chrome.driver","H:\\Softwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser Initated");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println("URL invoked");
	}
	
	@Test
	public void Three() throws InterruptedException, IOException {

		/*
		 * File exe = new File("Drivers"); File chr_exe = new File
		 * (exe,"chromedriver.exe");
		 */
		
		//Get count of links in webpage
		int AllLinks = driver.findElements(By.tagName("a")).size();
		System.out.println("Count of links throughout WebPage :"+AllLinks);

		//Get count of links in footer
		WebElement Footer = driver.findElement(By.id("gf-BIG"));//Limit WebDriver scope to footer section
		int Footerlinks = Footer.findElements(By.tagName("a")).size();
		System.out.println("Count of links in footer: "+Footerlinks);

		//Get Count of links in first column in footer
		WebElement FirstColumn = Footer.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		int FirstColumnLinks = FirstColumn.findElements(By.tagName("a")).size();
		System.out.println("Count of links in First column of footer: "+FirstColumnLinks);

		//Print Each link name from first column of footer
		for (int i=1;i<FirstColumnLinks;i++)
		{
			String MouseClick = Keys.chord(Keys.CONTROL,Keys.ENTER);
			System.out.println(FirstColumn.findElements(By.tagName("a")).get(i).getText());
			FirstColumn.findElements(By.tagName("a")).get(i).sendKeys(MouseClick);

		}
		Thread.sleep(5000);
		/*
		 * //print each link url from first column of footer List<WebElement> url =
		 * FirstColumn.findElements(By.tagName("a")); for (WebElement url_name : url) {
		 * String url_text = url_name.getText(); System.out.println(url_text);
		 * System.out.println(url_name); if (url_text!="") { url_name.click();
		 * Thread.sleep(5000); } }
		 */

		//print each link url from first column of footer
		Set<String> S = driver.getWindowHandles();
		Iterator<String> I = S.iterator();
		System.out.println(S.size());

		while(I.hasNext())
		{
			//Take Screenshot
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh.mm.ss");
			Date dt = new Date();
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(("H:\\Project Workspace\\Project1\\Screenshots\\"+sdf.format(dt)+".png"));
			FileUtils.copyFile(src,dest);
			
			driver.switchTo().window(I.next());
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		
		
		
		
		//Files.copyFile(src, new File ("H:\\Project Workspace\\Project1\\Screenshots\\"+sdf.format(dt)+".png"));
		//Files.copyFile(src, new File ("H:\\Project Workspace\\Project1\\Screenshots\\Google.png"));
		
		/*
		 * for (int j=0;j<S.size();j++) { driver.switchTo().window(I.next());
		 * System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl()); System.out.println("/b"); }
		 */

		/*We can use either for loop or while
		 * while(I.hasNext()) { driver.switchTo().window(I.next());
		 * System.out.println(driver.getTitle());
		 * 
		 * }
		 */

		driver.close();
	}

}
