package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import genericUtilities.JavaFileUtility;
import genericUtilities.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationChemicalsWithDDT {

	public static void main(String[] args) throws IOException, Exception {
		
		//step1: Create all the required Utility objects
		JavaFileUtility  jUtil = new JavaFileUtility();
		WebDriverUtility driverUtil = new WebDriverUtility();
		PropertyFileUtility pUtil = new PropertyFileUtility();
		ExcelFileUtility eUtil = new ExcelFileUtility();
		
		//step2: Read all the date from the property file
		String URL = pUtil.readDataFromPropertyFile("url");
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String USERNAME = pUtil.readDataFromPropertyFile("username");
		String PASSWORD = pUtil.readDataFromPropertyFile("password");
		
		//Step3: Read all the date from Excel sheet	
		 
		String OrganizationName = eUtil.readDataFromExcelFile("Organization", 4, 2)+jUtil.getRandomNumber();
		String industryDropdown = eUtil.readDataFromExcelFile("Organization", 4, 3);
				
		WebDriver driver=null;
		
		//Step4: Launch the Browser // Run Time Polymorphism - driver
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println(BROWSER+" launched");
		}
		else if(BROWSER.equalsIgnoreCase("Firefox"))
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
		driverUtil.maximizeWindow(driver);
        driverUtil.waitForPageLoad(driver);
		
		//Step6: Load the Application
		driver.get(URL);
		
		//Step7: Login to Application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//Step8: click on Organization tab 
		//click on create Organization image +
		//enter the organization method
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrganizationName);
		
		//Step9: select Industry value as "Chemicals"
		WebElement chePath = driver.findElement(By.xpath("//select[@name='industry']"));
		driverUtil.handleDropDown(chePath, industryDropdown);
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		
		//Step10: validate organization is created
				String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(contactHeader.contains(OrganizationName))
				{
					System.out.println("PASS: Organization" +contactHeader+ "is created");
				}
				else
				{
					System.out.println("FAIL:Organization"+contactHeader+ "is not created");
				}
						
		//Step11 : signout from the application
			WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			driverUtil.mouseHover(driver, ele);
			Thread.sleep(1000);
			driver.findElement(By.linkText("Sign Out")).click();
			System.out.println("SignOut successful");
				
				//exit from the application
				//driver.close();
		
		
	}

}
