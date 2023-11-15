package com.popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivisionPopup {

	public static void main(String[] args) throws Throwable {
		
		//actitime---tasks---click on any checkbox-->click on delete
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//version3--implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		//enter username,password and click on ok using keys class
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		 driver.findElement(By.xpath("(//div[@class='checkbox inactive']/div[@class='img'])[2]")).click();
		 
		 driver.findElement(By.xpath("//div[@class='delete button']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"
		 		+ "/ancestor::div[@class='operationConfirmDialogInnerContainer']/descendant::div[text()='Cancel']")).click();
		
		

	}

}
