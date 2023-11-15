package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class consists of generic methods to read data from Excel file
 * @author Snadagi
 *
 */

public class ExcelFileUtility {
	
	/**
	 * 
	 * @param sheetname
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws Exception
	 * @throws IOException
	 */
	
	public String readDataFromExcelFile(String sheetname, int rownum, int cellnum) throws Exception, IOException
	{
		 FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestDataAdvanced.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		 return value;
	}

	
	public Object[][] ReadMultipleData(String sheetName ) throws EncryptedDocumentException, IOException
	{
		  FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestDataAdvanced.xlsx");
		  Workbook wb = WorkbookFactory.create(fis);
		  Sheet sh = wb.getSheet(sheetName);
		  int lastRow = sh.getLastRowNum();
		  int lastCell = sh.getRow(0).getLastCellNum();
		  
		  Object[][] data = new Object[lastRow][lastCell];
		  
		  for(int i=0;i<lastRow;i++)
		  {
			  for(int j=0;j<lastCell;j++)
			  {
				   data[i][j]  = sh.getRow(i+1).getCell(j).getStringCellValue();
			  }
		  }
		  return data;
	}

}
