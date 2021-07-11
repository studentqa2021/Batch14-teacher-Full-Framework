package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEnable_DisableAnyTest {

	WebDriver driver;

	@BeforeTest
	public void setup() throws Throwable {
		System.out.println("This before test = setup");
	}
	@Test()
	public void getLogin() {
		System.out.println("This my login test");
	}
	@Test()
	public void dress() {
		System.out.println("This my dress selection test");
	}
	@Test(enabled = false)
	public void cart() {//do not run or disable or stop
		System.out.println("This is my Cart test");
	}
	@Test()
	public void payment() {
		System.out.println("This is my payment test");
	}
	@AfterTest
	public void teardown() {
		System.out.println("After Test = any thing close");
	}
}
