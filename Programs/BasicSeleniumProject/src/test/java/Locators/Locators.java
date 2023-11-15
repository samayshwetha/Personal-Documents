package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locators {

	public static void main(String[] args) throws Throwable {
		
		//launching empty browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//passing the value to userTextfield using id() locators
		/*driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		
		//pass the value to password field using name() locators
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		
		//find the login button and click on Login button
		driver.findElement(By.id("loginButtonContainer")).click();*/
				
		//Launching the Facebook Application
		/*driver.get("https://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("shwetha");*/
		
		//passing the value to userTextfield using classname() locators
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		Thread.sleep(500);
		//pass the value to password field using classname() locators  
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		
		Thread.sleep(1000);
		//Check the checkbox using id
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		//click the login button by using class name
		driver.findElement(By.className("initial")).click();
		
		Thread.sleep(1000);
			
	   //click on view time track using linked Text
		driver.findElement(By.linkText("View Time-Track")).click();
		
		Thread.sleep(2000);
		 //click on lock time track using linked Text
		driver.findElement(By.linkText("Lock Time-Track")).click();
		
		Thread.sleep(2000);
		 //click on Approve time track using linked Text
		driver.findElement(By.linkText("Approve Time-Track" )).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Enter Time-Track")).click();
		
		// //click on lock time track using Partial linked Text
		
		
	}

}
