package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver  driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	    
	    //case1:
	    /*driver.get("https://jqueryui.com/droppable/");
	    WebElement frm = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	    driver.switchTo().frame(frm);
	    //driver.switchTo().frame(0);
	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag, drop).perform();*/
	     
	    
	    //switching to frame using id/name attribute
	    driver.get("https://demo.automationtesting.in/Frames.html");
	    Thread.sleep(2000);
	    driver.switchTo().frame("singleframe");
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shwetha");
	    
	   

	}

}
