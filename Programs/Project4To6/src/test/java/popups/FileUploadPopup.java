package popups;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		//launching application
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		
		//version3--implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		//https://www.foundit.in/ 
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		WebElement file = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//file.click();
		file.sendKeys("C:\\Users\\Snadagi\\Documents\\FileUpload.txt");
	     
	}

}
