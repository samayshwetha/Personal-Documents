package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class HomePage extends WebDriverUtility{ //rule1
	
	//rule2: declaration
	@FindBy(linkText ="Contacts") 
	private WebElement contactsLink;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImg;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutLink;
	
	
	//rule3:Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//rule4: Utilzation
	public WebElement getContactsLink() {
		return contactsLink;
	}


	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
		
	public WebElement getAdministratorImg() {
		return administratorImg;
	}

	public WebElement getSignOutLink() {
		return signoutLink;
	}

	
	//Business libraries
	/**
	 * This method will click on Organization link
	 */
	public void clickOnOrganizationLink()
	{
		organizationLink.click();
	}
	
	/**
	 * This method will click on contacts link
	 */
	
	public void clickOnContactsLink()
	{
		contactsLink.click();
	}
	
	/**
	 * This method is used to sign out from the application
	 * @param driver
	 * @throws Throwable
	 */
	public void logoutofApplication(WebDriver driver) throws Throwable
	{
		mouseHover(driver,administratorImg);
		Thread.sleep(1000);
		signoutLink.click();
	}
	
}
