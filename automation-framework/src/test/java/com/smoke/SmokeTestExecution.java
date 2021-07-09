package com.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

public class SmokeTestExecution {// Java + Selenium

	WebDriver driver2;//global ==> instance

	@BeforeTest // setup
	public void setup() {

		driver2 = new DriverManager().getDriver();
	}

	@Test // actual test
	public void loginTest() {
		MasterPageFactory obj = new AutomationPracticeLogin().baseLogin(driver2);

		Assert.assertTrue(obj.getSignOut().isDisplayed(), "Login Test Passed ");

	}

	@AfterTest // close/quit
	public void teardown() {
		driver2.quit();
	}

}
