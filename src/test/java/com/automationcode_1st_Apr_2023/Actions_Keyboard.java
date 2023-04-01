package com.automationcode_1st_Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//practice url - http://uitestpractice.com/students/actions
//video - https://www.youtube.com/watch?v=nTTZD-fuNPg&list=PLeQxh1Kl8PVdOIaOAFdXHLl8fBRC9n4dm&index=35
public class Actions_Keyboard {
	
	public WebDriver driver;
	
	@Test
	public void keyBoardActionItems() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		Actions action = new Actions(driver);
		
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		loginButton.sendKeys(Keys.ENTER);
	}

}
