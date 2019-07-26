package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1, groups="titlepage")
	public void googleTitleTest() {
		String ttl=driver.getTitle();
		System.out.println(ttl);
		Assert.assertEquals(ttl, "Google123", "Titles dont match");
	}
	
	@Test(priority=3, groups="logotest")
	public void googleLogoTest() {
		boolean logotest=driver.findElement(By.xpath("//*[@id=\"hplogo\"]/a/img")).isDisplayed();
		Assert.assertTrue(logotest);
		
		//Assert.assertEquals(logotest, true);
	}

	@Test(priority=2, groups="linktest")
	public void linktest() {
		boolean lnktxt=driver.findElement(By.linkText("Mail")).isDisplayed();
		Assert.assertTrue(lnktxt);
	}
	@Test(priority=4, groups="search page")
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(priority=5, groups="search page")
	public void test2() {
		System.out.println("test2");
	}
	
	@Test(priority=6, groups="search page")
	public void test3() {
		System.out.println("test3");
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
