package com.examples.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonUtilities {
	
	public String getProperty(String Key) throws Exception {
		
		
		String sPath="C:\\Users\\cnudr\\eclipse-workspace\\Ds_algoPOMFramework\\properties\\application.properties";
		FileInputStream fileinput=new FileInputStream(sPath);
		Properties prop=new Properties();
		prop.load(fileinput);
		String value=prop.getProperty(Key);
		return value;
		
	}

}
