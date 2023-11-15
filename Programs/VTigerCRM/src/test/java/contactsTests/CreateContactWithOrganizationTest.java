package contactsTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.*;
import genericUtilities.BaseClass;
import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaFileUtility;
import genericUtilities.PropertyFileUtility;
import genericUtilities.WebDriverUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactWithOrganizationTest extends BaseClass {
	@Test(groups="Regressionsuite")
	public void createContactWithOrgTest() throws Throwable {
		
		//Precondition: Create an Organization
				//commenting below lines after the creation of base class
				//Step1: Create objects for all the user defined utilities
						/*ExcelFileUtility eUtil = new ExcelFileUtility();
						JavaFileUtility jUtil = new JavaFileUtility();
						PropertyFileUtility pUtil = new PropertyFileUtility();
						WebDriverUtility wUtil = new WebDriverUtility();*/
						
						//Step2: Read all the common data from Property File
						/*String BROWSER = pUtil.readDataFromPropertyFile("browser");
						String URL = pUtil.readDataFromPropertyFile("url");
						String USERNAME= pUtil.readDataFromPropertyFile("username");
						String PASSWORD= pUtil.readDataFromPropertyFile("password");*/
						
						////Step3: Read all the necessary Data from Excel file
						String OrgName = eUtil.readDataFromExcelFile("contacts", 7, 2)+jUtil.getRandomNumber();
						String LastName = eUtil.readDataFromExcelFile("contacts", 7, 3);
						
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
							
							
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////						 
                      //step 12: click on contacts link
					   hp.clickOnContactsLink();
					   
					//step 13: click on create contact look up image
				       ContactsPage cp = new ContactsPage(driver);
				       cp.clickOnContactLookUpImg();
				      
				       //Step 14: enter all the mandatory details
				        CreateNewContactPage createContact = new CreateNewContactPage(driver);
				        createContact.createNewContact(driver,LastName,OrgName);
				       
				        //step 15: validate for Contacts
				        ContactsInfoPage cip = new ContactsInfoPage(driver);
						String contactHeader = cip.getHeaderText();
						Assert.assertTrue(contactHeader.contains(LastName));
					    System.out.println("Contact is created: "+contactHeader);
						/*if(contactHeader.contains(LastName))
						{
							System.out.println(contactHeader);
							System.out.println("PASS");
						}
						else
						{
							System.out.println("FAIL");
						}*/
						
						/*//Step 14: Logout
						hp.logoutofApplication(driver);
						
						//Step 15: Close the Browser
						//driver.quit();*/

	}

}
