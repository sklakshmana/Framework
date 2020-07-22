package com.learnautomation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider()
	{
		File src=new File("./Config/Config.properties");
		
		FileInputStream fis;

		pro=new Properties();
		
		try {
			fis = new FileInputStream(src);
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Not able to load config file "+e.getMessage());
		}
		
	}
	
	public String getDataFromConfig(String keyToSearch)
	{
		
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getStagingURL()
	{
		return pro.getProperty("prodURL");
	}

}
