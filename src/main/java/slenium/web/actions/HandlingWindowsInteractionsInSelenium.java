package slenium.web.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindowsInteractionsInSelenium {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/upload-download");
		
//		5. Click on upload file button
		WebElement uploadButton = driver.findElement(By.xpath("//label[@for='uploadFile']"));
		uploadButton.click();
		
//		6.Wait until upload pop-up will open
		Thread.sleep(5000);
		
//		7. Upload the file
		Robot robo = new Robot();
		String filePath = "C:\\test.txt";
		StringSelection str= new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
//		8. Wait until file will upload
		Thread.sleep(5000);
		
//		9.Close browser window
		driver.quit();
		
		
		
		
		

	}

}
