package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToParticularElement {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.selenium.dev/downloads/");
		 driver.manage().window().maximize();
		 
		 //click on about selenium link		
		 
		/* WebElement element = driver.findElement(By.xpath("(//a[.='About Selenium'])[2]"));
		 JavascriptExecutor  jse =(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView()", element);
		 
		 Thread.sleep(2000);
		 element.click();*/
		 
		 
		 ////click on "about selenium" link	using getlocation() func
		 WebElement element = driver.findElement(By.xpath("(//a[.='About Selenium'])[2]"));
		 Point data = element.getLocation();
		  int x =data.getX();
		  int y = data.getY();
		  System.out.print(x +"\t"+ y);
		 JavascriptExecutor  jse =(JavascriptExecutor)driver;
		 Thread.sleep(2000);
		 jse.executeScript("window.scrollBy(943,5405)");
		 Thread.sleep(2000);
		 element.click();
			 
		 
	}

}
