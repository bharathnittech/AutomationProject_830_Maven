package slenium.web.actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlertsInSelenium {

	public static void main(String[] args) {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/alerts");
		
//		5. Locate alert buttons
		WebElement infoAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		WebElement confirmationAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		WebElement proptAlert = driver.findElement(By.xpath("//button[@id='promtButton']"));
		
//		6. Get Information Alert
		infoAlert.click();
		
//		Switch to Alert from the main window
		Alert alert =driver.switchTo().alert();
		
//		7. Print Alert message
		System.out.println(alert.getText());
		
//		8. Click on the OK button
		alert.accept();
		
//		9. Get Confirmation Alert
		confirmationAlert.click();
		
//		10. Print Alert message
		System.out.println(alert.getText());
		
//		11. Click on the Cancel button
		alert.dismiss();
		
//		12. Get Prompt Alert
		proptAlert.click();
		
//		13. Print Alert message
		System.out.println(alert.getText());
		
//		14. Entre the Text
		alert.sendKeys("Dhruv");
		
//		15. Click on OK button
		alert.accept();
		
//		16. Close the browser window
		driver.quit();
		

	}

}
