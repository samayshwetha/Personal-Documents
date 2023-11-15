package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ListHandlingUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		
		//if html tag starts with select we go by Select class
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		
		 //select day using selectByIndex
		   /*try {
		   WebElement pathDay = driver.findElement(By.id("day"));
		   Select sel = new Select(pathDay);
		   sel.selectByIndex(16);
			}
			catch(NoSuchElementException error)
			{
				System.out.println("continue program");
			}
		  //create object for select class and pass path of webelement as argument
		   
		   
		   Thread.sleep(2000);
		  //select month
		   WebElement pathMonth = driver.findElement(By.id("month"));
		  //create object for select class and pass path of webelement as argument
		   Select sel1 = new Select(pathMonth);
		   sel1.selectByIndex(3);
		   	
		   Thread.sleep(2000);
		  //select year
		   WebElement pathYear = driver.findElement(By.id("year"));
		   Select sel2 = new Select(pathYear);
		   sel2.selectByIndex(35);*/
		
		/////Select options using selectByValue
		 /*//select day 
		  WebElement pathDay = driver.findElement(By.id("day"));
		   Select sel = new Select(pathDay);
		   sel.selectByValue("10");
		 //select month 
		   WebElement pathMonth = driver.findElement(By.id("month"));
		   Select sel1 = new Select(pathMonth);
		   sel1.selectByValue("10");
		 //select year
		   WebElement pathYear = driver.findElement(By.id("year"));
		    Select sel2 = new Select(pathYear);
		   sel2.selectByValue("2004");*/
		
		
	   /////Select options using selectByVisible Text
		//select day 
		  WebElement pathDay = driver.findElement(By.id("day"));
		   Select sel = new Select(pathDay);
		   sel.selectByVisibleText("2");
		 //select month 
		   WebElement pathMonth = driver.findElement(By.id("month"));
		   Select sel1 = new Select(pathMonth);
		   sel1.selectByVisibleText("Oct");
		 //select year
		   WebElement pathYear = driver.findElement(By.id("year"));
		   Select sel2 = new Select(pathYear);
		   sel2.selectByVisibleText("1983");
		   

	}

}
