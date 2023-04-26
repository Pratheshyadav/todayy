package com.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseeclass
{
	public WebDriver driver;
	@BeforeMethod
	public void opp() throws IOException
	{
		String k = getdatapropertyvalue.getdata("key");
		String v = getdatapropertyvalue.getdata("value");
		String u = getdatapropertyvalue.getdata("url");
		System.setProperty(k, v);
		driver=new FirefoxDriver();
		driver.get(u);
	}
	
	@AfterMethod
	public void closeapp()
	{
		//driver.quit();
	}
}
