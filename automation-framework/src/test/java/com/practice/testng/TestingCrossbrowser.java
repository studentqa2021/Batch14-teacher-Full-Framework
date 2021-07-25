package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestingCrossbrowser {

	public void getBrower(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {//1
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println("Browser opened = "+browser);
			driver.quit();
		}

		else if (browser.equalsIgnoreCase("ie")) {//2
			System.setProperty("webdriver.ie.driver", "./Driver/IEDriverServer.exe");
			WebDriver driver1 = new InternetExplorerDriver();
			driver1.get("https://www.Amazon.com/");
			System.out.println("Browser opened = "+browser);
			//driver1.close();//not working
			//System.exit(0);
		}

		else if (browser.equalsIgnoreCase("firefox")) {//3
			// firefox = driver name Gheko driver
			// code
			System.out.println("Browser opened = "+browser);
		}else {//4
			System.out.println("Not found any browser");
		}

	}

	public static void main(String[] args) {
		new TestingCrossbrowser().getBrower("chrome");
		new TestingCrossbrowser().getBrower("chrome");//100% zoom
		new TestingCrossbrowser().getBrower("chrome");
	}

}
