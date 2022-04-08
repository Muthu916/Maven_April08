package com.API.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation 
{
	@Test
	public void data_Validation()
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users/2");
		String string = response.asString();
		System.out.println(string);
		int actualCode = response.getStatusCode();
		Assert.assertEquals(200, actualCode);
		
		System.out.println("Data Validation");
		
		
		
	}

}
