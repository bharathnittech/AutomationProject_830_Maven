package slenium.web.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementActions {

	public static void main(String[] args) {
		
//		1. Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		WebElement element= driver.findElement(By.xpath(""));
		
/******************WEB ELEMENT ACTIONS************/		
		
//		Whether Element is displayed? ==> isDisplayed() ==> boolean
		element.isDisplayed();
		
//		Whether Element is Enabled ? ==> isEnabled() ==>boolean
		element.isEnabled(); 
		
/******Button********/
		
//		==> Click on the button? ==> click() 
		element.click();
		
//		==> Label of the Button? ==>getAttribute("value") ==> String
		element.getAttribute("value");
		
/******TextBox********/
//		==>Clear the textbox ==> clear() 
		element.clear();
		
//		==>Enter the text in textbox  ==> sendKeys("value")
		element.sendKeys("Text to Type");
		
//		==>Verify the Text Entered in the text box  ==> getAttribute("value") ==> String
		element.getAttribute("value");
		
/******DropDown********/
//		==>Select one Option from list of options
		Select s = new Select(element);
		s.selectByIndex(0);
		s.selectByValue("value attribute");
		s.selectByVisibleText("TextValue");
		
//		==>Check all the options available in the dropdown  ==> getOptions() ==> List of WebElements
		s.getOptions();
		
//		==>Check the selected option
		s.getFirstSelectedOption();
		
		
/******Multi-Select DropDown********/
//		==>Whether multiple selections are allowed ==> isMultiple() ==> boolean
		s.isMultiple();
		
//		==>Select multiple Options from list of options
		s.selectByIndex(0);
		s.selectByValue("value attribute");
		s.selectByVisibleText("TextValue");
		
//		==>De-Select multiple Options from list of options
		s.deselectByIndex(0);
		s.deselectByValue("value attribute");
		s.deselectByVisibleText("TextValue");
		
		s.deselectAll();
		
//		==>Check all the options available in the dropdown
		s.getOptions();
		
//		==>Check the selected options
		s.getAllSelectedOptions();
		
/*******checkbox********/
//		==>Whether check box is already selected? isSelected() ==> boolean
//		==>Click on the checkbox
		if(!element.isSelected())
			element.click();
		
/*****Radio button******/
//		==>Click on Radio button
		element.click();
		
/*******Images********/
//		==>Whether image is displayed ?
		element.isDisplayed();
		
/*******Text*********/		
//		==> Verify element Text values  ==> getText() ==>String
		element.getText();
		
//		==> Verify Title
		driver.getTitle();
		
//		==> Verify button labels
		element.getAttribute("value");
		
/******HyperLinks****/
//		==>Click and Verify the Hyperlink
		
		//Method 1 ==> Get href attribute value
		element.getAttribute("href");
		
		//Method 2 ==> Click on the element and verify the new page title or URL
		element.click();
		driver.getTitle();
		
		element.click();
		driver.getCurrentUrl();
		
/******ScrollBar******/
//		==>Scroll till target element
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",element);
		
/******WebTables******/
//		==>Column Headers
//		==>Total Rows
//		==>Total Columns
//		==>Data added in the table
		
/******Calendar*******/
//		==>Select the required date

	}

}
