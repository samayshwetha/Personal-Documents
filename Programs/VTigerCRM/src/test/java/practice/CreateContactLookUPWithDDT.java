package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;


public class CreateContactLookUPWithDDT {

	public static void main(String[] args) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub
		
			//Step 1: Read all the necessary Data
				
				 /*read data from property file-common data*/
				FileInputStream fisp = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
				Properties p = new Properties();
				p.load(fisp);
				String URL = p.getProperty("url");
				String BROWSER = p.getProperty("browser");
				String USERNAME = p.getProperty("username");
				String PASSWORD = p.getProperty("password");
				
				 /*read data from excel-test data*/
				FileInputStream fise = new FileInputStream(".\\src\\test\\resources\\TestDataAdvanced.xlsx");
				Workbook wb = WorkbookFactory.create(fise);
				String LASTNAME = wb.getSheet("Contacts").getRow(1).getCell(2).getStringCellValue();
				
				WebDriver driver=null;
				
				//Step 2: Launch the Browser // Run Time Polymorphism - driver
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
				
				WebDriverUtility driverUtil = new WebDriverUtility();
				driverUtil.maximizeWindow(driver);
		       // driverUtil.waitForPageLoad(driver);
				
				//Step 2: Load the Application
				driver.get(URL);
				
				//Step 3: Login to Application
				/*driver.findElement(By.name("user_name")).sendKeys(USERNAME);
				driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
				driver.findElement(By.id("submitButton")).click();*/
				LoginPage lp = new LoginPage(driver);
				lp.getUserNameEdit().sendKeys(USERNAME);
				lp.getPasswordEdit().sendKeys(PASSWORD);
				lp.getLoginBtn().click();
				
				//Step 4: Navigate to Contacts LInk
				driver.findElement(By.linkText("Contacts")).click();
				
				//Step 5: Click on create conatct look up Image
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				
				//Step 6: create conatct
				driver.findElement(By.name("lastname")).sendKeys(LASTNAME);
				
				//Step 7: Save
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				
				//Step 8: Validate
				String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				
				if(contactHeader.contains(LASTNAME))
				{
					System.out.println("PASS");
				}
				else
				{
					System.out.println("FAIL");
				}
								
				//Step 9: Logout
				WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				
				driverUtil.mouseHover(driver, ele);
				Thread.sleep(1000);
				
				driver.findElement(By.linkText("Sign Out")).click();
				
				System.out.println("SignOut successful");
			
	
				
			}

		}


	


