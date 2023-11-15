package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.*;

public class EmptyBrowser {

	public static void main(String[] args) {
		
		//case1:
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver(); //firefox is not installed
		
		/*String key = "webdriver.chrome.driver";
		String value = "/.chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver = new ChromeDriver();*/
		
		
		//case4: by adding wedrivermanager dependencies
		WebDriverManager.chromedriver().setup();
		
		/*WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();*/
		
		
	}

}
