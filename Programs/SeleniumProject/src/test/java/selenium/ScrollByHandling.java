package selenium;


import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByHandling {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();*/
		
		   /*Robot rb = new Robot();
		   rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		   rb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		   Thread.sleep(1000);
		   rb.keyPress(KeyEvent.VK_PAGE_UP);
		   rb.keyRelease(KeyEvent.VK_PAGE_UP);*/
		 	   
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		/*for(int i=0;i<=5;i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}*/
		
		//WebElement ele = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		/*Point pt = ele.getLocation();
		int x = pt.getX();
		int y = pt.getY();
		System.out.println(x +"\t"+y);
		js.executeScript("window.scrollBy(809,5555)");
		Thread.sleep(1000);
		System.out.println(ele.isDisplayed());*/
		
		/*js.executeScript("arguments[0].scrollIntoView", ele);
		System.out.println(ele.isDisplayed());
		ele.click();*/
		
		
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//div[@class='react-country-picker-trigger__content']"));
		 
		 JavascriptExecutor js1 = (JavascriptExecutor)driver;
		 /*js1.executeScript("arguments[0].scrollIntoView()", ele);
		 ele.click();*/
		
		js1.executeScript("window.scrollBy(0,document.body.scrollHelight)");
		Thread.sleep(1000);
		js1.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		
		
		
		
	
		
	}

}
