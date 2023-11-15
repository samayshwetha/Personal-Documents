package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//Syntax 1: //htmltag[@attributename='attributevalue']
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		//Syntax2: //htmltag[text()='attribute value']
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Enter Time-Track']")).click();
		
		
		
		
		

	}

}
