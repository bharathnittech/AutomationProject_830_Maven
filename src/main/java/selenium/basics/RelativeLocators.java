package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	
	//Syntax : RelativeLocator.with(targetElementLocator).direction(referenceElementLocator);
	
	//above
	//below
	//near
	//toLeftOf
	//toRightOf

	public static void main(String[] args) {
		
//		1. Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5.Locate Services Element using relative locators
		WebElement services = driver.findElement(RelativeLocator.with(By.xpath("//a[text()='Services']")).above(By.xpath("//a[text()='Admin Page']")));

	}

}
