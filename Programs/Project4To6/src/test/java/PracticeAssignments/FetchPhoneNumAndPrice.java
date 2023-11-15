package PracticeAssignments;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPhoneNumAndPrice {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		/*Actions act = new Actions(driver);
		act.moveByOffset(1000, 1000);*/
		try {
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		
		driver.findElement(By.cssSelector("[name='q']")).sendKeys("samsumg mobiles");
		List<WebElement> ls = driver.findElements(By.cssSelector("[class='_1sFryS _2x2Mmc _3ofZy1']"));
		for (WebElement ele : ls) {
			String title = ele.getText();
			System.out.println(title);
		}
		

	}

}
