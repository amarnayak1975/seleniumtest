package com.amar.testngexamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest
{
	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser()
	{
		driver.get("file:///E:/notes/selenium/test.html");
		System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
		System.out.println("Page Title" +driver.getTitle());
	}

	@Test(description="This method validates the sign up functionality")
	public void signUp()
	{
		String testTitle = "My Title";
	    String originalTitle = driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("submit")).click();
		
	    Assert.assertEquals(originalTitle, testTitle);

	}

	@AfterMethod
	public void postSignUp()
	{
		System.out.println(driver.getCurrentUrl());
	}

	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
}
