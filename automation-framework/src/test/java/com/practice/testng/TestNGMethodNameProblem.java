package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMethodNameProblem {

	//dependsOnMethods = {"dress"}
	@Test
	public void login() {
		System.out.println("This my login test");
	}

	@Test
	public void dress() {
		System.out.println("This my dress selection test");
	}
	@Test
	public void cart() {
		System.out.println("This is my Cart test");
	}
	@Test
	public void payment() {
		System.out.println("This is my payment test");
	}
	
}
