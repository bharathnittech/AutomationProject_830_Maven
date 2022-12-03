package slenium.web.actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingScreenshotsInSelenium {

	static WebDriver driver;
	static String path = System.getProperty("user.dir")+"\\Screenshots\\";

	public static void main(String[] args) throws IOException {
		
//		1. Launch the Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Take Screenshot of Logo of the page
		WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
		takeElementScreenshot(logo,"Logo");
		
//		6. Take Screenshot of complete browser window
		takeWindowScreenshot("Window");
		
//		7.Close browser window
		driver.quit();
	}

	public static void takeWindowScreenshot(String name) throws IOException {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path+name+uniqueId()+".png"));
	}

	public static void takeElementScreenshot(WebElement element, String name) throws IOException {
		File file = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path+name+uniqueId()+".png"));
	}
	
	public static String uniqueId() {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String uniqueId= sdf.format(Calendar.getInstance().getTime());
		return uniqueId;
	}

}
