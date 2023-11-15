package organizationTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import genericUtilities.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationInforPage;
import objectRepository.OrganizationsPage;
public class CreateMultipleOrgswithIndustry extends BaseClass {
	
	/*ExcelFileUtility eUtil  = new ExcelFileUtility();
	JavaFileUtility  jUtil  = new JavaFileUtility();
	PropertyFileUtility pUtil = new PropertyFileUtility();
	WebDriverUtility wUtil = new WebDriverUtility();*/
	
	@Test(dataProvider = "getdata")
	public void createMultipleOrg(String orgname, String INDUSTRY) throws Throwable
	{
		//Read data from the property file
		/*String BROWSER = pUtil.readDataFromPropertyFile("browser");
		String URL = pUtil.readDataFromPropertyFile("url");
		String USERNAME= pUtil.readDataFromPropertyFile("username");
		String PASSWORD= pUtil.readDataFromPropertyFile("password");
		WebDriver driver = null;*/
		
		String ORGNAME = orgname+jUtil.getRandomNumber();
		
		//Launch browser
		/*if(BROWSER.equalsIgnoreCase("chrome"))
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
		
		//Step7: Login to application----LoginPage POM
		 LoginPage lp = new LoginPage(driver);
		 lp.loginToAPP(USERNAME,PASSWORD);*/
		 
		//Step8: click on createOrganization----Home page POM
		 HomePage hp = new HomePage(driver);
		 hp.clickOnOrganizationLink();
		 
		 //step 9: click on org lookup imge
		 OrganizationsPage op = new OrganizationsPage(driver);
		 op.clickonOrgLookUpImg();
		 
		 //step 10: enter all the mandatory details and create org
		 CreateNewOrganizationPage createorg = new CreateNewOrganizationPage(driver);
		 createorg.createNewOrganization(ORGNAME, INDUSTRY);
		 wUtil.captureScreenShot(driver, ORGNAME);
		 
		//Step 11: Validate for Organization
		 OrganizationInforPage oip = new OrganizationInforPage(driver);
			String orgHeader = oip.getHeaderText();
			Assert.assertTrue(orgHeader.contains(ORGNAME));
			System.out.println("Organization is created: "+orgHeader);
			/*if(orgHeader.contains(ORGNAME))
			{
				System.out.println(orgHeader);
				System.out.println("Organization Created");
			}
			else
			{
				System.out.println("FAIL");
			}*/
		/*//Step 14: Logout
		hp.logoutofApplication(driver);*/
		
	}
	
	@DataProvider
	public Object[][] getdata() throws EncryptedDocumentException, IOException
	{
		return eUtil.ReadMultipleData("MultipleOrganization");
	}
	

}
