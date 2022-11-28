package slenium.web.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebActions5 {
	
	//Web Tables
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
		driver.get("https://demoqa.com/webtables");
		
//		Wait for 3 sec
		Thread.sleep(3000);
		
//		4. Get total rows available 
		List<WebElement> rows = driver.findElements(By.xpath("//div[@role='rowgroup']"));
		int totalrows = rows.size();
		System.out.println("Total Rows :"+totalrows);
		
//		5. Get total columns available
		List<WebElement> columns = driver.findElements(By.xpath("//div[@role='columnheader']"));
		int totalcolumns = columns.size();
		System.out.println("Total Columns :"+totalcolumns);
		
//		6. Print all column headers
		for (int i=0; i<totalcolumns;i++)
			System.out.println(columns.get(i).getText());
		
//		7. Print specific data (row 2 col 4)
		System.out.println(getCell(2,4).getText());
		
//		8. Print all the data from table
		for (int r =1; r<=totalrows;r++) {
			for (int c=1; c<=totalcolumns ;c++) {
				System.out.print(getCell(r,c).getText()+" ");
			}
			System.out.println();
		}
		
//		9. Close the browser window
		driver.quit();

	}
	
	public static WebElement getCell(int row , int col) {
		return driver.findElement(By.xpath("//div[@class='rt-tbody']//div[@role='rowgroup']["+row+"]//div[@role='gridcell']["+col+"]"));
	}

}
