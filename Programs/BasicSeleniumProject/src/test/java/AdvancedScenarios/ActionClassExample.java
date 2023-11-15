package AdvancedScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassExample {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//to handle unnecessary popups and adds we use moveByOffset
		//it will click some where on the page
		Actions act = new Actions(driver);
		act.moveByOffset(20, 20).click().perform();
	
	
		

	}

}
