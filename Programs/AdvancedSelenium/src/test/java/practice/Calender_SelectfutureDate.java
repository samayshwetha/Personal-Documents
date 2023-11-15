package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_SelectfutureDate {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch empty browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//launch appl
				driver.get("https://www.makemytrip.com/");
				Actions act = new Actions(driver);
				act.moveByOffset(10,10).click().perform();
				
				//find the path for departure and click
				driver.findElement(By.xpath("//span[text()='Departure']")).click();
				Thread.sleep(2000);
				//click on forward arrow
				String givendate="Fri Dec 08 2023";
				for(;;)  //infinite for loop while(true)
				{
					try {//not visible exception visible click on it
				 	 driver.findElement(By.xpath("//div[@aria-label='"+givendate+"']")).click();
					 break;
					}
				 
				 catch(Exception e) { //click on next month
					 driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
					 Thread.sleep(1000);
					}
				 
				}
			
		}	
		
}


