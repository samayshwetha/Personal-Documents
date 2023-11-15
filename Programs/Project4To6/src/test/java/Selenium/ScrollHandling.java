package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollHandling {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		  Robot rb = new Robot();
		  rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		  rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(1000);
		  rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		  rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  
		
		
	}
	
	

}
