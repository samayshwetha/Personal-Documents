package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath4 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//using multiple attributes
		driver.findElement(By.xpath("//input[@id='username' and @class= 'textField' ]")).sendKeys("admin");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd' or @type= 'password' ]")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[@id='loginButton' and @class= 'initial' ]")).click();
		
	
		
		
		

	}

}
