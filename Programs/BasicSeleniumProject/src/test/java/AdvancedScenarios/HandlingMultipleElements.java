package AdvancedScenarios;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//print all the links 
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int count=0;
		for (WebElement links : allLinks) {
			
			System.out.println(links.getText());
			count++;
		}
		System.out.println("Total number of Links: "+allLinks.size());
		
		/*List<WebElement> allLinks1=driver.findElements(By.xpath("//input"));
		
		int count1=0;
		for (WebElement links1 : allLinks1) {
			System.out.println(links1.getAttribute("name"));
			count1++;
		}
		System.out.println("Total number of Links: " +count1);*/
		
	}

}
