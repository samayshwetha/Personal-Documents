package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import genericUtilities.*;
import objectRepository.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationWithDDT {

	public static void main(String[] args) throws Exception, IOException {
		/*Scenario 2: Launch Browser Login to application with valid credentials 
		Navigate to Organizations link Click on Create Organization look Up Image 
		Create Organization with Mandatory fields Save and Verify logout of Application */
		
		//Step1: Create objects for all the user defined utilities
		ExcelFileUtility eUtil = new ExcelFileUtility();
		JavaFileUtility jUtil = new JavaFileUtility();
		PropertyFileUtility pUtil = new PropertyFileUtility();
		WebDriverUtility wUtil = new WebDriverUtility();
		
		
		//Step2: Read all the common data from Property File
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME= pUtil.readDataFromPropertyFile("username");
		String PASSWORD= pUtil.readDataFromPropertyFile("password");
		
		////Step3: Read all the necessary Data from Excel file
		String OrganizationName = eUtil.readDataFromExcelFile("Organization", 1, 2)+jUtil.getRandomNumber();
		
		//Step4: Launch the Browser // Run Time Polymorphism - driver
		WebDriver driver = null;
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(BROWSER+" launched");
		}
		else if(BROWSER.equalsIgnoreCase("edge"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			System.out.println(BROWSER+" launched");
		}
		else if(BROWSER.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			System.out.println(BROWSER+" launched");
		}
		else
		{
			System.out.println("Invalid Browser Name");
		}
		
		
		//Step5: Maximize the browse and wait for it to load		
		wUtil.maximizeWindow(driver);
		wUtil.waitForPageLoad(driver);
		
		//Step6: Load the Application
		driver.get(URL);
		
		//Step7: Login to Application with valid credentials
		//driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
		LoginPage lp = new LoginPage(driver);
		lp.loginToAPP(USERNAME, PASSWORD);
		
		//Step 8: create an Organization
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrganizationName);
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		
		//Step9: validate organization is created
		String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(contactHeader.contains(OrganizationName))
		{
			System.out.println("PASS: Organization" +contactHeader+ "is created");
		}
		else
		{
			System.out.println("FAIL:Organization"+contactHeader+ "is not created");
		}
				
		//signout from the application
		//Step10: Logout
		WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wUtil.mouseHover(driver, ele);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("SignOut successful");
		
		//exit from the application
		driver.close();
	

	}

}
