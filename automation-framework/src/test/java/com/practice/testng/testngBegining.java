package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;

public class testngBegining {
	WebDriver driver ;
	@BeforeTest
	public void setup() {// open

		DriverManager obj = new DriverManager();
		 driver =obj.getDriver();

	}

	@Test// do nothing
	public void login() {
		AutomationPracticeLogin obj = new AutomationPracticeLogin();
		//obj.baseLogin(driver);

	}
	
	@Test(dependsOnMethods = {"login"})
	public void product() {
		System.out.println("all dress info");

	}
	@Test(dependsOnMethods = {"product"})
	public void cart() {
		System.out.println("all cart info");

	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
