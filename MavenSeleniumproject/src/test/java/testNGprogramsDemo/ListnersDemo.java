package testNGprogramsDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersDemo implements ITestListener {

	public void onTestStart(ITestResult result) {
	    System.out.println("Test case started and test case name is:"+result.getName() );
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and test case name is:"+result.getName() );
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failure and test case name is:"+result.getName() );
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and test case name is:"+result.getName() );
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case success percentage and test case name is:"+result.getName() );
		
	}	

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test case time out and test case name is:"+result.getName() );
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test case on start and test case name is:"+context.getName() );
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test case on finish and test case name is:"+context.getName() );
		
	}

}
