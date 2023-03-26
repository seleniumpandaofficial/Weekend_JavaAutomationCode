package com.automationcode_19thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN_Xpaths {

	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void openBrowser() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test(priority = 1)
	public void registerPage() throws Exception {
		driver.findElement(By.xpath("//span[contains(text(), 'My Account')] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Selenium111");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Panda111");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda111@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("9876543210");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@Test(priority = 2, dependsOnMethods = "registerPage")
	public void loginUsingRegisteredDetails() {
		driver.findElement(By.xpath("//span[contains(text(), 'My Account')] ")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("seleniumpanda111@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@class = 'btn btn-primary']")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
