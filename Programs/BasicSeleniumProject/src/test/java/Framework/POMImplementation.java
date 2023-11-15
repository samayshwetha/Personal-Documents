package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class POMImplementation {

	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.edgedriver().setup();
	//WebDriver driver = new ChromeDriver();
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	FileInputStream fis = new FileInputStream("src/test/resources/credentials.properties.txt");
	Properties pro = new Properties();
	pro.load(fis);
	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");
	
	//Login to Actitime application
	driver.get(URL);
	//create object of Loginpage POM in order to access the test data and locators from POM 
    LoginPage login = new LoginPage(driver);
    login.getUserTextField().sendKeys(USERNAME);
    login.getPwdTextField().sendKeys(PASSWORD);
    login.getLoginButton().click();
    login.getReports().click();
	
	
		
	}

}
