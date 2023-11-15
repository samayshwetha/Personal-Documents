package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
	
	@Test(dataProvider = "getData")
	public void addProductTocart(String name, int price, int quantity, String model)
	{
		System.out.println("Name: "+name+" Price: "+price+" Quantity: "+quantity+" Model: "+model);
	}
	
	@DataProvider
	public Object[][] getData()
	{								//row column
		Object[][] data = new Object[2][4];  // 2 set of data with 4 information for each set
		
		data[0][0]="samsung";
		data[0][1]= 10000;
		data[0][2]= 3;
		data[0][3]="S310";
		
		data[1][0]="Nokia";
		data[1][1]= 2000;
		data[1][2]= 6;
		data[1][3]="N110";
		return data;
	}
	

}
