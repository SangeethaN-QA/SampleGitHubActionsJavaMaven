package com.cucumber.steps;

import com.cucumber.helpers.ApplicationKeywords;
import com.cucumber.helpers.CommonUtility;
import com.cucumber.helpers.ConfigPath;
import com.cucumber.objectrepo.Login_UI;
import com.cucumber.objectrepo.Offers_UI;
import com.cucumber.page.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OffersSteps  {
	
	
	
	@Then("^I click on offers field$")
	public void clickOffersLink() throws Throwable {
		ApplicationKeywords.click_Button(Offers_UI.lnk_Offers);
	}
	
	@When("^I can see the offers page$")
	public void VerifyOffersPage() throws Throwable {
		ApplicationKeywords.verify_getTextValue(Offers_UI.offers_title, "Fly & Save! Get Amazing Deals on Domestic Flight Bookings.");
		//ApplicationKeywords.closeApp();
		
	}
	
}
	