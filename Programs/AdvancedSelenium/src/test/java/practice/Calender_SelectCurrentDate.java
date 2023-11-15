package practice;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender_SelectCurrentDate {

	public static void main(String[] args) throws InterruptedException {
		
		
		Date d = new Date();
		System.out.println(d);
		String[] dArr = d.toString().split(" ");
		String currentDate = dArr[0]+" "+dArr[1]+" "+dArr[2]+" "+dArr[5];
		System.out.println(currentDate);
		
		
		/*Date today = new Date();
		System.out.println(today);
		SimpleDateFormat formatter = new  SimpleDateFormat("EEE MMM dd yyyy");
		String currentDate = formatter.format(today);
		System.out.println(currentDate);*/
		
		
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
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@aria-label='"+currentDate+"']")).click();
				
				
				
				
				

	}

}
