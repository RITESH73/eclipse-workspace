package com.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting {
	
	WebDriver driver;
	@Test
	@Parameters({"browser"})
	
	public void MultiBrowser (String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
				
			driver = new FirefoxDriver();
			
		} else if(browserName.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver","C:/SeleniumDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
		
		
	}

}
