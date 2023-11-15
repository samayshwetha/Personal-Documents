package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility {
	
	//declaration
	@FindAll({@FindBy(name="lastname"),@FindBy(xpath="//input(type='text')")})
	private WebElement lastNameTxtField;
	
	@FindAll({@FindBy(className="crmButton small save"),@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")})
    private WebElement saveBtn;
	
	@FindBy(xpath="(//img[@title='Select'])[1]")
	private WebElement organizationImgLookUp;
	
	@FindBy(name="search_text")
	private WebElement orgSearchEdit;
	
	@FindBy(name="search")
	private WebElement orgSearchbtn;
	
	
	//Initialization
	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getLastNameTxtField() {
		return lastNameTxtField;
	}

	public WebElement getSaveButton() {
		return saveBtn;
	}

	public WebElement getOrganizationImgLookUp() {
		return organizationImgLookUp;
	}
	
	//Business logic
	/**
	 * This method will create new contacts using lastname
	 * @param LASTNAME
	 */
	 public void createNewContact(String LASTNAME)
	 {
		 lastNameTxtField.sendKeys(LASTNAME);
		 saveBtn.click();
		 
	 }

	 public void createNewContact(WebDriver driver,String LASTNAME, String ORGNAME)
	 {
		 lastNameTxtField.sendKeys(LASTNAME);
		 organizationImgLookUp.click();
		 switchToWindows(driver,"Accounts");
		 orgSearchEdit.sendKeys(ORGNAME);
		 orgSearchbtn.click();
		 driver.findElement(By.xpath("//a[text()='"+ORGNAME+"']")).click();
		 switchToWindows(driver,"Contacts");
		 saveBtn.click();
		 		 
	 }
	
	
	

}

