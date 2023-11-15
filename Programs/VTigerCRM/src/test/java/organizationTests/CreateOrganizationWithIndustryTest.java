package organizationTests;

import java.io.IOException;

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

public class CreateOrganizationWithIndustryTest extends BaseClass {
    @Test
	public void CreateOrgaWithIndustryTest() throws Throwable {
					
						////Step3: Read all the necessary Data from Excel file
						String OrgName = eUtil.readDataFromExcelFile("Organization", 7, 2)+jUtil.getRandomNumber();
						String Industry = eUtil.readDataFromExcelFile("Organization", 7, 3); 
						String Type = eUtil.readDataFromExcelFile("Organization", 7, 4); 
												 
						//Step8: click on createOrganization----Home page POM
						 HomePage hp = new HomePage(driver);
						 hp.clickOnOrganizationLink();
						 
						 //step 9: click on org lookup imge
						 OrganizationsPage op = new OrganizationsPage(driver);
						 op.clickonOrgLookUpImg();
						 
						 //step 10: enter all the mandatory details and create org
						 CreateNewOrganizationPage createorg = new CreateNewOrganizationPage(driver);
						 createorg.createNewOrganization(OrgName,Industry,Type);
						 
						//Step 11: Validate for Organization
						 OrganizationInforPage oip = new OrganizationInforPage(driver);
						 String orgHeader = oip.getHeaderText();
						 Assert.assertTrue(orgHeader.contains(OrgName));
						 System.out.println("Organization is created with Industry type : "+orgHeader + " "+Industry);
						 
							
	}
    
    @Test(groups="smokesuite")
	public void createOrgTest() throws Throwable {
				////Step3: Read all the necessary Data from Excel file
				String OrgName = eUtil.readDataFromExcelFile("contacts", 1, 2)+jUtil.getRandomNumber();
				
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
					System.out.println("Organization is created without Industry: "+orgHeader);
}


}
