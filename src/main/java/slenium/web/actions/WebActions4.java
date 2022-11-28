package slenium.web.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebActions4 {
	
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
		Thread.sleep(3000);
		
//		5. Select all the hobbie checkboxes
		List<WebElement> hobbies =driver.findElements(By.xpath("//label[contains(@for,'checkbox')]"));
		for (int i=0; i<hobbies.size() ;i++) {
			if(!hobbies.get(i).isSelected())
				hobbies.get(i).click();
		}
		
//		6. wait for 3 sec
		Thread.sleep(3000);
		
//		7. close the browser
		driver.quit();
		
		

	}

}
