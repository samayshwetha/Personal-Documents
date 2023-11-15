package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		//Explicit wait
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.id("loginButton"));
	    /*sWebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(login));
	    login.click();*/
		
        FluentWait fwait = new FluentWait(driver);
        fwait.pollingEvery(Duration.ofSeconds(1));
        fwait.withTimeout(Duration.ofSeconds(10));
        fwait.until(ExpectedConditions.elementToBeClickable(login));
	    login.click();
        
		
		
		
		
	}

}
