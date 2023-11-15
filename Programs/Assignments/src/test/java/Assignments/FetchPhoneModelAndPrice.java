package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPhoneModelAndPrice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("samsung mobiles",Keys.ENTER);
		Thread.sleep(2000);
		
		//case1
		/*//print all the samsung mobile names and price together
		 List<WebElement> path = driver.findElements(By.xpath("//div[@class='_4rR01T']|//div[@class='_30jeq3 _1_WHN1']"));
		 Thread.sleep(2000);
		  for (WebElement path1 : path) {
			System.out.println(path1.getText());
			}*/
			
		  //case2
		 List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		 
		 for(int i=0;i<name.size();i++)
		 {
			 System.out.println(name.get(i).getText()+"/t"+price.get(i).getText());
		 }
		 
		  
		  
								
			}
	
	}


