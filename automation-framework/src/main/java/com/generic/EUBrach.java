package com.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class EUBrach implements BaseLogin {
// inheritance + poly(override)
	@Override
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); // for chrome
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");// 1
		driver.manage().window().maximize();// max size
		System.out.println(driver.getTitle());
		// signin
		WebElement signinbtn = driver.findElement(By.xpath("//*[@class='login']"));// signinbtn
		Highlighter.addColor(driver, signinbtn);//color
		signinbtn.click();
		System.out.println(driver.getTitle());
		//email
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
		Highlighter.addColor(driver, email);
		email.sendKeys("sarowerny@gmail.com");
		//pass
		WebElement password = driver.findElement(By.xpath("//*[@id='passwd']"));
		Highlighter.addColor(driver, password);
		password.sendKeys("student");

		// last sign in btn
		WebElement lastSigninbtn = driver.findElement(By.xpath("//*[@class='icon-lock left']"));
		Highlighter.addColor(driver, lastSigninbtn);
		lastSigninbtn.click();

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File("./ScreenShot/login.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();

	}

}
