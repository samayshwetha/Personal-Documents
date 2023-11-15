package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxHandlingUsingKeyClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		 WebElement path = driver.findElement(By.id("day"));
		 path.click();
		 //select day 30
		 Thread.sleep(1000);
		 path.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(1000);
		 path.sendKeys(Keys.ARROW_DOWN);
		
		 Thread.sleep(1000);
		 path.sendKeys(Keys.ARROW_UP);
		 Thread.sleep(1000);
		 path.sendKeys(Keys.ARROW_UP);
		 Thread.sleep(1000);
		 path.sendKeys(Keys.ARROW_UP);
		 path.sendKeys(Keys.ENTER);
		 
		 
		 
		
		
		

	}

}
