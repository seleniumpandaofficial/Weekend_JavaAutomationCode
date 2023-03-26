package com.automationcode_25thMar_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OWM_cssSelector {
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://openweathermap.org/");
  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div#desktop-menu > form + ul > li:nth-child(11) a:nth-child(1)")));
  driver.findElement(By.cssSelector("div#desktop-menu > form + ul > li:nth-child(11) a:nth-child(1)")).click();

	}

}
