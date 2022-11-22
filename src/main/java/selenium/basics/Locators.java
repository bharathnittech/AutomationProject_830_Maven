package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	
// 	1. id => id 
// 	2. name
// 	3. className
//	4. tagName
	
//	5. linkText ==> text value of Hyperlink element
//	6. partialLinkText ==> partial text value of Hyperlink element
	
//	7. cssSelector
//	8. xpath
//	9. relativeLocator

	public static void main(String[] args) {
//		1. Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (ICICI Net Banking APP)
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
//		5. Locate 'UserId' element By using 'id' Locator
		WebElement userIdTextbox_id= driver.findElement(By.id("DUMMY1"));
		
//		6. Locate 'UserId' element By using 'name' Locator
		WebElement userIdTextbox_name= driver.findElement(By.name("DUMMY1"));
		
//		7. Locate 'UserId' element By using 'className' Locator
		WebElement userIdTextbox_class= driver.findElement(By.className("login-input mode-select-userid"));
		
//		8. Locate 'UserId' element By using 'tagName' Locator
		WebElement userIdTextbox_tag= driver.findElement(By.tagName("input"));
		
//		9. Locate 'Login With Mobile Number' Link element By using 'linkText' Locator
		WebElement loginWithMobile_link = driver.findElement(By.linkText("Login with Mobile Number"));
		
//		10. Locate 'Login With Mobile Number' Link element By using 'partialLinkText' Locator
		WebElement loginWithMobile_partialLink = driver.findElement(By.partialLinkText("Login with Mobile"));

	}

}
