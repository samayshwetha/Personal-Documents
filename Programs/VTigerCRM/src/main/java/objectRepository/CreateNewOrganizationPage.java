package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility {
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgNameEdt;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDropDown;
	
	@FindBy(name="accounttype")
	private WebElement typeDropDown;
	
	@FindBy(xpath="(//input[@accesskey='S'])[1]")
	private WebElement saveBtn;
	
	
	//rule3:Initialization
		public CreateNewOrganizationPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

   //rule4:utilization
		public WebElement getOrganizationName() {
			return orgNameEdt;
		}


		public WebElement getIndustryDropDown() {
			return industryDropDown;
		}


		public WebElement getTypeDropDown() {
			return typeDropDown;
		}


		public WebElement getSaveButton() {
			return saveBtn;
		}
		
  //Business logic
	/**
	 * This method create new organization with mandatory fields
	 * @param OrgName
	 */
	public void createNewOrganization(String OrgName)
	{
		orgNameEdt.sendKeys(OrgName);
		saveBtn.click();
	}
	
	/**
	 * This method will create new organization with industry dropdown
	 * @param OrgName
	 * @param industry
	 */
	public void createNewOrganization(String orgName,String industry)
	{
		orgNameEdt.sendKeys(orgName);
		handleDropDown(industry,industryDropDown);
		saveBtn.click();
	}
	
	/**
	 * This method will create new organization with type and industry dropdown values
	 * @param orgName
	 * @param type
	 */
	public void createNewOrganization(String orgName,String industry,String type)
	{
		orgNameEdt.sendKeys(orgName);
		handleDropDown(industry,industryDropDown);
		handleDropDown(type, typeDropDown);
		saveBtn.click();
	}
	
	
	
}
