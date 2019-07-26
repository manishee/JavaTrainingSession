package com.test;

import org.testng.annotations.Test;

public class testNGFeatures {
	
	@Test
	public void loginTest() {
		
		System.out.println("login test");
		//int i=9/0;
	}
	@Test(dependsOnMethods="loginTest")
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
