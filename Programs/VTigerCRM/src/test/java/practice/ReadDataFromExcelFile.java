package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws IOException  {
		
		//Step1: Open the doc in java understandable language
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestDataAdvanced.xlsx");
		
		//step2: Create virtual workbook
	     Workbook wb = WorkbookFactory.create(fis);
		
		//Step3: Navigate to required sheet
		Sheet sh = wb.getSheet("Contacts");
		
		//step4: navigate to required row
		  Row rw = sh.getRow(20);
		
		//step5: navigate to required cell
		   Cell cl = rw.getCell(20);
		
		//step6: capture the value and print
		  String value = cl.getStringCellValue();
		  System.out.println(value);
		  
		//  

	}

}
