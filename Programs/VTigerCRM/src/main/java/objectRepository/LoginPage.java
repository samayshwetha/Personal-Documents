package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {  //rule1
	
	//rule: declaration
	@FindBy(name="user_name") private WebElement userNameEdit;
	
	@FindBy(name="user_password") private WebElement passwordEdit;
	
	@FindAll({@FindBy(xpath="//input[@type='submit']"),@FindBy(id="submitButton")}) 
	private WebElement loginBtn;
	
	//rule3: Initialization
	public LoginPage(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	//rule4: Utilization
	public WebElement getUserNameEdit() {
		return userNameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	/**
	 * This method will login to application
	 * @param USERNAME
	 * @param PASSWORD
	 */
	
  //Business library generic methods according to the need of project
	public void loginToAPP(String USERNAME, String PASSWORD)
	{
		userNameEdit.sendKeys(USERNAME);
		passwordEdit.sendKeys(PASSWORD);
		loginBtn.click();
	}
	
	
	
	
	
}
