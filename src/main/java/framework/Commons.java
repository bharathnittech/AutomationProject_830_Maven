package framework;

public class Commons {
	
	public void startReporting() {
		System.out.println("Reporting Started..");
	}
	
	public void stopReporting() {
		System.out.println("Reporting Stopped..");
	}

	public void launchBrowser(String browser) {
		System.out.println(browser+" Browser is launched..");
	}
	
	public void launchApplication(String url) {
		System.out.println("Application is launched with.."+url);		
	}
	
	public void closeBrowser() {
		System.out.println("Browser is closed..");
	}
	
	public void testcase1() {
		System.out.println("Test Case 1 Executed...");
	}
	
	public void testcase2() {
		System.out.println("Test Case 2 Executed...");
	}
	
	public void testcase3(String username, String password) {
		System.out.println("Test Case 1 Executed with..."+username+" , "+password);
	}

}
