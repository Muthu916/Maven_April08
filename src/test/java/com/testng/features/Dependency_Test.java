package com.testng.features;

import org.testng.annotations.Test;

public class Dependency_Test 
{
	@Test
	private void mobile() 
	{
	System.out.println("Mobile");

	}
	
	@Test(dependsOnMethods = "watch")
	private void offer() 
	{
		System.out.println("Offer");

	}
	
	@Test
	private void watch() 
	{
		
	System.out.println("Watch");
	
	}
	

}
