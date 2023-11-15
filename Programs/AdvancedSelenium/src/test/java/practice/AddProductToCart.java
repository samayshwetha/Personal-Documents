package practice;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProductToCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//launch appl
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma shoes",Keys.ENTER);
		/*WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("puma shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();*/
		
		driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[1]")).click();
		String webTitle=" ";
		Set<String> winIds = driver.getWindowHandles();
		 for (String id : winIds) {
			  driver.switchTo().window(id);
			  webTitle  = driver.getTitle();
			//System.out.println(driver.getTitle());
			 if(webTitle.contains("Buy Puma mens Snatch V2 Black-White Sneaker"))
			 {
				 break;
			 }
		}
		 Thread.sleep(1000);
		driver.findElement(By.name("submit.add-to-cart")).click();
		driver.findElement(By.id("nav-cart-count-container")).click();
		
		if(webTitle.contains("8 UK (39178301)"))
		{
			System.out.println("The product" +webTitle+ "is added to cart successfully");
		}
		else
			
		{
			System.out.println("The product " +webTitle+ " is not added to cart successfully");
		}
	}

}
