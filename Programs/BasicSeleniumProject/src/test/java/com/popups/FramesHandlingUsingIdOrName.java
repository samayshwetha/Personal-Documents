package com.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingUsingIdOrName {

	public static void main(String[] args) {
		
		//2/handle frames using id/name
		//https://demo.automationtesting.in/Frames.html
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shwetha");
		
		//nested Frames
		/*driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement frame1 = driver.findElement(By.xpath("SingleFrame"));
		driver.switchTo().frame("frame1");
		
		/*WebElement nestframe = driver.findElement(By.xpath("//*[@class='container']/h5[text()='iFrame Demo']"));
		driver.switchTo().frame("nestframe");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nadagi");*/
		
		
		
		
	}

}
