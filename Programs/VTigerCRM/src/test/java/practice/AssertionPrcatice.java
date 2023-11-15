package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPrcatice {

	@Test
	public void practice()
	{
			
		System.out.println("step1");
		System.out.println("Step2");
	    Assert.assertEquals(0,1);
		System.out.println("step3");
		System.out.println("Step4");
		
	}
	
	@Test
	public void practice1()
	{
		System.out.println("step1");
		System.out.println("Step2");
		SoftAssert sa = new SoftAssert();
	    sa.assertEquals(0,1);
		System.out.println("step3");
		sa.assertTrue(true);
		System.out.println("Step4");
		sa.assertEquals("True","False");
		sa.assertAll();
		
	}
	
}


