package AdvancedScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions_Puma {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		Thread.sleep(2000);
		//take the parent of suggestion
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(2000);
		//List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		for (WebElement suggestion : allsuggestions) {
			System.out.println(suggestion.getText());
			if(suggestion.getText().equalsIgnoreCase("puma sandals for men")) {
				suggestion.click();
				break;
			}
		}

	}

}
