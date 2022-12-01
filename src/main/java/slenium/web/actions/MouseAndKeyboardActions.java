package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseAndKeyboardActions {
	
	//right click
	//double click
	//mouse hover
	//drag and drop
	//scroll
	

	public static void main(String[] args) throws InterruptedException {
	
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/buttons");
		
//		5. Collect the button elements
		WebElement dblButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rghtButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement clkButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions action= new Actions(driver);		
//		6. Perform double click on dblButton
		action.doubleClick(dblButton).perform();
		
//		7. Perform right click on rghtButton
		action.contextClick(rghtButton).perform();
		
//		8. Mouse hover on clkButton
		action.moveToElement(clkButton).perform();
		
//		9. Navigate to drag and drop page
		driver.navigate().to("https://demoqa.com/droppable");
		
//		10. Perform drag and drop action
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='draggable']/following-sibling::div[@id='droppable']"));
		action.dragAndDrop(source, target).perform();
		
//		11. Naviagate to google page
		driver.navigate().to("https://www.google.co.in/");
		
//		12. Search for Selenium and press Enter button
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		action.sendKeys("Selenium"+Keys.ENTER).perform();
		
//		13. Wait for 3 sec
		Thread.sleep(3000);
		
//		14. Select all the content by pressing keys Cntrl+a
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
//		15. Copy all the content by pressing keys Cntrl+c
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
//		16. Paste the content in search box by using Cntrl+v
		searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		searchbox.click();
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
//		17. close browser window
		driver.quit();
	}

}
