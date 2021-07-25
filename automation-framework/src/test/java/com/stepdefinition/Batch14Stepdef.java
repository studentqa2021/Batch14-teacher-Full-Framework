package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Batch14Stepdef {
	WebDriver driver;
	MasterPageFactory pf;
	@Given("open browser and send URL")
	public void setup() {
		
		driver	= new DriverManager().getDriver();//open browser+ go to URL
	}
	
	@When("login with valid credentials")
	public void getlogin() {
		 pf = new AutomationPracticeLogin().baseLogin(driver);//Login=null
		
	}
	@Then("Check login was success")
	public void getvalidation() {
		Assert.assertTrue(pf.getSignOut().isDisplayed(), "Login Test Passed ");
		driver.quit();
	}

}
