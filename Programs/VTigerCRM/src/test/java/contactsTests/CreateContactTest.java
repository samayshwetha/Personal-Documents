package contactsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import objectRepository.*;
import genericUtilities.*;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(genericUtilities.ListenerImplementationClass.class)  // we can add at suite level also
public class CreateContactTest extends BaseClass {

	@Test(groups={"smokesuite","Regression"})
	public void createContactTest() throws Throwable {
		
		//commenting below lines after Baseclass
		//Step1: Create objects for all the user defined utilities
		/*ExcelFileUtility eUtil = new ExcelFileUtility();
		JavaFileUtility jUtil = new JavaFileUtility();
		PropertyFileUtility pUtil = new PropertyFileUtility();
		WebDriverUtility wUtil = new WebDriverUtility();
		
		//Step2: Read all the common data from Property File
		String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME= pUtil.readDataFromPropertyFile("username");
		String PASSWORD= pUtil.readDataFromPropertyFile("password");*/
		
		String LastName = eUtil.readDataFromExcelFile("contacts", 1, 2)+jUtil.getRandomNumber();
		
		//Step4: Launch the Browser // Run Time Polymorphism - driver
		/*WebDriver driver = null;
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
		
		//step7: Login to application
		LoginPage lp = new LoginPage(driver);
		lp.loginToAPP(USERNAME, PASSWORD);*/
		
		//Step8: click on contacts link on home page
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsLink();
		
		//step9: click on create contact look up image
		ContactsPage contpg = new ContactsPage(driver);
		contpg.clickOnContactLookUpImg();
		
		//If you want to fail any scripts
		//Assert.fail();
		
		//step10: enter all mandatory fileds
		CreateNewContactPage createpage = new CreateNewContactPage(driver);
		createpage.createNewContact(LastName);
		
		//step11: validation
		ContactsInfoPage infoPage = new ContactsInfoPage(driver);
	    String contactHeader = infoPage.getHeaderText();
	    Assert.assertTrue(contactHeader.contains(LastName));
	    System.out.println("Contact is created: "+contactHeader);
	    
	    //commenting below lines because of assertion
	    /*if(contactHeader.contains(LastName))
	    {
	    	System.out.println(contactHeader);
	    	System.out.println("contacts is created");
	    }
	    else
	    {
	    	System.out.println("Contacts creation is Failed");
	    }*/
		
		/*//step11: logout of the application
		hp.logoutofApplication(driver);*/
		

	}

	@Test
	public void demo()
	{
		System.out.println("Demo Script");
		//If you want to fail any scripts
	     Assert.fail();
	}
}
