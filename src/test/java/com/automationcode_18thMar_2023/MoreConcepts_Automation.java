package com.automationcode_18thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MoreConcepts_Automation {
	
	public  WebDriver driver;
	public  ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
	}
	
	@Test(priority=1)
	public void clickOnSigninLink() {
		driver.findElement(By.className("signin")).click();
	}
	
	@Test(priority=2)
	public void loginCredentials() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.id("password")).sendKeys("Selenium@123");
	    driver.findElement(By.className("signinbtn")).click();
	}
	
	@Test(priority=3)
	public void clickOnLogOutLink() {
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
	    driver.findElement(By.id("password")).sendKeys("Selenium@123");
	    driver.findElement(By.className("signinbtn")).click();
	    driver.findElement(By.className("rd_logout")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
