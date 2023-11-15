package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class Properties_File {

	public void Properties_File() throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//launching application
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step1: physical representation of file in the java script /connect java with particular file
		 FileInputStream fis = new FileInputStream("src/test/resources/credentials.properties.txt");
		 //or directly pass the file path
		//FileInputStream fis = new FileInputStream("D:\\Selenium\\Programs\\credentials.properties.txt");
		 
		//step2: read the data from the properties file / load the properties file in java system
		Properties pro = new Properties();
		pro.load(fis);
		
		//step3: fetch the data/key from property file
		 String URL = pro.getProperty("url");
		 String USERNAME = pro.getProperty("username");
		 String PASSWORD = pro.getProperty("password");
		 
		 //ste4: call the keys in the scripts
		 driver.get(URL);
		 driver.findElement(By.id("username")).sendKeys(USERNAME);
		 driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		 driver.findElement(By.id("loginButton")).click();
		
		
	}

}
