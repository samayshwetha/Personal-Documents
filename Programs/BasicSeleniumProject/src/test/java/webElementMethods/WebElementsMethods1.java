package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethods1 {

	public static void main(String[] args) {
		
		//launching empty browser
				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				
				//launching application
				driver.get("https://demo.actitime.com/login.do");
				
				//maximize the screen
				driver.manage().window().maximize();
				
				//getLocation: x and y cordingates of webelements
				Point cordinates = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getLocation();
				System.out.println("X Coordinate :"+cordinates.getX()+" "+"Y Coordinate :"+cordinates.getY());
				
				//getSize(): find the height and width of the webelement
				Dimension size = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getSize();
				System.out.println("Height is: "+size.height+" Width is: "+size.width);
				
				//getRect(); find the height,width,x and y coordinates
				Rectangle allRect = driver.findElement(By.xpath("//div[@class='atLogoImg']")).getRect();
				System.out.println(allRect.getHeight());
				System.out.println(allRect.getWidth());
				System.out.println(allRect.getX());
				System.out.println(allRect.getY());
				System.out.println(allRect.height);
				

	}

}
