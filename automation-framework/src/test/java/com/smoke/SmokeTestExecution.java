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

	WebDriver driver;

	@BeforeTest // setup
	public void setup() {

	 driver	= new DriverManager().getDriver();//open browser+ go to URL
	}//end

	@Test // actual test
	public void loginTest() {
		//which browser + Which website ==> communication by driver
		MasterPageFactory obj = new AutomationPracticeLogin().baseLogin(driver);//Login=null

		Assert.assertTrue(obj.getSignOut().isDisplayed(), "Login Test Passed ");

	}

	@AfterTest // close/quit
	public void teardown() {
		driver.quit();
	}

}
