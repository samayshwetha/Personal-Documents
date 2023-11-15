package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListHandlingUsingLocators {

	public static void main(String[] args) throws Throwable {
		
		//if html tag not starts with select we go by Locators
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		//xpath for day
		driver.findElement(By.id("day"));
		driver.findElement(By.xpath("//option[.='10']")).click();
		Thread.sleep(1000);
		//xpath for month
		driver.findElement(By.id("month"));
		driver.findElement(By.xpath("//option[.='Mar']")).click();
		Thread.sleep(1000);
		//xpath for year
		driver.findElement(By.id("year"));
		driver.findElement(By.xpath("//option[.='2003']")).click();
		

	}

}
