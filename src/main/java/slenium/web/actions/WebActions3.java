package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebActions3 {
	
	//Checkbox
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/automation-practice-form");
		
//		5. Select the hobbie checkbox
		if(!hobbie("Reading").isSelected())
			hobbie("Reading").click();
		
//		6. wait for 3 sec
		Thread.sleep(3000);
		
//		7. close the browser
		driver.quit();
		
		

	}
	
	public static WebElement hobbie(String option) {
		return driver.findElement(By.xpath("//label[text()='"+option+"']"));
	}

}
