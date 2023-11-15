package com.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingUsingIndex {

	public static void main(String[] args) {
		
		//1.handle frames using index
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//inspect page using //iframe tag, if result is yes then switch to that frame
		driver.switchTo().frame(0);
		WebElement dragEle = driver.findElement(By.cssSelector("[id='draggable']"));
		WebElement dropEle = driver.findElement(By.id("droppable"));
		           
		Actions act = new Actions(driver);
		act.dragAndDrop(dragEle, dropEle).perform();
	
		 		
		
		
		
		

	}

}
