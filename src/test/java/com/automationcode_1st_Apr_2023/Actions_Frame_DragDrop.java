package com.automationcode_1st_Apr_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actions_Frame_DragDrop {

	public WebDriver driver;
	
	@Test
	public void handlingFrames() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		
		//Total number of frames
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("total frames : " + totalFrames.size());
		
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}
}
