package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.examples.actions.FrontPageActions;
import com.examples.actions.HomePageActions;
import com.examples.base.BaseTest;
import com.examples.utils.CommonUtilities;
import com.examples.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_SD extends BaseTest{
	
	HomePageActions objHomePage=new HomePageActions();
	FrontPageActions objFrontPage=new FrontPageActions();
	
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
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		//HelperClass.openPage("https://dsportalapp.herokuapp.com/");
		System.out.println("The User is in "+driver.getTitle());

	//	objFrontPage.clickonGetStarted();
	   // String actualTitle=HelperClass.getDriver().getTitle();
	  //  System.out.println(actualTitle);
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String options) {
		//objHomePage.selectGetStarted(options);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String expectedMessage) {
//		String actualMessage=objHomePage.getErrorMessage();
//		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) {
//		objHomePage.selectDropDown(string);
		
	    	}

	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
	    
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
	    
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
//		objHomePage.clickOnSignIn();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		
		
//		objHomePage.clickOnRegister();
	    	}


}
