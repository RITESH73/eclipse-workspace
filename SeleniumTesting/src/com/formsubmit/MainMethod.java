package com.formsubmit;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/SeleniumDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 1250);");
		//driver.findElement(By.linkText("Link Test")).click();
		//jse.executeScript("scroll(10, 250);");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritesh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mehta");
		driver.findElement(By.xpath("//input[@id='sex-0']")).click();
		driver.findElement(By.xpath("//input[@id='exp-6']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("2/23/2018");   
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		//driver.findElement(By.xpath("//input[@id='photo']")).click();
		WebElement fileInput = driver.findElement(By.id("photo"));
		fileInput.sendKeys("C:/Users/Ritesh/Desktop/Images/saraswati-mata.jpg");
		driver.findElement(By.xpath("//input[@id='tool-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		WebElement mySelectElement = driver.findElement(By.id("continents"));
		Select dropdown= new Select(mySelectElement);
		dropdown.selectByVisibleText("North America");
		//dropdown.selectByIndex(5); 
		
		WebElement mySelectElement1 = driver.findElement(By.id("selenium_commands"));
		Select dropdown2= new Select(mySelectElement1);
		dropdown2.selectByIndex(3);
		
		driver.findElement(By.id("submit")).click();
	}

}
