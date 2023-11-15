package AdvancedScenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollByJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.selenium.dev/downloads/");
		 driver.manage().window().maximize();
		 		 
		 JavascriptExecutor  jse =(JavascriptExecutor)driver;
		 
		 //////single scroll down and up
		 /*jse.executeScript("window.scrollBy(0,1000);", "");
		 Thread.sleep(1000);
		 jse.executeScript("window.scrollBy(0,-1000);", "");*/
		 
		 //////with loop scrolling completely down up
		 /*for(int i=0;i<5;i++)
		 {
		 Thread.sleep(1000);
		 //scroll up action
		 jse.executeScript("window.scrollBy(0,1000);", "");
		 }
		 
		 for(int i=0;i<5;i++)
		 {
		 Thread.sleep(1000);
		 //scroll down action
		 jse.executeScript("window.scrollBy(0,-1000);", "");
		 }*/
		 
		 //////to scroll completely down and up
		 /*jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(1000);
		 jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");*/
		 
		 ///to scroll horizontally
		 jse.executeScript("window.scrollBy(1000,0)");
		 Thread.sleep(1000);
		 jse.executeScript("window.scrollBy(-1000,0)");
	
		 

	}

}
