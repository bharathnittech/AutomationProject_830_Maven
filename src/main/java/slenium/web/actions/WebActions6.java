package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebActions6 {
	
	//Calendar
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://demoqa.com/automation-practice-form");
		
//		5. Click on DOB
		WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob.click();
		
//		wait till calendar displays
		Thread.sleep(3000);
		
//		6. Select the DOB as (Jan 1st 2020)
		selectDateOfBirth("January", "2020", "1");
		
//		7. Close Browser window
		driver.close();

	}
	
	public static void selectDateOfBirth(String Month, String Year, String Date) {
		WebElement month = driver.findElement(By.xpath("//select[contains(@class,'month')]"));
		WebElement year = driver.findElement(By.xpath("//select[contains(@class,'year')]"));
		Select s = new Select(month);
		s.selectByVisibleText(Month);		
		s=  new Select(year);
		s.selectByVisibleText(Year);
		WebElement date = driver.findElement(By.xpath("//div[text()='"+Date+"'  and contains (@aria-label,'"+Month+"')]"));	
		date.click();
	}
	
	

}
