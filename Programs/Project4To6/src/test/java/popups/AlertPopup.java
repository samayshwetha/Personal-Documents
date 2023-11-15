package popups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		
		//popups which contains ok and cancel until and unless we click on ok/canel it will not go away
		//and which can not be inspectable and draggable so driver cant handle it
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
			
		//click on create type of work
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shwetha");
		
		//click on cancel button
		driver.findElement(By.xpath("//input[contains(@value,'Cancel')]")).click();
		Alert alt = driver.switchTo().alert();
		alt.dismiss();

	}

}
