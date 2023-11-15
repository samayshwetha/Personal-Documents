package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSVGElements {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.xpath("//a[@class='gb_d']")).click();
		
		//svg: scalable, vector Graphics
		//syntax: //*[name()='svg' and @Attributename='Attributevalue']
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("svg[class='gb_h'] ")).click();
		
	}

}
