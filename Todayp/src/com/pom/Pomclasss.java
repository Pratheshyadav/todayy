package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generic.Baseeclass;

public class Pomclasss 
{

	@FindBy(id="email")
	private WebElement user_name;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass_word;
	
	public Pomclasss(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement name()
	{
		return user_name;
	}
	
	public WebElement pass()
	{
		return pass_word;
	}
}
