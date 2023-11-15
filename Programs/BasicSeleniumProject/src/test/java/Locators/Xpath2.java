package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//Fetch puma price in amazon
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//Search puma shoes
		WebElement path =driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		path.sendKeys("puma");
		path.submit();
		
		//fetch unisex-adult Popcat 20 Sandal price 
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("//span[.='unisex-adult Popcat 20 Sandal']/../../../../div[4]/div/a/span/span[@class='a-offscreen']")).getText();
		System.out.println(text);

       String text1 = driver.findElement(By.xpath("//span[@class='rush-component s-latency-cf-section']/div/div[4]//div[@class='a-section a-spacing-base a-text-center']/div[2]/div[4]/div/a[contains(@class,'a')]/span[@class='a-price']/span[1]")).getText();
	   System.out.println(text1);*/
		
		
		//Fetch bigbasket green apple price
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		
		//Search apple
		Thread.sleep(1000);
		WebElement path = driver.findElement(By.xpath("//input[@qa='searchBar']"));
		path.sendKeys("apple");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//path.submit();
		
		//fetch green apple price
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//span[contains(@ng-bind,'vm.selectedProduct.sp.replace(')])[7]")).getText();
		//String text3 = driver.findElement(By.xpath("(//span[contains(@ng-bind,'vm.selectedProduct.sp.replace(')])[positon()=7]")).getText();
		//using following sibling
		String text1 = driver.findElement(By.xpath("//a[text()='Apple - Green, Regular']/../following-sibling::div[2]/div/div//h4/span[2]//span[@class='ng-binding']")).getText();
		String text2 = driver.findElement(By.xpath("//a[text()='Apple - Green, Regular']/../following-sibling::div[2]/div/div/h4//span[2]/span")).getText();
		String text3 = driver.findElement(By.xpath("//a[text()='Apple - Green, Regular']/../following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//span[@class='discnt-price']")).getText();
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
	    System.out.println(text3);
		
		
		
		//fetch 2 puma shoes price for flip kart
		
	}

}
