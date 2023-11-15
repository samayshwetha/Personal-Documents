package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//step1: create object of properties for util.java package
		 Properties pr = new Properties();
					
		//step5: write the keys and values into the property file
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\StoreDataIntoFile.properties");
		pr.setProperty("LastName", "Cont1");
		pr.setProperty("Organizationname", "Org1");
		pr.setProperty("Type", "Energy");
		pr.setProperty("Industry", "chemicals");
		pr.store(fos, "TestData");
				

	}

}
