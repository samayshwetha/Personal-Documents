package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteUsingKeyClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//case1:
		WebElement element = driver.findElement(By.id("username"));
		
		element.sendKeys("admin");
		Thread.sleep(1000);
		element.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		element.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.name("pwd"));
		//element.sendKeys(Keys.TAB);
		element1.sendKeys(Keys.CONTROL,"v");
		

	}

}
