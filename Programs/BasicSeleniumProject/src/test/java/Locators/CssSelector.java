package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		/*//CSS selector to identify the path of the web element username
		//syntax1:[attributename='attributevalue']
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("admin");
		
		Thread.sleep(1000);
		//CSS selector to identify the path of the web element password
		//syntax2: htmltag [attributename='attributevalue']
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		
		Thread.sleep(1000);
		//CSS selector to identify the path of the web element login button
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();*/
		
		
		
		//Shortcut to find the path of username and login button using id
		//syntax3: htmltag#attribytename
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		Thread.sleep(1000);
		
		//Syntax4
		//driver.findElement(By.cssSelector("[class='textField pwdfield']")).sendKeys("manager"); 
		driver.findElement(By.cssSelector("input.pwdfield")).sendKeys("manager");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a#loginButton")).click();
		
		
		
		
		
		
		

	}

}
