package com.singleton.property;

import java.io.IOException;

public class manager_class {
	public static manager_class manager;
	public static data_reader reader;
	private manager_class()
	{
		
	}
	public static manager_class get_instance()
	{
		if(manager == null)
		{
		manager = new manager_class();
		}
		return manager;
	}
public data_reader reader_instance() throws IOException
{
	if(reader == null) 
	{
	reader = new data_reader();
	}
	
	return reader;
}
}
