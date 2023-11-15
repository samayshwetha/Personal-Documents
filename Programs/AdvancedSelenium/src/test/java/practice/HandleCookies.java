package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCookies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://demo.nopcommerce.com/");
	    Set<Cookie> allCookies = driver.manage().getCookies();
	    System.out.println("Cookie size: "+allCookies.size());
	    for (Cookie cookie : allCookies) {
			System.out.println(cookie.getName());
	    	System.out.println(cookie.getValue());
			System.out.println(cookie.getExpiry());
		}
	 
	    //Adding
	    Cookie objCookie = new Cookie("MyCookie", "Shwetha#$$%$cookie&82345");
	    driver.manage().addCookie(objCookie);
	    allCookies = driver.manage().getCookies();
	    System.out.println("Cookie size: "+allCookies.size());
	    
	    //delete
	    driver.manage().deleteCookie(objCookie);
	    allCookies = driver.manage().getCookies();
	    System.out.println("Cookie size: "+allCookies.size());
	    
	    //
	    driver.manage().deleteCookieNamed(".Nop.Customer");
	    allCookies = driver.manage().getCookies();
	    System.out.println("Cookie size: "+allCookies.size());
	    
	    //
	    driver.manage().deleteAllCookies();
	    allCookies = driver.manage().getCookies();
	    System.out.println("Cookie size: "+allCookies.size());
	      

	}

}
