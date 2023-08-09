package com.examples.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	static WebDriver driver;
	
	public WebDriver getDriver() {
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
			return driver;
		
	}
}
