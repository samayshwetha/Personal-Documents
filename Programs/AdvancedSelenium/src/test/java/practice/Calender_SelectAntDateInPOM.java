package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_SelectAntDateInPOM {

	public static void main(String[] args) {
		
		//Launch empty browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//launch appl
		driver.get("https://www.makemytrip.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(10,10).click().perform();
		
		//From city
		WebElement src = driver.findElement(By.id("fromCity"));
		src.sendKeys("Sumbawa");
		driver.findElement(By.xpath("//p[.='Sumbawa Island, Indonesia']")).click();
		
		//To city
		WebElement dest = driver.findElement(By.id("toCity"));
		dest.sendKeys("Bengaluru");
		driver.findElement(By.xpath("//p[.='Kolkata, India']")).click();
		
				
		/*//find the path for departure and click
		driver.findElement(By.xpath("//span[text()='Departure']")).click();*/
		
		//find the path for the date 4 oct
		String givenDate="Wed Oct 04 2023";
		driver.findElement(By.xpath("//div[@aria-label='"+givenDate+"']")).click();
		
		
		
		    
		

	}

}
