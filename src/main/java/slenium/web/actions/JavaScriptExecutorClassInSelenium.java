package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorClassInSelenium {

	public static void main(String[] args) {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/elements");
		
		
		
//		5. Click on the Interactions menu
		WebElement interactionsMenu = driver.findElement(By.xpath("//div[text()='Interactions']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",interactionsMenu);
		
//		Scroll till element and click
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",interactionsMenu);		
//		interactionsMenu.click();
		
//		6.Close the browser window
		driver.close();	

	}

}
