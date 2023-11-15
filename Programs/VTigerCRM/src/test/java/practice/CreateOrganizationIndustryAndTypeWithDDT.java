package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrganizationIndustryAndTypeWithDDT {

	public static void main(String[] args) throws IOException, Exception {
	
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
		String OrganizationName = wb.getSheet("Organization").getRow(7).getCell(2).getStringCellValue();
		String industryDropdown = wb.getSheet("Organization").getRow(7).getCell(3).getStringCellValue();
		String TypeDropdown = wb.getSheet("Organization").getRow(7).getCell(4).getStringCellValue();
				
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
		
		
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Step 2: Load the Application
		driver.get(URL);
		
		//Step 3: Login to Application
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();
		
		//create an Organization and select Industry value as Chemicals
		driver.findElement(By.xpath("//td[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(OrganizationName);
		//select Industry
		WebElement chePath = driver.findElement(By.xpath("//select[@name='industry']"));
		Select sel = new Select(chePath);
		sel.selectByValue(industryDropdown); 
		//select Type
		WebElement typeDrop = driver.findElement(By.name("accounttype"));
		Select sel1 = new Select(typeDrop);
		sel1.selectByIndex(3);
		
		
		//click on save
		driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();
		
		//validate organization is created
				String contactHeader = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
				
				if(contactHeader.contains(OrganizationName))
				{
					System.out.println("PASS: Organization is created");
				}
				else
				{
					System.out.println("FAIL:Organization is not created");
				}
				
				
				//signout from the application
				//Step 9: Logout
				WebElement ele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				Actions act = new Actions(driver);
				act.moveToElement(ele).perform();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Sign Out")).click();
				System.out.println("SignOut successful");
				
				//exit from the application
				//driver.close();
		
		
	}

}
