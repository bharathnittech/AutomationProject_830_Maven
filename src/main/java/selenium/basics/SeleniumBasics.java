package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {

	public static void main(String[] args) {
//	1. Launch the Browser (Chrome)
//		System.setProperty("", "");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver(); //from 4.6 v we can launch browser directly
		
//	2. Maximize the Browser Window
		driver.manage().window().maximize();
		
//	3. Launch the application
		driver.get("https://google.co.in/");
		
//	4. Close the Application
		driver.close();

	}

}
