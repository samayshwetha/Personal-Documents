package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPage {
	
	  @FindBy(xpath="//img[contains(@title,'Create Organization')]")
	  private WebElement createOrgLookUpImage;
	  
	  //rule3:Initialization
		public OrganizationsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//utilization
		public WebElement getOrgLookUpImage() {
			return createOrgLookUpImage;
		}
		
		//Business logic
		/**
		 * This method will click on create organization look up image
		 */
		public void clickonOrgLookUpImg()
		{
			createOrgLookUpImage.click();
		}
		
		
}
