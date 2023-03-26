package com.automationcode_5thMar_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MoreCommands {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
	    
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();

	}

}
