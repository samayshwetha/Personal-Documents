package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//comment

/**
 * this class consists of generic methods to read data from property file
 * @author Snadagi
 *
 */

public class PropertyFileUtility {
	
	/**
	 * This method will read data from the property file and return the value
	 * to the caller
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	public String readDataFromPropertyFile(String key) throws IOException
	{
       FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");  
       Properties pr = new Properties();
       pr.load(fis);
       String value  = pr.getProperty(key);
       return value;
       
	}

	}


