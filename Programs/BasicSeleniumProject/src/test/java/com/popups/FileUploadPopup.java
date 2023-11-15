package com.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		//version3--implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//https://www.foundit.in/ 
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		//WebElement file = driver.findElement(By.xpath("//input[@id='file-upload']"));
		WebElement data = driver.findElement(By.id("file-upload"));
		Thread.sleep(2000);
		data.sendKeys("‪C:\\Users\\Snadagi\\FileUpload.txt");

	}

}
