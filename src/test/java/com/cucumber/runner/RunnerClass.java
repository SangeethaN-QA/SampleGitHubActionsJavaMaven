package com.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/resources/features"
		 ,glue={"com.cucumber.steps"}
		 ,tags = "@offers"
		 ,plugin = { "pretty" ,"html:target/Cucumber-Reports.html" ,
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		 ,monochrome = true
	
		
		 )
public class RunnerClass {
	
	

}
