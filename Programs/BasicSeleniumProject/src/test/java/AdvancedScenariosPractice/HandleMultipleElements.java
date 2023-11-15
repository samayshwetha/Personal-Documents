package AdvancedScenariosPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleMultipleElements {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		//print all the navigation bars
		List<WebElement> pathNavBar = driver.findElements(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
		Thread.sleep(2000);
		for (WebElement path : pathNavBar) {
			System.out.println(path.getText());
			
		}

	}

}
