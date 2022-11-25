package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebActions1 {
	
	//Image
	//Button
	//Textbox
	//Text Elements Like Title, Button Label, Header etc..

	public static void main(String[] args) {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Verify the Application Title (Expected Title= "ParaBank | Welcome | Online Banking")
			if(driver.getTitle().equals("ParaBank | Welcome | Online Banking")) {	
				System.out.println("Title is matching");
			}else {
				System.out.println("Title is not matching");
			}
		
//		6. Verify Application Logo Displayed in the page
			WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
			if(logo.isDisplayed()) 
				System.out.println("Logo is Displayed");
			else
				System.out.println("Logo is not Displayed");
			
//		7. Verify Application caption Displayed in the page (ExpectedCaption="Experience the difference")
			WebElement caption = driver.findElement(By.xpath("//p[@class='caption']"));
			if(caption.getText().equals("Experience the difference"))
				System.out.println("Caption is as Expected");
			else
				System.out.println("Caption is Wrong");

//		8. Verify Login Section header (Expected Header = "Customer Login");
			WebElement header = driver.findElement(By.xpath("//h2"));
			if(header.getText().equals("Customer Login"))
				System.out.println("Header is matching");
			else
				System.out.println("Header is not matching");
			
//		9. Veriy Username Textbox 
			WebElement usernameTextbox = driver.findElement(By.xpath("//input[@name='username']"));
			if(usernameTextbox.isDisplayed() && usernameTextbox.isEnabled())
				System.out.println("Username Textbox is Ready");
			else
				System.out.println("Username Textbox is not Ready");
			
//		10.Clear Username Textbox
			usernameTextbox.clear();
			
//		11.Enter username in the Username Textbox (Username: Admin)
			usernameTextbox.sendKeys("Admin");
			
//		12. Veriy Password Textbox 
			WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='password']"));
			if(passwordTextbox.isDisplayed() && passwordTextbox.isEnabled())
				System.out.println("Password Textbox is Ready");
			else
				System.out.println("Password Textbox is not Ready");
			
//		13.Clear Password Textbox
			passwordTextbox.clear();
			
//		14.Enter Password in the Username Textbox (Password: demo)
			passwordTextbox.sendKeys("demo");
			
//		15.Verify Login Button
			WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
			if(loginButton.isDisplayed() && loginButton.isEnabled())
				System.out.println("Login Button is Ready");
			else
				System.out.println("Login Button is Not Ready");
			
//		16.Verify Button Label (Expected Label : Log In)
			if(loginButton.getAttribute("value").equals("Log In"))
				System.out.println("Button Label is as Expected");
			else
				System.out.println("Button Label is Wrong");
			
//		17.Click on Login Button
			loginButton.click();
			
//		18.Close the Browser
			driver.close();
		

	}

}
