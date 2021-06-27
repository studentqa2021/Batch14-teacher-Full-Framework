package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class AutomationPracticeLogin {

	public void baseLogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(BaseConfig.getConfigValue("URL"));//****
		driver.manage().window().maximize();
		MasterPageFactory obj = new MasterPageFactory(driver);
		obj.getSigninbtn().click();//1
		obj.getEmail().sendKeys(BaseConfig.getConfigValue("user"));//****
		obj.getPass().sendKeys(BaseConfig.getConfigValue("password"));//**** criminal 
		obj.getLoginbtn().click();

	}
}
