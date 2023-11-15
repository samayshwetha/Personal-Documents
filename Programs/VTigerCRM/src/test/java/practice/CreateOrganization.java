package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganization {

	public static void main(String[] args) {
		/*Scenario 2: Launch Browser Login to application with valid credentials 
		Navigate to Organizations link Click on Create Organization look Up Image 
		Create Organization with Mandatory fields Save and Verify logout of Application */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//login to with valid credentials
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//click on Organization
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		//verify page is loaded
		if(driver.findElement(By.xpath("//td[@class='moduleName']")).isDisplayed()==true)
		{
			driver.findElement(By.xpath("//img[contains(@title,'Create Organization')]")).click();
			if(driver.findElement(By.xpath("//*[text()='Creating New Organization']")).isDisplayed()==true)
			{
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Org2");
				driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
			}
		}
		
		

	}

}
