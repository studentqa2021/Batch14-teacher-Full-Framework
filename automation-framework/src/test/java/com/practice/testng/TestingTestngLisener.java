package com.practice.testng;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.AutomationPracticeLogin;
import com.generic.DriverManager;

//@Listeners(com.practice.testng.TestngListener.class)
public class TestingTestngLisener {

	int testdataExpected = 10;
	int actualDataFound = 10;

	static ExtentReports extent;
	ExtentTest test;

	@BeforeClass
	public static void startTest() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("target/ExtendsTestNGReport.html");
		repoter.config().setDocumentTitle("Automation Selenium");
		repoter.config().setReportName("Regression Test");
		repoter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));

	}

	@Test
	public void smoke() {
		ExtentTest test = extent.createTest("Smoke");
		WebDriver driver = new DriverManager().getDriver();
		new AutomationPracticeLogin().baseLogin(driver);

	}



	@AfterTest
	public void teardown() {
	
		
		extent.flush();
	}

}
