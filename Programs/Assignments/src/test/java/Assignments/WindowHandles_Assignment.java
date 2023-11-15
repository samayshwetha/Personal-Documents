package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_Assignment {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//open new seperate window--->click--->watch the videos--->play any one video /home
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		//get the main window id
		String mainId = driver.getWindowHandle();
		System.out.println(mainId);
		

		Set<String> allIds = driver.getWindowHandles();
		System.out.println(allIds);
		
		for (String id : allIds) 
		   {
			   if(!mainId.equals(id))
			   {
				   driver.switchTo().window(id);
				   driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
			   }
		  }
		
		//click on Home button
			
		Set<String> allIds1 = driver.getWindowHandles();
		System.out.println(allIds1);
		//WebElement ele2 = driver.findElement(By.xpath("//yt-formatted-string[text()='Home']"));
		/*for (String id1 : allIds1)
		{
			if(!mainId.equals(id1))
			   {
				   driver.switchTo().window(id1);
				   driver.findElement(By.xpath("//yt-formatted-string[text()='Home']")).click();
			   }
				
		}*/
		
		
	}

}
