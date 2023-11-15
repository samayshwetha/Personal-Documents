package com.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalenderPopup {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		//close 'X' and birthday advertise popup
		driver.findElement(By.xpath("//span[@class='sc-gKclnd hSnAGZ']")).click();
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 dRQhOp']")).click();
		
		//click on departure button and find calender
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		driver.findElement(By.xpath("//div[.='August 2023']/"
				+ "ancestor::div[@class='DayPicker-Month']/descendant::p[text()='15']")).click();
		
		//click on done
		driver.findElement(By.xpath("//*[.='Done']")).click();
		
		

	}

}
