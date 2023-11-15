package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		///////path for username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
		/////path for password
		//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[contains(@class,'pwdfield')]")).sendKeys("manager");
		
		///login button
		//driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		//click on view time track
		driver.findElement(By.xpath("//a[text()='View Time-Track']")).click();
		

	}

}
