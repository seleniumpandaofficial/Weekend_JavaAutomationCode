package com.automationcode_25thMar_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tn_CssSelector {
public WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
	}
	
	@Test
	public void completeLogin() {
		driver.findElement(By.cssSelector("i.fa.fa-user + span")).click();
		driver.findElement(By.cssSelector("ul.dropdown-menu.dropdown-menu-right > li + li > a:nth-child(1)")).click();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
