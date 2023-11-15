package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class closeNotificationPopup_Irctc {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//navigate to url
		driver.get(" https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		 //getting No AlertPresentException 

		//using disable notifications we can handle
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(" https://www.irctc.co.in/nget/train-search");*/
		
		 
	}

}
