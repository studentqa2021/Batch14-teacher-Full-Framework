package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;
import com.generic.MasterPageFactory;

public class SmokeTestWithTestNG {

	WebDriver driver;
	MasterPageFactory obj;

	@BeforeTest
	public void getDriverSetup() throws Throwable {
		driver = new DriverManager().getDriver();
	}

	@Test
	public void getLogin() throws Throwable {

		obj = new AutomationPracticeLogin().baseLogin(driver);

		Assert.assertTrue(obj.getSignOut().isDisplayed(), "Login Test Passed ");
	}

	@Test
	public void getDressNo() throws Throwable {

	
	}

	@AfterTest
	public void getDriceClose() {
		driver.quit();// close the browser

	}

}
