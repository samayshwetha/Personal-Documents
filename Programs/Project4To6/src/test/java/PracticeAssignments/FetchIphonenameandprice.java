package PracticeAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchIphonenameandprice {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(2000);
		
		 List<WebElement> phoneNames = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		 List<WebElement> phoneprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			
		 for(int i=0;i<phoneNames.size();i++)
		 {
			 System.out.println(phoneNames.get(i).getText()+"\t"+phoneprice.get(i).getText());
		 }
		 
		 
		}

	}


