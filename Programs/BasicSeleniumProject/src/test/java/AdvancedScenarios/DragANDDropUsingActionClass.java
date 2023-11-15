package AdvancedScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragANDDropUsingActionClass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		
		 WebElement dragPath = driver.findElement(By.id("draggable"));
		 WebElement dropPath = driver.findElement(By.id("droppable"));
		 
		//create action class object
		  /*Actions act = new Actions(driver);
	
		///case1: drag and drop the web element
		//act.dragAndDrop(dragPath, dropPath).perform();
		
		///case 2: drag and drop the web element
		  act.clickAndHold(dragPath).perform();
		  act.release(dropPath).perform();*/
		
		///case3
		//act.clickAndHold(dragPath).release(dropPath).perform();
		
		//perform double click operations
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement path = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(path).perform();
		
	
		

	}

}
