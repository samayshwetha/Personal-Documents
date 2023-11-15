package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatecontactlookUp {

	public static void main(String[] args) {
		
		//Scenario 1: Launch Browser Login to application with valid credentials
		//Navigate to Contacts link Click on Create contact look Up Image Create 
		//Contact with Mandatory fields Save and Verify logout of Application 
		
		//Step1: Launch Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step2: lauch the application
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		// Step 3: login to with valid credentials
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//Step 4: click on contacts and Click on Create contact look Up Image
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Create Contact')]")).click();
		
		// Step 5: Create Contact with Mandatory fields
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lmn");
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		
		//Step6: validation
		String header = driver.findElement(By.xpath("//*[@class='dvHeaderText']")).getText();
		
		if(header.contains("lmn"))
		{
			System.out.println("user is created");
		}
		else
		{
			System.out.println("user is not created");
		}
		
		//Step7: logout of the application
        Actions ac = new Actions(driver);
		WebElement logout = driver.findElement(By.xpath("//td[contains(@onmouseover,'fnDropDownUser(this,')][1]"));
		ac.moveToElement(logout).perform();
		WebElement signout = driver.findElement(By.linkText("Sign Out"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signout));
		driver.findElement(By.linkText("Sign Out")).click();
		driver.quit();
		
		
	}

}
