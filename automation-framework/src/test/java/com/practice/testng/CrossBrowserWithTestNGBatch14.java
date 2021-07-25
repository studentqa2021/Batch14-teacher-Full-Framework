package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserWithTestNGBatch14 {
	
	
	@BeforeTest
	public void getsetup() {
		//no use
	}
	
	@Test
	@Parameters("browser")
	public void getTest(String browser) {
		
		new TestingCrossbrowser().getBrower(browser);
		
		
	}
	
	
	@AfterTest
	public void teardwon() {
		//not
		
	}
	

}
