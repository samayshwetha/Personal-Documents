package Framework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class AutoSuggestion1 {

	public void AutoSuggestion1() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bluetooth");
	     List<WebElement> allSuggetsions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
	     Thread.sleep(1000);
	     
	     //int count=0;
	     for (WebElement suggestion : allSuggetsions) {
	    	String actData = suggestion.getText();
	    	 //System.out.println(suggestion.getText());
	    	 //count++;	
	    	if(actData.contains("bluetooth")) 
	    	{
	    		suggestion.click();
	    		break;
	    	}
		}
	}

}
