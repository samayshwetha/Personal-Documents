package AdvancedScenariosPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandListBox {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		
		//Case1:  Using key class controls
		/*driver.findElement(By.id("day")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.findElement(By.id("year")).sendKeys(Keys.ARROW_DOWN);*/
		
		//Case2: By using the locators
		/*driver.findElement(By.id("day"));
		driver.findElement(By.xpath("//*[.='10']")).click();
		driver.findElement(By.id("month"));
		driver.findElement(By.xpath("//*[.='Oct']")).click();
		driver.findElement(By.id("year"));
		driver.findElement(By.xpath("//*[.='1983']")).click();*/
		
		//case3:by using select class
		WebElement day = driver.findElement(By.id("day"));
		Select sel = new Select(day);
		sel.selectByIndex(5);
		WebElement month = driver.findElement(By.id("month"));
		Select sel1 = new Select(month);
		sel1.selectByValue("6");
		WebElement year = driver.findElement(By.id("year"));
		Select sel2 = new Select(year);
		sel2.selectByVisibleText("2016");
	}

}
