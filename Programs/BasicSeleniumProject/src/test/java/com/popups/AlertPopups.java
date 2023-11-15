package com.popups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
				
		//read data from property file for admin and password
		FileInputStream fis = new FileInputStream("src/test/resources/credentials.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		//launching application
		driver.get(URL);
		driver.manage().window().maximize();
		
		//version3--implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter username,password and click on ok using keys class
		//driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		driver.findElement(By.id("username")).sendKeys(USERNAME,Keys.TAB,PASSWORD,Keys.TAB,Keys.TAB,Keys.ENTER);
		
		//click on settings icon
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//click on create type of work
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//pass the name value from the Excel
		//driver.findElement(By.xpath("//input[@id='name']")).sendKeys("shwetha nadagi");
		FileInputStream fis1 = new FileInputStream("./src/test/resources/TestData.xlsx");
	    Workbook book = WorkbookFactory.create(fis1);
	    Sheet sheet = book.getSheet("Sheet1");
	    Row row = sheet.getRow(0);
	    Cell cell = row.getCell(1);
	    String excelData1 = cell.getStringCellValue();
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(excelData1);
		
		//click on cancel button
		driver.findElement(By.xpath("//input[contains(@value,'Cancel')]")).click();
		Thread.sleep(1000);
		//handle the Alerts popup
		TargetLocator tarLocator = driver.switchTo();
		Alert alr = tarLocator.alert();
		
		
		//in single line
		//Alert alr = driver.switchTo().alert();
		
		
		//to click on ok: accept()
		alr.accept();
				
	 //to click on cancel: dismiss()
	 //alert.dismiss();
		
		//case2:
		//driver.switchTo().alert().accept();
		
   
		
		

	}

}
