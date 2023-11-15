package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInforPage {
	
	@FindAll({@FindBy(className="dvHeaderText"),@FindBy(xpath="//span[@class='dvHeaderText']")})
	private WebElement OrgHeader;
	
	public OrganizationInforPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgHeader() {
		return OrgHeader;
	}

	//Business logic
	/**
	 * This method will capture the header text and return it to caller
	 * @return 
	 * @return
	 */
	
	public String getHeaderText()
	{
		return OrgHeader.getText();
	}
	
	
}
