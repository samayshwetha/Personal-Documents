package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationChemicals {

	public static void main(String[] args) {
		
		//scenario3:Scenario 3: Launch Browser Login to application with valid credentials 
		//Navigate to Organizations link Click on Create Organization look Up Image 
		//Create Organization with Mandatory fields Select "Chemicals" in the industry drop down Save and Verify logout of Application 
				
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//login to with valid credentials
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
			 
		
		//click on Organization
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		//click on img+
		driver.findElement(By.xpath("//img[contains(@title,'Create Organization')]")).click();
						
		if(driver.findElement(By.xpath("//*[text()='Creating New Organization']")).isDisplayed()==true)
			{
			   System.out.println("Creating New Organization page is loaded");
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Org4");
				WebElement chePath = driver.findElement(By.xpath("//select[@name='industry']"));
				Select sel = new Select(chePath);
				sel.selectByValue("Chemicals");        
				driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
			}
		}
		
		
		

	}


