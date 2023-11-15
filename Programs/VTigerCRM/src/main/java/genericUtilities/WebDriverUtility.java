package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This method consists of all generic methods related to webDriver actions
 * @author Snadagi
 *
 */

public class WebDriverUtility {
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();  //browser launched and maximized
	}

	/**
	 * This method will minimize the window
	 * @param driver
	 */
	
	/*public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();  
	}*/
	
	/**
	 * This method will wait for the web page to load 
	 * 
	 * @param driver
	 */
	public void waitForPageLoad(WebDriver driver)
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	/**
	 * This method will wait for the particular element to be visible in the DOM
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
	    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * This method will wait for the particular element to be clickable in the DOM
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will handle dropdown by value
	 * @param element
	 * @param value
	 */
	public void handleDropDown(WebElement element, String value)
	{
		  Select sel = new Select(element);
		  sel.selectByValue(value);
	}
	
	/**
	 * This method will handle dropdown by index
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, int index)
	{
		  Select sel = new Select(element);
		  sel.selectByIndex(index);
	}
	
	/**
	 * This method will handle dropdown by visible Text
	 * @param text
	 * @param element
	 */
	public void handleDropDown(String text,WebElement element)
	{
		  Select sel = new Select(element);
		  sel.selectByVisibleText(text);
	}
	
	/**
	 * This method will close the random pop ups by clicking on free space
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void moveAndClick(WebDriver driver)
	{
		  Actions act = new Actions(driver);
		  act.moveByOffset(10, 10).click().perform();;
	}
	/**
	 * This method will drag and drop the web elements from one element path to another element path
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void dragAndDrop(WebDriver driver,WebElement source, WebElement destination)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
		
	}
	/**
	 * This method will perform double click on the web element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver,WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform right click operation on the web element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver,WebElement element)
	{
		
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will perform mouse hover action
	 * @param driver
	 * @param element
	 */
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method is used to switch to frames using index value
	 * @param driver
	 * @param index
	 */
/////////////////////////////////////////////////////////////////////////////FramesHandling//////////////////////////////////////////////////////	
	public void switchToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	/**
	 * This method is used to switch to frames using id/name (attribute name)
	 * @param driver
	 * @param id
	 */
	public void switchToFrame(WebDriver driver,String Nameorid)
	{
		driver.switchTo().frame(Nameorid);
	}
	/**
	 * This method is used to switch to frames using webelement
	 * @param name
	 * @param driver
	 */
	public void switchToFrame(WebElement element,WebDriver driver)
	{
		driver.switchTo().frame(element);
	}
	
	
	////////////////////////////////////////////////////////////javascriptExecutor////////////////////////////////////////////////////////////////
	/**
	 * This method will scroll down by 1000 units
	 * @param driver
	 */
	public void ScrollActionDown(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
	}
	
	/**
	 * This method will scroll up by 1000 units
	 * @param driver
	 */
	public void ScrollActionUp(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-1000)");
	}
	
	///////////////////////////////////////////////////////////////AlertPopup////////////////////////////////////////////////////////////////////
	/**
	 * This method  will accept the alert popup
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	 {
		  Alert al = driver.switchTo().alert();
		  al.accept();
		
	 }
	
	/**
	 *  This method will cancel the alert popup
	 * @param driver
	 */
	 public void dismissAlert(WebDriver driver)
	 {
		  Alert al = driver.switchTo().alert();
		  al.dismiss();
	 }
	 /**
	  * This method will fetch the alert text and return to the caller
	  * @param driver
	  * @return
	  */
	 public String getAlertText(WebDriver driver)
	 {
		return driver.switchTo().alert().getText();
		
	 } 
	 
	 //////////////////////////////////////////////////////////////WINDOWHANDLING/////////////////////////////////////////////////////////////////
	 /**
	  * This method is used to switch between the one windows to another using titles
	  * @param driver
	  * @param title
	  */
	 public void switchToWindows(WebDriver driver, String partialWintitle)
	 {
		//step1: get all the window ids 
		Set<String> allwinIds = driver.getWindowHandles();
		
		//step2: navigate through each window
		for (String id : allwinIds) {
		
		//step3: switch to each window and capture the title
	    driver.switchTo().window(id);
	    
	    //step4: compare actTitle with expected Partial title
	 	String acttitle = driver.getTitle();
	    if(acttitle.contains(partialWintitle))
	    {
	    	break;
	    }
			
		}
	 
	 }
	 
	
	 ////////////////////////////////////////////////////////TakeScreenshots//////////////////////////////////////////////////////////
	 /**
	  * 
	  * @param driver
	  * @param screenshotname
	  * @return
	  * @throws IOException
	  */
	  
	  
	 public String captureScreenShot(WebDriver driver, String screenshotname) throws IOException
	 {
		  TakesScreenshot ts = (TakesScreenshot)driver;
		   File scr = ts.getScreenshotAs(OutputType.FILE);
		   File dest = new File(".\\screenshots\\"+screenshotname+".png");
		   //File dest = new File(".\\shwetha"+screenshotname+".png");
		  
		   Files.copy(scr, dest);
		   return dest.getAbsolutePath();  //used for extent report
		  
	 }
	 
	 
}
