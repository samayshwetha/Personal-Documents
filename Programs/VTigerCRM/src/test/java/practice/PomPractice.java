package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.*;

public class PomPractice {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		Thread.sleep(2000);
		LoginPage lp = new LoginPage(driver);
		lp.getUserNameEdit().sendKeys("admin");
		lp.getPasswordEdit().sendKeys("admin");
		lp.getLoginBtn().click();
		
		

	}

}
