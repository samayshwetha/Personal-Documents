package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//Click on 'X' icon
		if(driver.findElement(By.xpath("//button[text()='✕']")).isDisplayed())
		{
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		
		driver.findElement(By.name("q")).sendKeys("nike");
		Thread.sleep(2000);
		//click on bluetooth speaker
		 List<WebElement> allSuggestions = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']/li"));
		 for (WebElement suggestions : allSuggestions) {
			 System.out.println(suggestions.getText());
			/* if(suggestions.getText().contains("tooth speaker"))
			 {
				 suggestions.click();	
				 break;
			 }*/
			
		}

	}

}
