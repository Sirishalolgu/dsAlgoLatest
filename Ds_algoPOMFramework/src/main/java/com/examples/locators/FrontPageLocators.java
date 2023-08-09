package com.examples.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.examples.base.BasePage;

public class FrontPageLocators extends BasePage{

	
	public FrontPageLocators(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='btn']")
	public WebElement getStarted;
	
	public void clickonGetStarted()
	   {
		   getStarted.click();
	   }

}
