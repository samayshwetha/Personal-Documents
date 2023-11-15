package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTabelCheckParticularCheckbox {

	public static void main(String[] args) throws Throwable {
		
		/* Scenario 2:
		Navigate to VTiger App
		Navigate to Oranizations page
		check on 5th the check boxes                */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//login to with valid credentials
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		//click on Organization
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		
		int row=7;
		//find all the checkbox and check
		WebElement ele = driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+row+"]/td/input[@name='selected_id']"));
		Thread.sleep(2000);
	    ele.click();
			
		}
		

	}


