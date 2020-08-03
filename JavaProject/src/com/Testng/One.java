package com.Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class One {

	@Test
	public void MethodOne()
	{	
		//System.out.println(print(1));
		String s = ("Hello");
		//System.out.println("Apple".compareTo("banana"));
		System.out.println("B".compareTo("A"));
		/*
		 * int a = 123451234512345; System.out.println(a);
		 */
		for (int i=0; i<s.length();i++)
		{
			//System.out.println(s.charAt(i+1));
			//System.out.println(s.indexOf("l"));
			//System.out.println(i);
		}
	}

	@Test
	public void MethodTwo()
	{	
		//System.out.println(print(1));
		String s = ("Bye");
		System.out.println("Apple".compareTo("banana"));
		/*
		 * int a = 123451234512345; System.out.println(a);
		 */
		for (int i=0; i<s.length();i++)
		{
			System.out.println(i);
			//System.out.println(s.charAt(i+1));
		}
	}

	@AfterTest (enabled=false)
	public void CloseActiveBrowser() {
		System.out.println("Closing active browser window");
		System.setProperty("Webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); driver.close(); }

}
