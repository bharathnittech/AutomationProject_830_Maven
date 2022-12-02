package slenium.web.actions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleWindowsInSelenium {

	public static void main(String[] args) {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/browser-windows");
		
//		get new window
		WebElement newWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		newWindow.click();
		
//		5. Locate main window element
		WebElement mainwindowElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		
//		Get main window id (unique window handle id)
		String mainWindowId = driver.getWindowHandle();
		
//		Get all the window id's launched currently
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println("Total Windows :"+windows.size());
		
//		eliminate main window id		
		windows.remove(mainWindowId);
		
		for (int i=0;i<windows.size();i++) {
//		Switch to new window
		driver.switchTo().window(windows.get(i));
	
//		6.Locate new window element
		WebElement newwindowElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		
//		7.Print text value of frame element
		System.out.println(newwindowElement.getText());
		
		//Close new window
		driver.close();
		
		}
		
//		Switch back to main window
		driver.switchTo().window(mainWindowId);
		
//		8.Print text value of main window element
		System.out.println(mainwindowElement.getText());
		
//		9.Close browser window
		driver.quit();

	}

}
