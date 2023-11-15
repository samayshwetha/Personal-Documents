package practice;

import genericUtilities.ExcelFileUtility;
import genericUtilities.JavaFileUtility;
import genericUtilities.PropertyFileUtility;

public class GenericUtilityPractice {

	public static void main(String[] args) throws Exception {
		
		
		//call the method readDataFromPropertyFile
		PropertyFileUtility pUtil = new PropertyFileUtility();
		String URL = pUtil.readDataFromPropertyFile("url");
		System.out.println(URL);
		
		
		//call the method readDataFromExcelFile
		ExcelFileUtility eUtil = new ExcelFileUtility();
		String LASTNAME = eUtil.readDataFromExcelFile("Contacts",1, 2);
		System.out.println(LASTNAME);
		
		
		//call the random number generating method
		 JavaFileUtility jUtil = new JavaFileUtility();
		 int r = jUtil.getRandomNumber();
		 System.out.println(r);
		 
		 
		//call the System Date generate method
		 String date = jUtil.getSystemDate();
		 System.out.println(date);
		  

	}

}
