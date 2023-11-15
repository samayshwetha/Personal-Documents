package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Initialization by using constructors
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//Declaration
	@FindBy(id="username")
	private WebElement userTextField;
	
	@FindBy(name="pwd")
	private WebElement pwdTextField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="container_reports")
	private WebElement reports;

	
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getReports() {
		return reports;
	}

	
	
	
	//by using getter method we can read the data in the other classes
	
}
