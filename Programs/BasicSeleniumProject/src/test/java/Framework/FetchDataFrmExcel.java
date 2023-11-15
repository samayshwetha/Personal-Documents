package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class FetchDataFrmExcel {

	public  void FetchDataFrmExcel() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	    FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
	     Workbook book = WorkbookFactory.create(fis);
	     
	     //give the sheet name as argument in the getsheet method
	    Sheet sheet = book.getSheet("Sheet1");
	    
	    //pass the row and column value
	    Row row = sheet.getRow(0);
	    
	    Cell cell = row.getCell(0);
	    
	    //read the data from the cell
	     String excelData = cell.getStringCellValue();
	     
	     driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(excelData,Keys.ENTER);
	    
	     Thread.sleep(1000);
	     String actData = driver.findElement(By.cssSelector("#twotabsearchtextbox")).getAttribute("value");
	     System.out.println(actData);
	     ///hard assert
	     Assert.assertEquals(actData, excelData, "Assertion failed");
	     System.out.println("Assertion is successfull");
	     
	     /*if(excelData.equalsIgnoreCase(actData))
	     {
	    	 System.out.println("Validation is successfull");
	     }
	     else {
	    	 System.out.println("Validation is not successfull");
	     }*/
	    
	}

}
