package AdvancedScenariosPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		//search bar
		 WebElement searchPath = driver.findElement(By.xpath("//input[contains(@placeholder,'Try Saree')]"));
		 searchPath.sendKeys("shoes");
		 searchPath.click();
		 Thread.sleep(2000);
		 //List<WebElement> resultPath = driver.findElements(By.xpath("//p[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']"));
		 List<WebElement> resultPath = driver.findElements(By.xpath("//div[@class='sc-cOxWqc bLdIZq']"));
		
		 Thread.sleep(2000);
		 for (WebElement result : resultPath) {
		  System.out.println(result.getText());
		  	  if (result.getText().contains("shoes children"))
		  	  {
		  		  result.click();
		  		  System.out.println("click Successful");
		  		  break;
		  	  }
		}
	

	}

}
