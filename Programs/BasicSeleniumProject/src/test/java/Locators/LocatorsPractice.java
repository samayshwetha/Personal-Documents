package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice {

	public static void main(String[] args) {
		
		//launching empty browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		//launching application
		driver.get("https://www.flipkart.com/");
		
		
				

	}

}
