package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPath3 {

	public static void main(String[] args) throws Throwable {
		
		
		//syntax3: //htmltag(contains(@attributevalue,'attributename')
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("admin");
				
		//password
		driver.findElement(By.xpath("//input[contains(@class,'p')]")).sendKeys("manager");
		
		Thread.sleep(1000);
		//login
		driver.findElement(By.xpath("//a[contains(@id,'log')]")).click();
		
		//click on view-time track
		driver.findElement(By.xpath("//a[contains(text(),'Enter')]")).click();
		
		Thread.sleep(1000);
		//click on Approve-time track
		driver.findElement(By.xpath("//a[contains(text(),'App')]")).click();
		
		
		
		
	}

}
