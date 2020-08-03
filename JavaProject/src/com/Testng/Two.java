package com.Testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Two{

	@Test(enabled = false)
	public void MethodTwo()
	{
		System.out.println("Two");
	}
	
	@Test(groups= {"smoke"})
	@Parameters({"XML_Parameter"})
	public void SmokeTest1(String XML_Parameter)
	{
		System.out.println("Smoke test 1");
		System.out.println(XML_Parameter);
	}
	@Test(groups= {"smoke"})
	public void SmokeTest2()
	{
		System.out.println("Smoke test 2");
	}

	@Test(dependsOnMethods = {"A","SmokeTest1"})
	public void DependOn()
	{
		System.out.println("This method depend on A");
	}
	
	@Test(enabled = true)
	public void A()
	{
		System.out.println("Plan method A");
	}

}
