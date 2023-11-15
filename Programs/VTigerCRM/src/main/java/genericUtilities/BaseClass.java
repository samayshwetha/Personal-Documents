package genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	
	//Step1: Create objects for all the user defined utilities
	public ExcelFileUtility eUtil = new ExcelFileUtility();
	public JavaFileUtility jUtil = new JavaFileUtility();
	public PropertyFileUtility pUtil = new PropertyFileUtility();
	public WebDriverUtility wUtil = new WebDriverUtility();
	public WebDriver driver = null;
		
	//to use in the listers
	public static WebDriver sdriver;
		
		@BeforeSuite(groups= {"Regressionsuite","smokesuite"})         //DB connection use either alwaysRun=true or groups="smokesuite"
		public void bsConfig()
		{
			System.out.println("---DB connection successfull------");
		}
		
		//@Parameters("browser")
		//@BeforeTest                   //parallel execution
		@BeforeClass(alwaysRun=true)  //Launch the browser
		public void bcConfig(/*String BROWSER*/) throws IOException
		{
			// Read all the common data from Property File
			String BROWSER = pUtil.readDataFromPropertyFile("browser");  //comment it for cross browser testing
			String URL = pUtil.readDataFromPropertyFile("url");
			if(BROWSER.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				System.out.println(BROWSER+" launched");
			}
			else if(BROWSER.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				System.out.println(BROWSER+" launched");
			}
			else if(BROWSER.equalsIgnoreCase("edge"))
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
			
			//to use in the listers
			sdriver=driver;
			
						//Step6: Load the Application
			driver.get(URL);
		}
		
		@BeforeMethod(alwaysRun=true)   //login to application
		public void bmConfig() throws IOException 
		{
			//Login to application----LoginPage POM
			String USERNAME= pUtil.readDataFromPropertyFile("username");
			String PASSWORD= pUtil.readDataFromPropertyFile("password");
			LoginPage lp = new LoginPage(driver);
			lp.loginToAPP(USERNAME,PASSWORD);
			System.out.println("-------Login successfull------------");
	    }
		
		
		@AfterMethod(alwaysRun=true)  //log out of application
		public void amConfig() throws Throwable
		{
			HomePage hp = new HomePage(driver);
			hp.logoutofApplication(driver);
			System.out.println("-------Logout successfull------------");
		}
		
		//@AfterTest
		@AfterClass(alwaysRun=true)   //close the browser
		public void acConfig()
		{
			driver.close();
			System.out.println("-------browser closed------------");
		}
		
		@AfterSuite(alwaysRun=true)    //close db connection
		public void asConfig()
		{
			System.out.println("------DB connection closed----------");
		}

}
