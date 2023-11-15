package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfoPage {
	
	@FindBy(xpath="//span[@class='dvHeaderText']")
	private WebElement contactheaderText;
	
	public ContactsInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactheaderContent() {
		return contactheaderText;
	}
	
	/**
	 * This method will capture the header and return it to caller
	 * @return
	 */
	public String getHeaderText()
	{
		return contactheaderText.getText();
	}

	
}
