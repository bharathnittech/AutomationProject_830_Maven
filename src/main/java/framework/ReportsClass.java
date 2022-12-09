package framework;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ReportsClass {

	public static ExtentReports extent = null; // class to create new blank html report
	public static ExtentTest logger = null; // class to print messages
	
	@BeforeSuite
	public static void setupReport() {
		ExtentHtmlReporter html = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\AutomationReport.html");
		extent = new ExtentReports();
		extent.attachReporter(html);
		extent.setSystemInfo("Project Name", "Parabank");
	}
	
	public static void startReportingForTestCase(String testname) {
		logger = extent.createTest(testname);
	}
	
	public static void stopReporting() {
		extent.flush();
	}

}
