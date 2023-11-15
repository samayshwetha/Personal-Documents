package com.popups;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserInCognito {

	public static void main(String[] args) {
		
		//to open chrome private windows
		ChromeOptions options = new ChromeOptions();
		options.addArguments("Incognito");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		
	

	}

}
