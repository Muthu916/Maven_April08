package com.Adactinhelper;

import org.openqa.selenium.WebDriver;


import com.pom.adactin.BookHotel_Page;
import com.pom.adactin.Login_Page;
import com.pom.adactin.LogoutPage_Adactin;
import com.pom.adactin.MyItinerary_Page;
import com.pom.adactin.SearchHotel_Page;
import com.pom.adactin.SelectHotel_Page;
import com.pom.adactin.LogoutPage_Adactin;

public class AdactinPOManager 
{
	public WebDriver driver;
	
	private Login_Page log;
	private SearchHotel_Page search;
	private SelectHotel_Page sel;
	private BookHotel_Page book;
	private MyItinerary_Page itin;
	private LogoutPage_Adactin out;

	public AdactinPOManager(WebDriver driver2) 
	{
		
		this.driver=driver2;
	}
	
	public Login_Page getInstance_Log() 
	{
		log = new Login_Page(driver);
		return log;
	}
	
	public SearchHotel_Page getInstance_Search() 
	{
		search = new SearchHotel_Page(driver);
		return search;
	}
	
	public SelectHotel_Page getInstance_Sel() 
	{
		sel=new SelectHotel_Page(driver);
		return sel;
	}
	
	public BookHotel_Page getInstance_Book() 
	{
		book = new BookHotel_Page(driver);
		return book;
	}
	
	public MyItinerary_Page getInstance_Itin() 
	{
		itin=new MyItinerary_Page(driver);
		return itin;
	}
	
	public LogoutPage_Adactin getInstance_Out() 
	{
		out = new LogoutPage_Adactin(driver);
		return out;
	}
	
	
}
