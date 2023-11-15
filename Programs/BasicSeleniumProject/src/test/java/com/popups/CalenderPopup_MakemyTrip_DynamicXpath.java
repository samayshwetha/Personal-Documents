package com.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup_MakemyTrip_DynamicXpath {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		 //to handle random pop ups which can be closed by mouse tap we use action class
		Actions act = new Actions(driver);
		//Thread.sleep(2000);
		act.moveByOffset(10, 20).click().perform();
		//Thread.sleep(2000);
		act.moveByOffset(10, 30).click().perform();
		//Thread.sleep(2000);
		act.moveByOffset(20, 40).click().perform();
		//Thread.sleep(2000);
		act.moveByOffset(60, 80).click().perform();
					
		//click on departure
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//click on nav button
		driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		Thread.sleep(2000);
		//select octorber 18
		 String month = "October 2023";
		 String date = "18";
		driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
		
		
		

	}

}
