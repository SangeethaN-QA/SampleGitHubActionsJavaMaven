package com.cucumber.steps;

import com.cucumber.helpers.ApplicationKeywords;
import com.cucumber.helpers.CommonUtility;
import com.cucumber.helpers.ConfigPath;
import com.cucumber.objectrepo.Login_UI;
import com.cucumber.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {
	

	@Given("^I have launch yatra application$")
	public void i_have_launch_yatra_application() throws Throwable {
		ConfigPath.launchApplication();
		LoginPage.enterValue();
	}
	
	
	
	@Then("^I can see the yatra home page$")
	public void i_can_see_the_yatra_home_page() throws Throwable {
			ApplicationKeywords.
			verify_applicationTitle("Flight, Cheap Air Tickets , Hotels, Holiday, Trains Package Booking - Yatra.com");
	}
	
	
	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		LoginPage.click_LoginBtn();
	}
	
	@Then("^I can see the login page$")
	public void i_can_see_the_login_page() throws Throwable {
		ApplicationKeywords.verify_getTextValue(Login_UI.title_LoginForm,"Welcome to Yatra!");
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" to login page$")
	public void i_enter_and_to_login_page(String username,String pwd) throws Throwable {
		LoginPage.login_toApplication(username,pwd);
	}
	
	
	@Then("^I can see the login user name$")
	public void i_can_see_the_login_user_name() throws Throwable {
		ApplicationKeywords.verify_getTextValue(LoginPage.title_UserName,"Hi Sangeetha");
		ConfigPath.closeBrowser();
	}
	
	/***
	 * Check Invalid Email id Error message
	 * 
	 * ****/
	
	@When("^I enter invalid username \"([^\"]*)\" to login page$")
	public void i_enter_invalid_username_to_login_page(String username) throws Throwable {
		LoginPage.enter_InvalidUserName_LoginPage(username);
		
	}
	
	@Then("^I can see the invalid email id error message$")
	public void i_can_see_the_invalid_email_id_error_message() throws Throwable {
		LoginPage.getErrorMsg("You have entered an invalid Email Id. Please try again.");
		ConfigPath.closeBrowser();
	}
	
	/***
	 * Check Invalid Password Error message
	 * 
	 * ****/
	
	@When("^I enter invalid password \"([^\"]*)\" to login page$")
	public void i_enter_invalid_password_to_login_page(String pwd) throws Throwable {
		LoginPage.enter_InvalidPwd_LoginPage(pwd);
	}
	
	@Then("^I can see the invalid password error message$")
	public void I_can_see_the_invalid_password_error_message() throws Throwable {
		LoginPage.getErrorMsg("Username or Password is invalid.");
		ConfigPath.closeBrowser();
	}
	
	
}
