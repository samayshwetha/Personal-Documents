package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckOrganizationsCheckbox {

	public static void main(String[] args) throws Throwable {
		
		/*Scenario 1:
		Navigate to VTiger App
		Navigate to Oranizations page
		check on all the check boxes*/
		
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
		
		//find all the checkbox and check
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td/input[@name='selected_id']"));
		
		for (WebElement ele : allcheckbox) {
			ele.click();
			Thread.sleep(2000);
		}
		
	}

}
