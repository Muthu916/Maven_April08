package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test 
{
	@Test
	@Parameters({"username", "password"})
	private void credentials(@Optional("Smith") String username, String password)//if we give username reference variable as "Username" then optional name will invoke
	{
		System.out.println("Username:" +username);
		System.out.println("Password:" +password);
	}

}
