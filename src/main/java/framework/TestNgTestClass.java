package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgTestClass {

	@BeforeSuite
	public void startReporting() {
		System.out.println("Reporting Started..");
	}
	
	@AfterSuite
	public void stopReporting() {
		System.out.println("Reporting Stopped..");
	}

	public void launchBrowser(String browser) {
		System.out.println(browser+" Browser is launched..");
	}
	
	public void launchApplication(String url) {
		System.out.println("Application is launched with.."+url);		
	}
	
	@AfterMethod
	public void closeBrowser() {
		System.out.println("Browser is closed..");
	}
	
	@Test
	public void testcase1() {
		System.out.println("Test Case 1 Executed...");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Test Case 2 Executed...");
	}
	
	@Test(dataProvider="testcase3data")
	public void testcase3(String username, String password, String role) {
		System.out.println("Test Case 1 Executed with..."+username+" , "+password+" ,"+role);
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})
	public void launchBrowserAndApplication(String browser, String url) {
		launchBrowser(browser);
		launchApplication(url);
	}
	
	@DataProvider(name="testcase3data")
	public String [][] testData(){
		String [][] data = {{"abc","abc123","QA"},{"xyz","xyz123","DEV"},{"cdf","cdf123","DEV"}};
		return data;
	}

}
