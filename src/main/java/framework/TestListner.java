package framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started for "+result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Execution completed successfully for "+result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Execution Failed for "+result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped for "+result.getMethod().getMethodName());
	}
}
