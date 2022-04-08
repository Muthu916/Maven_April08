package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Shirt 
{
	public WebDriver driver;
	@FindBy(xpath="(//a[normalize-space()='Faded Short Sleeve T-shirts'])[1]")
	private WebElement shirt;

	public Click_Shirt(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getShirt() 
	{
		return shirt;
	}
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[2]")
	private WebElement wdress;

	public WebElement getWdress()
	{
		return wdress;
	}

	@FindBy(xpath="//a[normalize-space()='Faded Short Sleeve T-shirts']")
	private WebElement wtshirt;
	
	public WebElement getWTshirt()
	{
		return wtshirt;
	}
	
}
