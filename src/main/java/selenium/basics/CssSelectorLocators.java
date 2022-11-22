package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocators {
	
	//CssSelector Locator
	
	//Syntax 1: tagName#id
	//Syntax 2: tagName.className
	//Syntax 3: tagName[attribute='attribute value']

	public static void main(String[] args) {
	
//		1. Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (ICICI Net Banking APP)
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
//		5. Locate 'UserId' element By using 'cssSelector' Locator
		WebElement userIdTextbox_syntax1= driver.findElement(By.cssSelector("input#DUMMY1"));
		
//		6. Locate 'UserId' element By using 'cssSelector' Locator
		WebElement userIdTextbox_syntax2= driver.findElement(By.cssSelector("input.login-input mode-select-userid"));

//		7. Locate 'UserId' element By using 'cssSelector' Locator
		WebElement userIdTextbox_syntax3= driver.findElement(By.cssSelector("input[title='Login using User ID and password']"));		
		
	}

}
