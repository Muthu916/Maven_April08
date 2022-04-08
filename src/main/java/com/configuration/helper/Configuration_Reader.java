package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader 
{
	public static Properties p;
	public Configuration_Reader() throws IOException 
	{
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\src\\main\\java\\com\\testdata\\property\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		
		
		p = new Properties();
		p.load(fis);
	
	}
	public String get_Config_Url()
	{
		String url = p.getProperty("url");
		return url;
		
	}
	
public String get_Config_Email()
{
	String email = p.getProperty("email");
	return email;
}

public String get_Config_Password()
{
	String password = p.getProperty("password");
	return password;
}

}
