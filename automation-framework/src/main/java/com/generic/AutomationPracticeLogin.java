package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

public class AutomationPracticeLogin {

	public  MasterPageFactory baseLogin(WebDriver driver) {// parameter 
		
		MasterPageFactory obj = new MasterPageFactory(driver);
		Highlighter.addColor(driver, obj.getSigninbtn());
		ScreenShot.getScreenShot(driver, "Home Page");
		obj.getSigninbtn().click();//1
		Highlighter.addColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));//****
		Highlighter.addColor(driver, obj.getPass());
		obj.getPass().sendKeys(BaseConfig.getConfigValue("password"));//**** criminal 
		Highlighter.addColor(driver, obj.getLoginbtn());
		ScreenShot.getScreenShot(driver, "Login Page");
		obj.getLoginbtn().click();
	
//		//signout
//		boolean loginStatus = false;
//		try {
//			loginStatus = obj.getSignOut().isDisplayed();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//java condition ==> if else conditional statement
//		
//		if(loginStatus) {//true
//			
//			System.out.println("Login Passed");
//			// run code
//		}else {// false
//			System.out.println("Login failed");
//			//run code
//		}
		
		return obj;
	}
}
