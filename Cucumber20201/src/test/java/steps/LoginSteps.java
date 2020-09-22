package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.BrowserFactory;

public class LoginSteps {
    WebDriver driver=BrowserFactory.startBrowser();
	 
	@Given("^user is already in Login Page$")
	public void user_is_already_in_Login_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^After login close the browser$")
	public void after_login_close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	
	
	
	
	
	
}
