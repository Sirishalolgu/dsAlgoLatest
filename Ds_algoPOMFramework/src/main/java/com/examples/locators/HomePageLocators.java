package com.examples.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.examples.base.BasePage;

public class HomePageLocators extends BasePage{
	
	public HomePageLocators(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}

	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Data Structures-Introduction')]")
	public WebElement getStartedDataStructure;
	
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Array')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Array')]")
	public WebElement getStartedArray;
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Linked List')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Linked List')]")
	public WebElement getStartedLinkedList;
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Stack')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Stack')]")
	public WebElement getStartedStack;
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Queue')]
	
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Queue')]")
	public WebElement getStartedQueue;
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Tree')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Tree')]")
	public WebElement getStartedTree;
	
	
	//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Graph')]
	@FindBy(xpath="//a[contains(text(),'Get Started')]/..//h5[contains(text(),'Graph')]")
	public WebElement getStartedGraph;
	
	//a[contains(text(),'Sign in')]
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement SignIn;
	
	//a[contains(text(),'Register')]
	@FindBy(xpath="//a[contains(text(),'Register')]")
	public WebElement Register;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	public WebElement dataStructureDropdown;
	
	//div[@class='alert alert-primary']
	@FindBy(xpath="//div[@class='alert alert-primary']")
	public WebElement errorMessage;
	
	
	 public void selectGetStarted(String options) {
	    	switch (options) {
			case "Datastructures":
				getStartedDataStructure.click();
			case "Arrays":
				getStartedArray.click();
			case "Linkedlist":
				getStartedLinkedList.click();
			case "Stack":
				getStartedStack.click();
			case "Queue":
				getStartedQueue.click();
			case "Tree":
				getStartedTree.click();
			case "Graph":
				getStartedGraph.click();
				
				break;

			default:
				break;
			}
	       }
	    	
	    	
	    	public void selectDropDown(String options) {
	    		
	    		Select dropdown=new Select(dataStructureDropdown);
	    		dropdown.selectByValue(options);
	    		
	    		
	    	}
	    	public void clickOnSignIn()
	    	{
	    		SignIn.click();
	    	}
	    
	    	
	    	public void clickOnRegister()
	    	{
	    		Register.click();
	    	}
	    
	    	
	    	public String getErrorMessage()
	    	{
	    		return errorMessage.getText();
	    	}
	    

	
	
}
