package com.cucumber.helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cucumber.base.BaseClass;

public class ApplicationKeywords extends BaseClass {




	public ApplicationKeywords(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void verify_applicationTitle(String expectTitle)
	{
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectTitle, actualTitle);
		System.out.println("The actualTitle ## '"+actualTitle+"' and expectTitle ## '"+expectTitle+"' both are Equals");
	}

	public static void verify_getTextValue(String strXpath,String expectText)
	{
		String actualText = driver.findElement(By.xpath(strXpath)).getText();
		System.out.println(" actual Text ####  " +actualText);
		Assert.assertEquals(expectText, actualText);
		System.out.println("The ActualText ## '"+actualText+"' and ExpectedText ## '"+expectText+"' both are Equals");
	}

	public static void enterValue(String strXpath,String strText)
	{
		WebElement textBox = driver.findElement(By.xpath(strXpath));
		textBox.clear();
		textBox.sendKeys(strText);


	}

	public static void click_Button(String strXpath) throws InterruptedException
	{

		WebElement btn = driver.findElement(By.xpath(strXpath));
		Thread.sleep(2000);
		btn.click();

	}
	
	public static void closeApp()
	{
		driver.close();
	}

	//	public static boolean enterValue(String strXpath,String strText)
	//	{
	//		boolean isTextEntered = false;
	//		try {
	//			if(strText != null)
	//			{
	//				WebElement textBox = driver.findElement(By.xpath(strXpath));
	//				textBox.clear();
	//				textBox.sendKeys(strText);
	//				isTextEntered = true;
	//			}else {
	//				throw new Exception("Text is empty");
	//			}
	//		}catch (Exception e) {
	//			strText = null;
	//			Assert.fail("Text is not entered");
	//		}
	//		return isTextEntered;
	//
	//	}

//	public static boolean click_Button(String strXpath)
//	{
//		boolean isBtnClicked = false;
//		try {
//			WebElement btn = driver.findElement(By.xpath(strXpath));
//			if(btn !=null)
//			{
//				Thread.sleep(2000);
//				btn.click();
//				isBtnClicked = true;
//			}else {
//				throw new Exception("button is not present");
//			}
//		}catch(Exception e)
//		{
//			strXpath = null;
//			Assert.fail("Button is not clicked");
//		}
//		return isBtnClicked;
//
//
//	}

}
