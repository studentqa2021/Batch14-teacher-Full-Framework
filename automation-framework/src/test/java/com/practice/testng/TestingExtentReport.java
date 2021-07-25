package com.practice.testng;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;

//@Listeners(com.practice.testng.TestngListener.class)
public class TestingExtentReport {

	static ExtentReports extent;
	ExtentTest test;
	static WebDriver driver;

	@BeforeTest
	public static void startTest() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("target/Batch14.html");
		repoter.config().setDocumentTitle("Testng Automation");
		repoter.config().setReportName("Smoke test");
		repoter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

		driver = new DriverManager().getDriver();
	}

	@Test
	public void login() {
		 test = extent.createTest("Login");

		//new AutomationPracticeLogin().baseLogin(driver);

	}

	@Test
	public void dress() {
		 test = extent.createTest("dress");
		//System.out.println(2 / 0);
		// code dress
		Assert.assertEquals(2, 4);//fail

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		extent.flush();
	}

}
