package com.facebooklogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	@BeforeSuite
		public void LunchBrowswe() {
			
		System.setProperty("webdriver.chrome.driver","C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 700);");
		}
	
	
		@Parameters({"fName, lName"})
		@Test
		public void fillForm(String fName, String lName ) {	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lName);
		
		}
			
	}
	
	

	


