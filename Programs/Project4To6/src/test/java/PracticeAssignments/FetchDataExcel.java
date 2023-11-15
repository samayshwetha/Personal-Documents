package PracticeAssignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcel {

	public static void main(String[] args) throws Throwable, IOException {
		     
		
		
       FileInputStream fis = new FileInputStream("./src/excel/page.xlxs");
       Workbook book = WorkbookFactory.create(fis);
       Sheet sheet = book.createSheet("sheet1");
       Row row = sheet.getRow(0);
       Cell cell = row.getCell(0);
        String value = cell.getStringCellValue();
	}

}
