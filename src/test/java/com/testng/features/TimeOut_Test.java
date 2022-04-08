package com.testng.features;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut_Test 
{
	
	@Test(timeOut=8000)
	private void browser_Execution()throws Throwable 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthu\\eclipse-workspace\\March_First\\Driver_2\\chromedriver.exe");
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
//		WebDriver driver = new ChromeDriver(); 
//		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(1000);
		System.out.println("URL Launch");	
		
		Thread.sleep(2000);
		System.out.println("Credentials entered");

		Thread.sleep(1000);
		System.out.println("Next Page");
	}
}
