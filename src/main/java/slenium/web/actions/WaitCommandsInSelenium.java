package slenium.web.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitCommandsInSelenium {
	
	static WebDriver driver;
	
	//Selenium waits
	
//	1. Implicit Wait ==> maximum of specified time or proceed further if the element is available 
//	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//	2. Explicit Wait  ==> wait time along with condition ==> maximum of specified time or proceed further if condition matches
	
//	3. Fluent Wait

	public static void main(String[] args) throws InterruptedException {
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		
		
//		5. Click on Admin page menu
		WebElement adminPageMenu = driver.findElement(By.xpath("//a[text()='Admin Page']"));
		adminPageMenu.click();
		
		//Wait for 3 sec
//		Thread.sleep(30000);
		
		//Implicit wait (30 Sec)
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[text()='SWAGGER2']"), 0));
		
		//Fluent Wait
//		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5));
//		fluentwait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a[text()='SWAGGER']"), 0));
		
		
//		6. Select 'SOAP' option from radio buttons
		dataAccessMode("soap").click();
		
//		7. Verify the WSDL URL
		WebElement usdlLink = driver.findElement(By.xpath("//a[text()='WSDL']"));
		usdlLink.click();
		
		if(driver.getCurrentUrl().equals("https://parabank.parasoft.com/parabank/services/ParaBank?wsdl"))
			System.out.println("URL is matching");
		else 
			System.out.println("URL is not matching");
		
//		8. Go back to previous page
		driver.navigate().back();
		
//		9. Scroll till drop down element and Select "Web Service" from Loan Provider
		WebElement loanProviderDrp = driver.findElement(By.xpath("//select[@id='loanProvider']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",loanProviderDrp);
		
		Select s = new Select(loanProviderDrp);
		s.selectByVisibleText("Web Service");
		
//		10.Click on Submit button
		WebElement submitButton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitButton.click();
		
//		11.Close the Browser window
		driver.quit();
	}

	public static WebElement dataAccessMode(String option) {
		return driver.findElement(By.xpath("//input[@value='"+option+"']"));
	}

}
