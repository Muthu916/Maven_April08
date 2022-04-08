package com.API.demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base_class.Base_Class;

import cucumber.api.java.cs.A;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataValidation_Adaction extends Base_Class 
{
public static String path = "C:\\Users\\Muthu\\eclipse-workspace\\March_First\\API_Adactin_Hotel.xlsx";

	@BeforeTest
	private void data_Validation() throws Exception
	{
		RestAssured.baseURI=adactin_Test_Data(path,1,1);
		System.out.println("Data Validation Successfully");
		
	}
	
	
	@Test(priority =-1)
	private void searchHotel_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,2,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,2,3), actualCode1); 
	System.out.println("Search Hotel Validation Successfully");
	
}
	
	@Test
	private void selectHotel_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,3,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,3,3), actualCode1);
	System.out.println("Select Hotel Validation Successfully");
}
	
	@Test
	private void bookHotel_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,4,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,4,3), actualCode1);
	System.out.println("Book Hotel Validation Successfully");
}
	@Test
	private void bookingConfirm_Hotel_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,5,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,5,3), actualCode1);
	System.out.println("Booking confirm Validation Successfully");
}
	
	
	@Test
	private void Itinerary_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,6,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,6,3), actualCode1);
	System.out.println("Book Itinerary Hotel Validation Successfully");
}
	
	@Test
	private void Logout_Validate() throws IOException 
	{
	RestAssured.baseURI=adactin_Test_Data(path,1,1);
	RequestSpecification request = RestAssured.given();
	Response response = request.get(adactin_Test_Data(path,7,2));
	String string = response.asString();
	System.out.println(string);
	int actualCode = response.getStatusCode();
	System.out.println(actualCode);
	String actualCode1 = Integer.toString(actualCode);
	Assert.assertEquals(adactin_Test_Data(path,7,3), actualCode1);
	System.out.println("Logout Validation Successfully");
}
		
	}

