package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {

	//lesser to higher priority and lower to higher ASCII
	//if both invocation count and priority are given. preference is given to priority first
	//TestNg flags/options : invocationCount=0 and enabled=false means it disable the method(not skipped)
	//
	
	@Test(priority=3, invocationCount=3)
	public void createCustomer() {
		
		//Assert.fail();
		System.out.println("create");

	}
	
	@Test(dependsOnMethods = "createCustomer")
    public void modifyCustomer() {
		
		System.out.println("modify");

	}

	@Test(priority=2)
    public void deleteCustomer() {
		
		System.out.println("delete");

	}
}
