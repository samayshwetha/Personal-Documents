package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopups {

	public static void main(String[] args) {
		
		//application which aks credentials to access and we cant inspect and we can not handle using webdriver
		
		     WebDriverManager.chromedriver().setup();
		     WebDriver  driver = new ChromeDriver();
		     driver.manage().window().maximize();
		    // driver.get("https://the-internet.herokuapp.com/basic_auth");
		     driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		     WebElement pageHeader = driver.findElement(By.xpath("//div[@id='content']]"));
		    

	}

}
