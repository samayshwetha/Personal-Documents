package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosuggestion_puma_ver4 {

	public static void main(String[] args) throws Throwable {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		
		//take the parent of suggestion
		//List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		Thread.sleep(2000);
		for (WebElement suggestion : allsuggestions) {
			System.out.println(suggestion.getText());
			if(suggestion.getText().equalsIgnoreCase("puma flip flops for men")) {
				suggestion.click();
				break;
			}
		}

	}

}
