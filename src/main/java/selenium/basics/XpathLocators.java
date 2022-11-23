package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//xpath ==> XML Path
	//Absolute Xpath ==> it will start with '/' ==> we should write complete path of element from the beginning of the page

	//Relative Xpath ==> it will starts with '//' ==> we will write the relative path of target element only
	
	/************LEVEL 1 - BASIC ***************/
	
	//Syntax 1 : //tagName[@Attribute='Attribute Value']
	//Syntax 2 : //tagName[text()='Text Value']
	
	
	/************LEVEL 2 - contains,starts-with ***************/
	
	//Syntax 3 : //tagName[contains(@Attribute,'Partial Attribute Value')]
	//Syntax 4 : //tagName[contains(text(),'Partial Text Value')]
	
	//Syntax 5 : //tagName[starts-with(@Attribute,'Partial Attribute Value')]
	//Syntax 6 : //tagName[starts-with(text(),'Partial Text Value')]
	
	/************LEVEL 3 - joining multiple attribute values and text values using 'and' ***************/
	
	//Syntax 7 : //tagName[@Attribute1='Attribute Value' and @Attribute2='Attribute Value' and text()='Text Value']
	
	/************LEVEL 4 - Advanced Xpath using relationships ***************/	
	//Syntax 8: ReferenceElementXpath/relationship::targetElementXpath(without //)
	
	//Child
	//parent
	//ancestor
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	// ==> with in the family
	
	/*
	
		Target Element Xpath :  //a[text()='Services']    (Duplicate)

		Unique Reference Element Xpath : //ul[@class='leftmenu']


		ReferenceElementXpath/relationship::targetElementXpath



		//ul[@class='leftmenu']//a[text()='Services']  ==> With in the family

		//ul[@class='leftmenu']/child::li/child::a[text()='Services']  ==>Child's Child

		//li[text()='Solutions']/following-sibling::li/child::a[text()='Services']  ==> Following Siblings Child
*/
	public static void main(String[] args) {
		
//		1. Launch the browser (Chrome)
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().maximize();
		
//		3. Delete all cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		5. Locate Logo element using 'Absolute Xpath' Locator
		WebElement logo_absXpath = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]/img"));
		
//		6. Locate Logo element using 'Relative Xpath' Locator - Syntax 1
		WebElement logo_syntax1 = driver.findElement(By.xpath("//img[@title='ParaBank']"));		
		
//		7. Locate caption element using 'Relative Xpath' Locator - Syntax 2
		WebElement caption_syntax2 = driver.findElement(By.xpath("//p[text()='Experience the difference']"));	
		
//		8. Locate Logo element using 'Relative Xpath' Locator - Syntax 3 (Contains)
		WebElement logo_syntax3 = driver.findElement(By.xpath("//img[contains(@title,'Bank')]"));		
		
//		9. Locate caption element using 'Relative Xpath' Locator - Syntax 4(Contains)
		WebElement caption_syntax4 = driver.findElement(By.xpath("//p[contains(text(),'difference')]"));
		
//		10. Locate Logo element using 'Relative Xpath' Locator - Syntax 5 (starts-with)
		WebElement logo_syntax5 = driver.findElement(By.xpath("//img[starts-with(@title,'Para')]"));		
		
//		11. Locate caption element using 'Relative Xpath' Locator - Syntax 6(starts-with)
		WebElement caption_syntax6 = driver.findElement(By.xpath("//p[starts-with(text(),'Experience')]"));
		
//		12. Locate username element using 'Relative Xpath' Locator - Syntax 7(and)
		WebElement username_syntax7 = driver.findElement(By.xpath("//input[@class='input' and @name='username']"));
		
//		13. Locate Services element using 'Relative Xpath' Locator - Syntax 8
		WebElement services_syntax8_1 = driver.findElement(By.xpath("//ul[@class='leftmenu']//a[text()='Services']"));

		WebElement services_syntax8_2 = driver.findElement(By.xpath("//ul[@class='leftmenu']/child::li/child::a[text()='Services']"));

		WebElement services_syntax8_3 = driver.findElement(By.xpath("//li[text()='Solutions']/following-sibling::li/child::a[text()='Services']"));

	}

}
