package AdvancedScenariosPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBy {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
		 
		  /*Robot rob = new Robot();
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
		  rob.keyRelease(KeyEvent.VK_PAGE_UP);*/
		 
		 //using java script executor to scroll up and down and scroll to particular element
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 /*jse.executeScript("window.scrollBy(0,1000);","");
		 Thread.sleep(1000);
		 jse.executeScript("window.scrollBy(0,-1000);","");
		 Thread.sleep(1000);
		 WebElement element = driver.findElement(By.xpath("//a[.='United Kingdom']"));
		 jse.executeScript("arguments[0].scrollIntoView()",element);*/
		 
		//to scroll completely down and up
		 jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 
		 

	}

}
