package AdvancedScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByRobotClass {
	@Test
	public void ScrollByRobotClass() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		 Robot rob = new Robot();
		 rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_PAGE_UP);
		 rob.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 Thread.sleep(1000);
		 rob.keyPress(KeyEvent.VK_PAGE_UP);
		 rob.keyRelease(KeyEvent.VK_PAGE_UP);
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("puma",Keys.ENTER);
	}

}
