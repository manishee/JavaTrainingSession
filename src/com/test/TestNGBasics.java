package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	
//	@BeforeSuite -set up properties for Chrome
//	@BeforeTest --launching browser
//	@BeforeClass - entering the URL
//	@BeforeMethod --login to the application
//	@Test --- google logo test
//	@AfterMethod -- logout
//	@BeforeMethod --login to the application
//	@Test --- search test
//	@AfterMethod -- logout
//	@BeforeMethod --login to the application
//	@Test --- google title test
//	@AfterMethod -- logout
//	@AfterClass -- closing browser
//	@AfterTest ---deleteAllCookies

	
	//@BeforeMethod + @Test + @AfterMethod - is a pair
	//Annotation which are commonly used-
	//@BeforeClass
	//@BeforeMethod
	//@Test
	//@AfterMethod
	//@AfterClass
	
	// pre conditions or annotations
	@BeforeSuite //1
	// annotations starts with @. Each and every annotation is associated with one method 
	public void setUp() {
		System.out.println("@BeforeSuite -set up properties for chrome");
		
	}
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("@BeforeTest --launching browser");
	}
	@BeforeClass//3
	public void enterURL() {
		System.out.println("@BeforeClass - entering the URL");
	}
	
	@BeforeMethod//4
	public void login() {
		System.out.println("@BeforeMethod --login to the application");
	}
	
	@Test(priority=3) // test //5
	public void googleTitleTest() {
		System.out.println("@Test --- google title test");
	}
	
	@Test(priority=2)
	public void searchTest() {
		System.out.println("@Test --- search test");
	}
	
	@Test(priority=1)
	public void googleLogoTest() {
		System.out.println("@Test --- google logo test");
	}
	// post conditions or annotations
	@AfterMethod //6
	public void logout() {
		System.out.println("@AfterMethod -- logout");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass -- closing browser");
	}
	
	@AfterTest //8 
	public void deleteAllCookies() {
		System.out.println("@AfterTest ---deleteAllCookies");
	}
	
	/*@AfterSuite
	public void generateReports() {
		System.out.println("generateReports");
	}*/
	
	
	
	
	
	
}
