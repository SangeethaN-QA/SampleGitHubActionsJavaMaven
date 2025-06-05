package com.cucumber.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.cucumber.helpers.CommonUtility;

public class Login_UI extends CommonUtility{

	public Login_UI(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public static final String title_LoginForm  = "//div[@id='login-form-container']//p[contains(text(),'Welcome to Yatra!')]";	
	public static final String txt_EmailId = "//input[@id='login-input']";	
	public static final String txt_Passwd = "//input[@placeholder='Enter your password']";	
	public static final String btn_Continue = "//li//button[@id='login-continue-btn']";	
	public static final String title_UserName = "//a[contains(text(),'Hi Sangeetha')]";	
	public static final String txt_Offers = "//h2[contains(text(),'Great Offers & Amazing Deals')]";
	public static final String btn_Login = "//button[@id='login-submit-btn']";
	public static final String errMsg_InvalidLogin = "//p[@id='login-error']";
	
	
	public static final String search_input = "//input[@title=\"Search\"]";
	
	

	@FindBy
	public String str_test;
}
