package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		Thread.sleep(1000);
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		act.moveToElement(ele2).contextClick(ele2).perform();*/
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement UN = driver.findElement(By.id("username"));
		WebElement PWD = driver.findElement(By.name("pwd"));
		WebElement LOGIN = driver.findElement(By.id("loginButton"));
		Actions act = new Actions(driver);
		act.sendKeys(UN, "admin").perform();
		act.sendKeys(PWD, "manager").perform();
		act.click(LOGIN).perform();
		
		
		

	}

}
