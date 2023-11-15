package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import genericUtilities.RetryAnalyserImplementation;

public class RetryAnalyserPractice extends RetryAnalyserImplementation{

	@Test(retryAnalyzer=genericUtilities.RetryAnalyserImplementation.class)
	
	public void analyser()
	{
		Assert.fail();
		System.out.println("Hi");
	}
}
