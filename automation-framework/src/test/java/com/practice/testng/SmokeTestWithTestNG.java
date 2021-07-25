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
		System.out.println("setup");
	}

	@Test(groups = {"Smoke"})
	public void getLogin() throws Throwable {

	System.out.println("Login");
	}

	@Test(groups = {"Regression"})
	public void getDress() throws Throwable {//2nd

	System.out.println("Dress");
	}
	@Test(groups = {"Regression"})
	public void getWoman() throws Throwable {//1st

		System.out.println("Woman");
	}
	
	@Test(groups = {"Regression"})
	public void getTshirt() throws Throwable {//3rd
		System.out.println("T shirt");
	
	}

	@AfterTest
	public void teardown() {
		System.out.println("close");
	}

}
