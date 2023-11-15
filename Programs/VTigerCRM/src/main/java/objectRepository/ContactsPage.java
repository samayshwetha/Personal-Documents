package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {
	
	//declaration
	@FindBy(xpath="//img[contains(@title,'Create Contact')]")
	private WebElement createContactLookUpImg;
	
	//Initialization
	public ContactsPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateContactLookUpImg() {
		return createContactLookUpImg;
	}
	
	//Business logic
	/**
	 * This method click on create contact look up image
	 */
	public void clickOnContactLookUpImg()
	{
		createContactLookUpImg.click();
	}
	

}
