package AdvancedScenariosPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAutoSuggestion_Amazon {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kurta");
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		for (WebElement suggest : suggestions) {
			 System.out.println(suggest.getText());
		}
		
		
		Thread.sleep(2000);
		for (WebElement suggest : suggestions) {
			  String suggestion = suggest.getText();
				if(suggestion.equalsIgnoreCase("kurta for women")) {
				suggest.click();
				break;
			}
						
		}

	}

}
