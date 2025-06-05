package com.cucumber.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cucumber.helpers.ApplicationKeywords;
import com.cucumber.helpers.CommonUtility;

public class LoginPage extends CommonUtility {

	
	public LoginPage(WebDriver driver) {
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
	
	@FindBy(xpath="//input[@id='login-input']")
	public WebElement loginBtn;
	
	public static void enterValue()
	{
		enter_Keys(search_input, "Apple");
	}
	public static void click_LoginBtn()
	{
		Click_HeaderMenus("My Account");
		Click_UserBlock("Login");
	}
	
	public static void login_toApplication(String username,String pwd) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_EmailId, username);
		ApplicationKeywords.click_Button(btn_Continue);
		ApplicationKeywords.enterValue(txt_Passwd, pwd);
		ApplicationKeywords.click_Button(btn_Login);
	}
	
	public static void enter_InvalidUserName_LoginPage(String username) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_EmailId, username);
		ApplicationKeywords.click_Button(btn_Continue);
		
	}
	
	public static void enter_InvalidPwd_LoginPage(String pwd) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_Passwd, pwd);
		ApplicationKeywords.click_Button(btn_Continue);
		
	}
	
	public static void getErrorMsg(String expectErrorMsg)
	{
		ApplicationKeywords.verify_getTextValue(errMsg_InvalidLogin,expectErrorMsg);
		
	}
}
