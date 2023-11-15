package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import genericUtilities.*;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithOrganizationEndToEnd {

	public static void main(String[] args) throws Throwable {
		
		//Precondition: Create an Organization
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
				String OrgName = eUtil.readDataFromExcelFile("contacts", 7, 2)+jUtil.getRandomNumber();
				String LastName = eUtil.readDataFromExcelFile("contacts", 7, 3);
				
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
				driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.ENTER);
				
				//Step 8: create an Organization
				driver.findElement(By.xpath("//td[.='Organizations']")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrgName);
				driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
				
				//Step9: validate organization is created
				String OrgHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if(OrgHeader.contains(OrgName))
				{
					System.out.println("PASS: Organization " +OrgHeader+ " is created");
				}
				else
				{
					System.out.println("FAIL:Organization "+OrgHeader+ " is not created");
				}
		
				
				////Create contact with organization created in precondition
				//Step 10: Navigate to Contacts LInk
				driver.findElement(By.linkText("Contacts")).click();
				
				//Step 11: Click on create conatct look up Image
				driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
				
				//Step 12: enter the last name
				driver.findElement(By.name("lastname")).sendKeys(LastName);
				
				//Step13: click on Organization lookup image
				driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
				
				//Step14: switch to window "Organizations" and select newly created org in step8
				wUtil.switchToWindows(driver, OrgHeader);
				driver.findElement(By.name("search_text")).sendKeys(OrgName);
				driver.findElement(By.name("search")).click();
				driver.findElement(By.xpath("//a[text()='"+OrgName+"']")).click();
				
				//Step 15:click on save button
				wUtil.switchToWindows(driver, "Contacts");
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
				Thread.sleep(1000);
				
				
				String ContactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				if (ContactHeader.contains(LastName)) {
					System.out.println(ContactHeader);
					System.out.println("PASS");
				} else {
					System.out.println("FAIL");
				}
				
				//step16:signout
				WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				wUtil.mouseHover(driver, ele);
				Thread.sleep(1000);
				driver.findElement(By.linkText("Sign Out")).click();
				System.out.println("SignOut successful");

	}

}
