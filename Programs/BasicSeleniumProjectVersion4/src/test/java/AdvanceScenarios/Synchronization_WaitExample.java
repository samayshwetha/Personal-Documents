package AdvanceScenarios;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_WaitExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		///Implicit wait---version 4
		Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		time.implicitlyWait(Duration.ofSeconds(20));
		
		////launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		///Explicit wait
		//enter username and password
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager");
		//login button
		WebElement login = driver.findElement(By.className("initial"));
		
		/*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click(); //timeoutException()
		
		//case2
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.titleContains("Enter Time-Track"));*/
		
		///fluent wait
		FluentWait wait2 = new FluentWait(driver);
		wait2.pollingEvery(Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.elementToBeClickable(login));
		
		
	}

}
