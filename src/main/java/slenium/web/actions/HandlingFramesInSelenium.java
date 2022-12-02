package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFramesInSelenium {

	public static void main(String[] args) {
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/frames");
		
//		5. Locate main window element
		WebElement mainwindowElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		
//		Switch to Frame from the main window
		driver.switchTo().frame("frame1");
		
//		6.Locate frame element
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
//		7.Print text value of frame element
		System.out.println(frameElement.getText());
		
//		Switch back to main window
		driver.switchTo().defaultContent();
		
//		8.Print text value of main window element
		System.out.println(mainwindowElement.getText());
		
//		9.Close browser window
		driver.quit();

	}

}
