package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		
		//case1:
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(2000);
		for (WebElement ele : eles) {
			Thread.sleep(2000);
			System.out.println(ele.getText());
			String text = ele.getText();
			if(text.equalsIgnoreCase("puma slippers for men"))
			{
				ele.click();
				break;
			}
			
		}*/
		
		//case2: Bluetooth
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike");
		//Thread.sleep(1000);
		List<WebElement> alleles = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		Thread.sleep(4000);
		for (WebElement ele : alleles) {
			Thread.sleep(2000);
			System.out.println(ele.getText());
			
		}
		
	}

}
