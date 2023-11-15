package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//path for search bar
		WebElement searchPath = driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']"));
		searchPath.sendKeys("shoes");
		//searchPath.submit();
		searchPath.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Fetch First shoe price
		//(//h5[@class='sc-eDvSVe dwCrSh'])[1]
		//(//h5[@class='sc-eDvSVe dwCrSh'])[position()=1]
		String shoePrice1 = driver.findElement(By.xpath("//*[text()='Layasa Sneakers For Women']/..//h5[@class='sc-eDvSVe dwCrSh']")).getText();
		System.out.println(shoePrice1);
		
		//Fetch First shoe price
		String shoePrice2 = driver.findElement(By.xpath("//*[text()='Modern Fashionable Men Casual Shoes']/..//h5[@class='sc-eDvSVe dwCrSh']")).getText();
		System.out.println(shoePrice2);
	}

}
