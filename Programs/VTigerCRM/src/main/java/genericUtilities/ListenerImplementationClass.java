package genericUtilities;

import java.io.IOException;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * This class is used to add all the listers
 * @author Snadagi
 *
 */
public class ListenerImplementationClass implements ITestListener{

	public void onTestStart(ITestResult result) {
    String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "=======Test script Execution is started========");
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "=======Test Execution is passed========");
		
	}

	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "=======Test Execution is Failed========");
		
		//exception for failure
		System.out.println(result.getThrowable());
		
		//screenshots
		String screenshotname=methodName+new JavaFileUtility().getSystemDate();
		 WebDriverUtility w = new WebDriverUtility();
		 try {
			w.captureScreenShot(BaseClass.sdriver, screenshotname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName + "=======Test Execution is Skipped========");
		System.out.println(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		System.out.println("==========Suite Execution started=============");
	}

	public void onFinish(ITestContext context) {
		
		System.out.println("==========Suite Execution Finished=============");
		
	}

	
	
	}


