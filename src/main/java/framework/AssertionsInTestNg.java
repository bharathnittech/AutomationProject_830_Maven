package framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsInTestNg {
	
@Test(enabled=false)
public void hardAssertions() {
	String actual = "Test";
	String expected = "Test";
	String expected1 = "Test1";
	boolean value1=true;
	boolean value2=false;
	String num1=null;
	String num2="Test";
	
	Assert.assertEquals(actual, expected);	
	Assert.assertTrue(value1);
	Assert.assertFalse(value2);
	Assert.assertNull(num1);
	Assert.assertNotNull(num2);
//	Assert.fail("I WANT TO FAIL");
}

@Test
public void softAssertions() {
	String actual = "Test";
	String expected = "Test2";
	String expected1 = "Test1";
	boolean value1=true;
	boolean value2=false;
	String num1=null;
	String num2="Test";
	
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(actual, expected);	
	softAssert.assertTrue(value2);
	softAssert.assertFalse(value1);
	softAssert.assertNull(num2);
	softAssert.assertNotNull(num1);
	softAssert.fail("I WANT TO FAIL");
	softAssert.assertAll();
}

}
