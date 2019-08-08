package com.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGFeatures {
	
	// testng-failed.xml will run the failed test cases but if there is a dependency on other test case
	// it will re-run that test case also
	@Test(expectedExceptions=ArithmeticException.class)//expectedExecptions
	public void loginTest() {
		
		System.out.println("login test");
		int i=9/0;
	}
	@Test(dependsOnMethods="loginTest", enabled=false)// enable=false doesn't execute that test case
	public void homePageTest() {
		
		System.out.println("HomepageTest");
		
	}
	@Test(dependsOnMethods="loginTest")
	public void searchPageTest() {
	
	System.out.println("searchPageTest");
}
	@Test(dependsOnMethods="loginTest")
	public void regPageTest() {
	
	System.out.println("regPageTest");
}
}
