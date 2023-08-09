  package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.examples.actions.FrontPageActions;
import com.examples.base.BaseTest;
import com.examples.locators.FrontPageLocators;
import com.examples.utils.CommonUtilities;
import com.examples.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrontPage_SD extends BaseTest{
	
	FrontPageLocators objFrontPage=new FrontPageLocators(driver);
	static WebDriver driver;
	String url;
	CommonUtilities common=new CommonUtilities();
	
	
	
	@BeforeMethod
	public void beforeMethod() throws Exception
	{
		driver=getDriver();
		driver.manage().window().maximize();
		url=common.getProperty(url);
	}
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	    //HelperClass.openPage("https://dsportalapp.herokuapp.com/");
		//HelperClass.openPage(null);
		System.out.println("The User is in "+driver.getTitle());
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		objFrontPage.clickonGetStarted();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	   //NumpyNinja
	   System.out.println(driver.getTitle());
	  // if(HelperClass.getDriver().getPageSource())
	   Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	   System.out.println("The User is on Home Page");
	}
	

}
