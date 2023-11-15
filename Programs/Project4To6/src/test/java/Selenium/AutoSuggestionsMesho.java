package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionsMesho {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		search.sendKeys("nike");
		search.click();
		
		List<WebElement> allsugge = driver.findElements(By.xpath("//*[@class='sc-eDvSVe hpsLdS sc-AHaJN puxZX sc-AHaJN puxZX']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		for (WebElement sugg : allsugge) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			System.out.println(sugg.getText());
			/*if(sugg.getText().equalsIgnoreCase("niker for girls"))
			{
				sugg.click();
				break;
			}*/
			
		}

	}

}
