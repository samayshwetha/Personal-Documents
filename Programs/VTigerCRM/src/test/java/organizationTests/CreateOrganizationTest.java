package organizationTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.CreateNewOrganizationPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.OrganizationInforPage;
import objectRepository.OrganizationsPage;

public class CreateOrganizationTest extends BaseClass {
	
	@Test(groups="smokesuite")
	public void createOrgTest() throws Throwable {
		//Precondition: Create an Organization
		//Commenting below lines after Base class
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
				
				////Step3: Read all the necessary Data from Excel file
				String OrgName = eUtil.readDataFromExcelFile("contacts", 7, 2)+jUtil.getRandomNumber();
				
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
				 createorg.createNewOrganization(OrgName);
				 
				//Step 11: Validate for Organization
				 OrganizationInforPage oip = new OrganizationInforPage(driver);
					String orgHeader = oip.getHeaderText();
					Assert.assertTrue(orgHeader.contains(OrgName));
					System.out.println("Organization is created: "+orgHeader);
					/*if(orgHeader.contains(OrgName))
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
					
				//Step 15: Close the Browser
					//driver.quit();
	}

}
