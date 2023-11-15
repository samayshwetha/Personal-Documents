package AdvancedScenariosPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMouseHover {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		 WebElement path = driver.findElement(By.xpath("//span[text()='Women Western']"));
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.moveToElement(path).perform();
		 
		
	}

}
