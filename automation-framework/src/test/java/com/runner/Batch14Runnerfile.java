package com.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(publish = true,
plugin = { "pretty", 
		"html:target/site/cucumber-pretty", 
		"rerun:target/rerun.txt",
	    "json:target/cucumber.json",
	},

	features = { "./src/test/resources/Batch14Login.feature" }, 
	glue = { "com.stepdefinition" }, // step def package name
	monochrome =true
	//monochrome = true, dryRun = false, strict = true
	// ,tags= {"@Function"}

)
public class Batch14Runnerfile extends AbstractTestNGCucumberTests {
	
	@BeforeTest//hooks
	public void setup() {
		
	}
	@Test//hooks
	public void test() {
		
		
	}
	@AfterTest//hooks
	public void teardown() {
		
	}
	
	

}
