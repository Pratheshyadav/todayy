package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getdatapropertyvalue 
{

	public static String getdata(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./property/extend.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String v = prop.getProperty(key);
		return v;
		
	}
}
