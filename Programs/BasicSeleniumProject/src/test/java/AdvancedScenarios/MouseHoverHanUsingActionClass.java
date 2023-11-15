package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverHanUsingActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//using moveToElement
	   WebElement path = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	   Actions act = new Actions(driver);
	   //act.moveToElement(path).click().perform();
	   
	   //contextclick()-----for right click actions
	   act.contextClick(path).perform();*/
	   
	   //using sendkeys, click,perform
	    driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	    WebElement USERNAME = driver.findElement(By.id("username"));
		WebElement PASSWORD = driver.findElement(By.name("pwd"));
		WebElement LOGIN = driver.findElement(By.id("loginButton"));
		Actions act1 = new Actions(driver);
		 act1.sendKeys(USERNAME, "admin").perform();;
		 act1.sendKeys(PASSWORD, "manager").perform();
		 act1.click(LOGIN).perform();
		 
		 
		//write above three lines in single line
		/*act1.sendKeys(USERNAME, "admin").sendKeys(PASSWORD,"manager").click(LOGIN).perform();
		
		//if single line is not working then use build
		act1.sendKeys(USERNAME, "admin").sendKeys(PASSWORD,"manager").click(LOGIN).build().perform();*/
		
		
	   
		
		 
		 
		
	}

}
