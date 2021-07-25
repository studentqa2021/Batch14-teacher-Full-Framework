package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	WebDriver driver;
	MasterPageFactory obj;

	@Given("Setup driver and send URL")
	public void setup_driver_and_send_URL() {
		driver = new DriverManager().getDriver();// open browser+ go to URL

	}

	@When("login with valid credential")
	public void login_with_valid_credential() {
		obj = new AutomationPracticeLogin().baseLogin(driver);// Login=null
	}

	@Then("validate login and close the browser")
	public void validate_login_and_close_the_browser() {
		Assert.assertTrue(obj.getSignOut().isDisplayed(), "Login Test Passed ");
		driver.close();

	}

}
