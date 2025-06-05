package com.cucumber.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.cucumber.helpers.CommonUtility;

public class Offers_UI extends CommonUtility{

	public Offers_UI(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	public static final String lnk_Offers = "//a[@title='Offers']";
	public static final String offers_title = "//p[@class='wfull offer-heading']";
	

	@FindBy
	public String str_test;
}
