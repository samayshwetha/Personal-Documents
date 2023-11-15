package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		
		driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input.textField pwdfield")).sendKeys("manager");
		
		

	}

}
