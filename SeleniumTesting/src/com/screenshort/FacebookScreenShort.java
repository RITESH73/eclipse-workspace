package com.screenshort;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Library.Utility;

public class FacebookScreenShort {
	
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Test
	public void takeScreenShorts() throws Exception {
	driver.get("https://www.facebook.com");
	//Utility.captureScreenshot(driver, "browserStarted");
	driver.manage().window().maximize();	
	//Utility.captureScreenshot(driver, "afterMaxming");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Ritesh");

	}

	@AfterMethod
	public void tearDown(ITestResult results) {
		
		if(ITestResult.FAILURE==results.getStatus()) {
			
			Utility.captureScreenshot(driver, results.getName());
			
			driver.quit();
		} else {
			
			driver.quit();
		}
	}
	
}
