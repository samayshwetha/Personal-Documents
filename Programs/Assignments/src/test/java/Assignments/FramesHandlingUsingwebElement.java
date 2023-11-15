package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingUsingwebElement {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		//switch to frames using webelement
		WebElement frameEle = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frameEle);
		WebElement drag = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement drop = driver.findElement(By.xpath("//span[text()='Trash']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(drag);
		act.release(drop).perform();

	}

}
