package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step1: open the document in java readable format
		//. means current project
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		
		//step2: create object of properties for util.java package
		 Properties pr = new Properties();
		
		//step3:load the file  input stream into properties
		 pr.load(fis);
		 
		 //step 4: provide the key and read the value
		String value = pr.getProperty("browser");
		System.out.println(value);
		String value1 = pr.getProperty("url");
		System.out.println(value1);
		String value2 = pr.getProperty("username");
		System.out.println(value2);
		String value3 = pr.getProperty("password");
		System.out.println(value3);
		
	    
		
		
		
				 
	}

}
