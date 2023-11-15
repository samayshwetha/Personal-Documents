package webElementMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 /*driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();*/
		 
		 Thread.sleep(2000);
		/* WebElement path = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 path.sendKeys("puma");
		 path.submit();
				 
		 //webelement methods
		 WebElement pathTitle = driver.findElement(By.xpath("//a[contains(@id,'nav-logo')]"));
		 String size = pathTitle.getCssValue("font-size");
		 System.out.println(size);
		 
		 //color of title 
		 String color = pathTitle.getCssValue("color");
		 System.out.println(color);*/
		 
		 //getLocation: x and y cordingates of webelements
		/*WebElement pathImage = driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']"));
		Point coordinate = pathImage.getLocation();
		System.out.println("X co-orinatecoordinate : "+coordinate.getX()+ " "+"Y co-orinatecoordinate : "+coordinate.getY());
		
		 //getSize(): find the height and width of the webelement
		 //Dimension dime = driver.findElement(By.xpath("//*[contains(@class,'icp-nav-flag')]")).getSize();
		Dimension dime = driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']")).getSize();
		 System.out.println("Height is :"+dime.height+" and "+ "Width is : "+dime.width);
		 
		//getRect(): used to find the height and width and x and y coordinates of webelement
		  WebElement pathImage1 = driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']"));
		  Rectangle sizeWebEle = pathImage1.getRect();
		  System.out.println(sizeWebEle.getHeight());
		  System.out.println(sizeWebEle.getWidth());
		  System.out.println(sizeWebEle.getX());
		  System.out.println(sizeWebEle.getY());*/
		  
		  //clear(): to erase the content
		//launching application
		/*driver.get("https://demo.actitime.com/login.do");
			
		//maximize the screen
		driver.manage().window().maximize();*/
		
		//find teh path of username
		  /* WebElement clearData = driver.findElement(By.id("username"));
		 
		   clearData.sendKeys("admin");
		   Thread.sleep(2000);
		   clearData.clear();
		   Thread.sleep(2000);
		   clearData.sendKeys("admin");*/
		
		//isDisplayed(): to check the web element displayed or not
		 /*WebElement logo = driver.findElement(By.xpath("//*[@class='atLogoImg']"));
		 if (logo.isDisplayed())
		 {
			 System.out.println("logo is displayed");
		 }
		 else {
			   System.out.println("logo is not displayed");
		 }
		  
		 
		 //is Enabled(): to check the web element enabled  or not
		 WebElement userField = driver.findElement(By.id("username"));
		 if (userField.isEnabled())
		 {
			 userField.sendKeys("admin");
			 Thread.sleep(2000);
			 userField.clear();
			 System.out.println("is enabled");
		 }
		 else
		 {
			 System.out.println("is not enabled");
		 }
		 
		  //isSelected(); to check whetehre checkbox is selected or not
		 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		 checkbox.click();
		 Thread.sleep(2000);
		 if(checkbox.isSelected())
		 {
			 System.out.println("checkbox is checked");
		 }
		 else
		 {
			 System.out.println("checkbox is not checked");
		 }*/
		
		
		//getAttribute(): Fetch the attribute value for the attributes
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement attriPath = driver.findElement(By.id("username"));
		System.out.println(attriPath.getAttribute("placeholder"));
		String attriValue = driver.findElement(By.name("pwd")).getAttribute("class");
		System.out.println(attriValue);
		
		//getTagName : fetch the tagname of webelemenet by using the attribute name
		String tagName = attriPath.getTagName();
		System.out.println("Tagname f username: "+tagName);
		 
		String tagName1= driver.findElement(By.xpath("//div[@class='atLogoImg']")).getTagName();
		System.out.println("Tagname of logo: "+tagName1);
		 
		//getAriaRole: capture the type of web element(ex:checkbox,textbox) : try in version 4
		/* driver.get("https://demo.actitime.com/login.do");
		 driver.manage().window().maximize();
		 WebElement attriPath = driver.findElement(By.id("username"));
	     System.out.println(attriPath.getAriaRole());*/

	}

}
