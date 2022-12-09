package framework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner extends ReportsClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		startReportingForTestCase(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.pass("Test Execution completed successfully for "+result.getMethod().getMethodName());
		stopReporting();
	}

	public void onTestFailure(ITestResult result) {
		logger.fail("Test Execution is Failed for "+result.getMethod().getMethodName());
		try {
			logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Window.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		stopReporting();
	}
	

	public void onTestSkipped(ITestResult result) {
		logger.fail("Test Execution is skipped  for "+result.getMethod().getMethodName());
		try {
			logger.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\Screenshots\\Window.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		stopReporting();	}
}
