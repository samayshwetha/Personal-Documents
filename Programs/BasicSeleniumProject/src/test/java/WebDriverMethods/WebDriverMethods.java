package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) throws Throwable {
		
		//launch the empty driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//get: used to launch the application
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.com/");
		
		//getTitle(): fetching the title of the application/webPage
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//getCurrenturl() : fetching the URL of the webPage
		 //String url = driver.getCurrentUrl();
		 //System.out.println(url);
		 
		 //getPageSource : used to fetch the source code of the webPage
		  /*String code = driver.getPageSource();
		  System.out.println(code);*/
		 
		 //close : used to close the single tab/window
		 //driver.close();
		 
		 //quit() : used to close the all single tab/window
		 //driver.quit();
		 
		 //manage(): to maximize the browser window
		/* Options opt = driver.manage();
		 Window win = opt.window();
		 win.maximize();*/
		 
		 //driver.manage().window().maximize();
		 //driver.manage().window().minimize();  //does not work for below 4.9.1. versions
		 //driver.manage().window().fullscreen();
		 
		 //navigate method to launching the apps but not recommended one bcoz it wont wait for the website to launch
		
		/*driver.navigate().to("https://www.amazon.com/");	
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();*/
		
		
		
	
		
		
		 
          
	}

}
