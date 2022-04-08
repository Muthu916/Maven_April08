package com.testng.features;

import org.testng.annotations.Test;

public class Groups_Concept 
{

	@Test(groups="Books")
	private void books()
	{
		System.out.println("Books");
	}
	
	@Test(groups="Social Media")
	private void whatsapp() 
	{
	
		System.out.println("Whatsapp");
	}
	
	@Test(groups="Social Media")
	private void instagram() 
	{
	
		System.out.println("Instagram");
	}
	
	@Test(groups="Music")
	private void spotify() 
	{
	
		System.out.println("Spotify"); 	
	}
	
	
	@Test(groups="Music")
	private void wynkMusic() 
	{
		System.out.println("Wynk Music");

	}
}
