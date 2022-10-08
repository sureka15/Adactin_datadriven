package com.singleton.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class data_reader {
	public static Properties p;
	
	public data_reader() throws IOException
	{
		File f = new File("E:\\selenium\\demo_adactin\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		 p = new Properties();
		p.load(fis);
	}
	
	public  String get_url()
	{
		String url = p.getProperty("url");
		return url;
	}
	public  String get_username()
	{
		String user = p.getProperty("username");
		return user;
	}
	public  String get_password()
	{
		String pass = p.getProperty("password");
		return pass;
	}

}
