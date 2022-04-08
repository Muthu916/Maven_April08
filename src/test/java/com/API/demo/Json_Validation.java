package com.API.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Validation 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		File f = new File("C:\\Users\\Muthu\\eclipse-workspace\\March_First\\src\\test\\java\\com\\API\\payload\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) obj;
		Object object = jsonobj.get("Team");
		String value = object.toString();
		System.out.println("Team: " +value);
		
		
		
	}

}
