package framework;

public class TestClass {

	public static void main(String[] args) {
		
		Commons obj = new Commons();
		
		obj.startReporting();
		
		obj.launchBrowser("Chrome");
		obj.launchApplication("www.test.com");
		obj.testcase1();
		obj.closeBrowser();
		
		obj.launchBrowser("Chrome");
		obj.launchApplication("www.test.com");
		obj.testcase2();
		obj.closeBrowser();
		
		obj.launchBrowser("Chrome");
		obj.launchApplication("www.test.com");
		obj.testcase3("abc","abc123");
		obj.closeBrowser();
		
		obj.launchBrowser("Chrome");
		obj.launchApplication("www.test.com");
		obj.testcase3("abc","abc123");
		obj.closeBrowser();
		
		obj.stopReporting();
		
	}

}
