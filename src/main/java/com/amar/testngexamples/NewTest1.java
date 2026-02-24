package com.amar.testngexamples;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;


public class NewTest1
{
	 @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("--- Starting a test method session ---");
	    }

	    @Test
	    public void testMethodOne() {
	        System.out.println("Executing Test Method One");
	        // Example assertion
	        String expected = "TestNG";
	        String actual = "TestNG";
	        Assert.assertEquals(actual, expected, "Actual and Expected strings should match");
	    }
	    @Test
	    public void testMethodTwo() {
	        System.out.println("Executing Test Method Two");
	        int i = 10;
	        int j = 20;
	        Assert.assertTrue(i < j, "i should be less than j");
	    }
	   

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("--- Ending a test method session ---");
	    }

}









