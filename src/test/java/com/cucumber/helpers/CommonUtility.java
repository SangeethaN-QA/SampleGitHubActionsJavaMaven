package com.cucumber.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cucumber.base.BaseClass;

public abstract class CommonUtility extends BaseClass {
	
	public CommonUtility(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public static WebElement ele;
	public static String strXpath;
	
	
	public static void enter_Keys(String strXpath,String strInput)
	{
		WebElement ele = driver.findElement(By.xpath(strXpath));
		if(ele.isDisplayed())
		{
			ele.sendKeys(strInput);
		}
	}
	public static void mouseClick(String strXpath)
	{
		
		WebElement ele = driver.findElement(By.xpath(strXpath));
		Actions action = new Actions(driver);
		/*	Action mouseClick = */action.moveToElement(ele)
						.build().perform();
		
			
	}
	
	public static void Click_HeaderMenus(String strText)
	{
		strXpath = "//ul[@class='justified-menu desktop-navs settings-content responsivetabshow']//a[contains(text(),'"+strText+"')]";
		WebElement ele = driver.findElement(By.xpath(strXpath));
		Actions action = new Actions(driver);
		action.moveToElement(ele)
						.build().perform();
		
	}
	
	
	public static void Click_UserBlock(String strText)
	{
		strXpath = "//ul[@class='userBlock']//a[contains(text(),'"+strText+"')]";
		WebElement ele = driver.findElement(By.xpath(strXpath));
		ele.click();
//		Actions action = new Actions(driver);
//		/*	Action mouseClick = */action.moveToElement(ele)
//						.click().build().perform();
		
	}
	
	

}
