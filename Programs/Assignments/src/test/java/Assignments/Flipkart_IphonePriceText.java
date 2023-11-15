package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_IphonePriceText {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Click on 'X' icon
		if(driver.findElement(By.xpath("//button[text()='✕']")).isDisplayed())
		{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
			
		
		Thread.sleep(2000);
		//click on search field
		WebElement data = driver.findElement(By.xpath("//input[@type='text']"));
		data.sendKeys("iphone");
		data.submit();
		
		
		Thread.sleep(2000);
		//get the text of iphone price
		//String price = driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[4]/div[1]/div[1]/div[1]/a/div[2]/div[2]/div/div/div[@class='_30jeq3 _1_WHN1']")).getText();*/
		//String price1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']/../../div/div/div/div[@class='_30jeq3 _1_WHN1']")).getText();
		
		//write xpath using following siblings
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']/../following-sibling::div//div[@class='_25b18c']")).getText();
		String price1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']/../following-sibling::div//div[@class='_30jeq3 _1_WHN1']")).getText();
				
		Thread.sleep(2000);
		System.out.println(price);
		System.out.println("------------------------------------------------");
		System.out.println(price1);
		
		

	}

}
