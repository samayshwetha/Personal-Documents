package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataIntoExcelSheet {

	public static void main(String[] args) throws Throwable {
		
	   FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
	   Workbook book = WorkbookFactory.create(fis); 
	   Sheet sheet = book.getSheet("Sheet2");
	   
	   //insert first data
	   Row row = sheet.createRow(1);
	   Cell cell = row.createCell(0);
	   cell.setCellValue("Amazon");
	   	   
	   //insert second data
	    Row row1 = sheet.createRow(2);
	    Cell cell1 = row1.createCell(0);
	    cell1.setCellValue("Flipkart");
	   
	   FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData.xlsx");
	   book.write(fos);
	   book.close();

	}
}
