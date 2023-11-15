package com.popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling_Practice {
	
	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		for (String Id : allIds) {
			driver.switchTo().window(Id);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Selenium"))
			{
				break;
			}
			
		}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		
	}
	
}
