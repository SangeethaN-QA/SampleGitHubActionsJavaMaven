package com.cucumber.helpers;

import java.util.concurrent.TimeUnit;

import org.apache.commons.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;

public class ConfigPath extends BaseClass {
	
	public ConfigPath(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static String browser;
	public static int implicitWaitInSeconds=10;
	public static Configuration config = null;
	
	
	//public static String applicationURL = "https://www.yatra.com/";
	public static String applicationURL = "https://www.google.com/";
	
	
	public static String driverPath = "src\\test\\resources\\drivers\\chromedriver.exe";
	
	
	public static void launchApplication(){

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(implicitWaitInSeconds, TimeUnit.SECONDS);
	}
	
	
	
	
	public static void closeBrowser()
	{
		driver.quit();
	}
	





}
