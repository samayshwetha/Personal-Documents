package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles_UsingTitles {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to url
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//open new seperate window--->click--->watch the videos--->play any one video /home
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		//get all the window handles	
		Set<String> allIds = driver.getWindowHandles();  //Frames   //selenium    //
		System.out.println(allIds);
		
		/////////////switch to selenium window and click on watch videos
		for (String id : allIds) {
			
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Selenium"))
			{
				break;
			}
		}
		//click on watch videos
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
	
		//////switch to videos window and click on Home
		Thread.sleep(1000);
		Set<String> allIds1 = driver.getWindowHandles();
		//System.out.println(allIds1);
			
        for (String id1 : allIds1) {
			driver.switchTo().window(id1);
			String title1 = driver.getTitle();
			System.out.println(title1);
			if(title1.contains("SeleniumConf Chicago 2023 Playlist - YouTube"))
			{
				break;
			}
						
        }
        //click on home in the you tube window
        Thread.sleep(1000);
        driver.findElement(By.xpath("//yt-formatted-string[text()='Home']")).click();
		
        /////switch to main window
        Set<String> allIds2 = driver.getWindowHandles();
		//System.out.println(allIds1);
			
        for (String id2 : allIds2) {
			driver.switchTo().window(id2);
			String title2 = driver.getTitle();
			System.out.println(title2);
			if(title2.contains("Frames & windows"))
			{
				break;
			}
						
        }
        //click on home in the you tube window
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        
        
        
    	}

}
