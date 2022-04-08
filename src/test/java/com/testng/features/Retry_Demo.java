package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Demo 
{
	//@Test(retryAnalyzer = Retry_Class.class)
	@Test(priority=-1)
//	@Test
	private void username() 
	{
	
		String expected_Username = "Starc123";
		String actual_Username = "Starc123";
		Assert.assertEquals(actual_Username, expected_Username);
		
	}
	@Test
	private void password()
	{
	
		String expected_Password = "Starc";
		String actual_Password = "Starc123";
		Assert.assertEquals(actual_Password, expected_Password);
	}

}
