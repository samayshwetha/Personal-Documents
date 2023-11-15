package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsNew {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		//////path for username using all the locators
		driver.findElement(By.id("username")).sendKeys("admin");
		//driver.findElement(By.name("username")).sendKeys("admin");
		//driver.findElement(By.className("textField")).sendKeys("admin");
		//driver.findElement(By.cssSelector("[id='username']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
				
		Thread.sleep(1000);
	    //////path for password using all the locators
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.className("textField pwdfield")).sendKeys("manager");
		//driver.findElement(By.cssSelector("[name='pwd']")).sendKeys("manager");
		//driver.findElement(By.cssSelector(".pwdfield")).sendKeys("manager");
		//driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		Thread.sleep(1000);
		
		///////check the checkbox
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		
		
		 //////path for login button using all the locators
		driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.className("initial")).click();
		//driver.findElement(By.linkText("Login ")).click();
		//driver.findElement(By.partialLinkText("Login")).click();
		driver.findElement(By.cssSelector("[id='loginButton']")).click();
		driver.findElement(By.cssSelector("#loginButton")).click();
		//driver.findElement(By.cssSelector("a.initial")).click();
		
		
		
	}

}
