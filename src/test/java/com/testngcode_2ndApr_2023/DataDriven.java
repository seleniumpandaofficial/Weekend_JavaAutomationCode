package com.testngcode_2ndApr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Annotation is known as @DataProvider
//1. returns a 2-D Object array
//2. pass all the elements of that 2-D array [initialization process of Array]
//3. you have to create the @Test and pass dataProvider
//4. You have to pass the arguments in the Method under @Test == cols of the 2-D array

public class DataDriven {

	public WebDriver driver;

	@Test(priority = 1, dataProvider = "getNinjaData")
	public void loginNinjaTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	@Test(priority = 2, dataProvider = "getRediffData")
	public void loginRediffTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("passord")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}

	@DataProvider

	public Object[][] getNinjaData() {

		Object[][] data = { { "seleniumpanda@gmail.com", "Selenium@123" },
				                      { "seleniumpanda1@gmail.com", "Selenium@123" }, 
				                      { "seleniumpanda2@gmail.com", "Selenium@123" },
				                      { "seleniumpanda845@gmail.com", "Selenium@123" } };
       return data;
	}

	@DataProvider
	
	public Object[][] getRediffData(){
	Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
                                 { "seleniumpanda1@rediffmail.com", "Selenium@123"},
                                 { "seleniumpanda2@rediffmail.com", "Selenium@123"},
                                 {  "seleniumpanda845@rediffmail.com", "Selenium@123" }};

	return data;
}

}
