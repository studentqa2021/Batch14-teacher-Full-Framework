package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;
import com.util.ScreenShot;

public class BaseLoginPHPTravel {

	public void getlogin() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// 1
		driver.navigate().to("https://phptravels.com/demo/");// 2
		// screenshot =picture
		ScreenShot.getScreenShot(driver, "homePage");// 3 >> takescreenshot interface
		driver.manage().window().maximize();
		// 4 find element
		WebElement singinbtn = driver.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
		// highlighter=color
		Highlighter.addColor(driver, singinbtn);// 5 >> javaScriptExecutor interface
		// screenshot =picture
		ScreenShot.getScreenShot(driver, "BeforeClick");
		singinbtn.click();// 6
		// screenshot =picture
		ScreenShot.getScreenShot(driver, "AfterClick");
	}

}
