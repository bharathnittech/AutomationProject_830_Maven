package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgTestMethodsClass extends ReportsClass {

	@Test
	public void testCase1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logger.pass("Browser Launched Successfully");
		driver.manage().window().maximize();
		logger.warning("Browser is Maximized");
		driver.manage().deleteAllCookies();
		logger.info("Deleted all cookies");
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		logger.pass("Application Launched Successfully");

		WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
		if (logo.isDisplayed())
			logger.pass("Logo is Displayed");
		else
			logger.fail("Logo is not Displayed");
	}

	@Test
	public void testCase2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		logger.pass("Browser Launched Successfully");
		driver.manage().window().maximize();
		logger.warning("Browser is Maximized");
		driver.manage().deleteAllCookies();
		logger.info("Deleted all cookies");
		driver.get("https://google.com");
		logger.pass("Application Launched Successfully");
		WebElement logo = driver.findElement(By.xpath("//img[@title='ParaBank']"));
		if (logo.isDisplayed())
			logger.pass("Logo is Displayed");
		else
			logger.fail("Logo is not Displayed");
	}

}
