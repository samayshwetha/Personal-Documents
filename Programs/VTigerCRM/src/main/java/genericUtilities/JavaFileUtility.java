package genericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class consists of generic methods related to java
 * @author Snadagi
 */


public class JavaFileUtility {
	
		/**
		 * This method will generate a random number for every run and return it to caller
		 * @return
		 */
	
	      public int getRandomNumber()
	      {
	    	    Random ran = new Random();
	    	    int r =  ran.nextInt(100);
	    	    return r;
	    	   
	      }
	               
	      
	      /**
	       * This method will generate the current system date and return it to caller
	       * @return
	       */
	      	      
	      public String getSystemDate()
	      {
	    	   Date d = new Date();
	    	   SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
	    	    String date = formatter.format(d);
	    	    return date;
	    	    
	    	    
	    	
	      }

}
