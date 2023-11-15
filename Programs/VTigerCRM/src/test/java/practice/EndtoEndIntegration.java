package practice;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEndIntegration {

	public static void main(String[] args) throws Exception {
		
		//Scenario 5: - end to end - Integration Launch Browser Login to application with valid credentials Navigate to Contacts link 
		//Click on Create contact look up image Create contact with manadatory fields Select the Organization from organization 
		//look up image Save and verify logout of app
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		//login to with valid credentials
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("Mishra1");
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
		
		Thread.sleep(2000);
		String mainwin=driver.getWindowHandle();
		System.out.println(mainwin);
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		for(String a: allwin)
		{
			if(!mainwin.equals(a))
			{
				driver.switchTo().window(a);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[.='TCS']")).click();
			}
		}
		driver.switchTo().window(mainwin);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
		
		driver.findElement(By.xpath("(//td[@class='small' and @valign='bottom'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
			

	}
}


