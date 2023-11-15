package PracticeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchPumaShoePrice_Flipkart {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("puma shoes",Keys.ENTER);
		Thread.sleep(2000);
		//first row first price
		String price = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12'][1]/div/div[1]"
				+ "//div[@class='_2B099V']//div[@class='_30jeq3']")).getText();
		System.out.println(price);
		String price1 = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12'][2]/div/div[1]"
				+ "//div[@class='_2B099V']//div[@class='_30jeq3']")).getText();
		System.out.println(price1);
		
		
		//(//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12'][1]//div[@class='_2B099V'])[4]//div[@class='_30jeq3']
		//(//div[@class='_30jeq3'])[position()=2]
		
		
		

	}

}
