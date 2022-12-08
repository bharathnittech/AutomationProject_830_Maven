package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTestClass {

	@BeforeSuite(alwaysRun = true)
	public void startReporting() {
		System.out.println("Reporting Started..");
	}

	@AfterSuite(alwaysRun = true)
	public void stopReporting() {
		System.out.println("Reporting Stopped..");
	}

	public void launchBrowser(String browser) {
		System.out.println(browser + " Browser is launched..");
	}

	public void launchApplication(String url) {
		System.out.println("Application is launched with.." + url);
	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {
		System.out.println("Browser is closed..");
	}

	@Test(priority = 2, groups = { "sanity", "smoke" })
	public void testcase1() {
		System.out.println("Test Case 1 Executed...");
	}

	@Test(priority = 3, dependsOnMethods = { "testcase1" }, groups = { "sanity" })
	public void testcase2() {
		System.out.println("Test Case 2 Executed...");
	}

	@Test(dataProvider = "testcase3data", priority = 4, groups = { "regression" }, enabled = false)
	public void testcase3(String username, String password, String role) {
		System.out.println("Test Case 1 Executed with..." + username + " , " + password + " ," + role);
	}

	@Test(priority = 1, groups = { "sanity" }, enabled = true, retryAnalyzer = RetryTestCase.class)
	public void testcase4() throws Exception {
		throw new Exception("Failed");
//		System.out.println("Test Case 4 Executed...");
	}

	@BeforeMethod(alwaysRun = true)
	@Parameters({ "browser", "url" })
	public void launchBrowserAndApplication(String browser, String url) {
		launchBrowser(browser);
		launchApplication(url);
	}

	@DataProvider(name = "testcase3data")
	public String[][] testData() {
		String[][] data = { { "abc", "abc123", "QA" }, { "xyz", "xyz123", "DEV" }, { "cdf", "cdf123", "DEV" } };
		return data;
	}

}
