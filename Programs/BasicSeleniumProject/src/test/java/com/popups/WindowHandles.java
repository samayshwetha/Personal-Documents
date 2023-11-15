package com.popups;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		//navigate to Job--->Job by skills
		//to perform mouse action  use action class methods
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
		Actions act = new Actions(driver);
	    act.moveToElement(ele).perform();
	    
	    //click on Job by skills
	    driver.findElement(By.xpath("//div[text()='Jobs by skill']")).click();
		//click on services
	    driver.findElement(By.xpath("//div[text()='Services']")).click();
	    
	    //click on find jobs: it wont work because its in differnet tab/window
	  //driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
	    
	    //by using window id's we can click on find jobs
	    String mainId = driver.getWindowHandle(); //parent
	    System.out.println(mainId);
	    
	    //we need all the id's of windows
	   Set<String> allIds = driver.getWindowHandles();
	   
	   System.out.println(allIds);  //parent and child id's
	   
	   for (String id : allIds) 
	   {
		   if(!mainId.equals(id))
		   {
			   driver.switchTo().window(id);
			   driver.findElement(By.xpath("//span[text()='FIND JOBS']")).click();
		   }
	  }
	    
	   //go back to main window and click on walk-in jobs
	   driver.switchTo().window(mainId);
	   driver.findElement(By.xpath("//a[text()='Walk-in Jobs']")).click();

	}

}
