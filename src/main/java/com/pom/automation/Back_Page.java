package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_Page 
{
	public WebDriver driver;

	@FindBy(xpath="//img[@alt='My Store']")
	private WebElement store;

	public Back_Page(WebDriver driver2) 
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getStore() {
		return store;
	}
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;

	public WebElement getWomen()
	{
		return women;
	}
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;

	public WebElement getDress()
	{
		return dress;
	}
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	
	public WebElement getTshirt()
	{
		return tshirt;
	}
}
