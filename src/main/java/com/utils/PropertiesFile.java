package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	public static String getValue(String key) throws IOException {
	String baseDir =	System.getProperty("user.dir");
	System.out.println("BaseDir is :"+baseDir);
		FileInputStream fis = new FileInputStream(baseDir+"/src/main/resources/Environment.properties");
		Properties pr = new Properties();
		pr.load(fis);
		 String value = pr.getProperty(key);
		return value;
		
		
		
		

	}
	

}
