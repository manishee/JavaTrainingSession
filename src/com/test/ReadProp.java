package com.test;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProp {
	 
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=null;
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\mchugh\\Desktop\\JavaTraining\\JavaTrainingSession"
				+ "\\src\\com\\test\\config.properties");
		prop.load(ip);
		
		System.out.println(prop.getProperty("browser"));
		String browser_name=prop.getProperty("browser");
		
		if(browser_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();
		}
		
		else if(browser_name.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\MicrosoftWebDriver.exe");
			
			driver = new EdgeDriver();
		}
		
		else if(browser_name.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\geckoDriver.exe");
			
			driver = new FirefoxDriver();
		}
			Thread.sleep(2000);
			driver.get(prop.getProperty("url"));
			Thread.sleep(2000);
			driver.findElement(By.name(prop.getProperty("username_name"))).sendKeys(prop.getProperty("username"));
			driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
			driver.findElement(By.xpath(prop.getProperty("login_btn_xpath"))).click();
			
			driver.quit();
			
		}
		
		
		
	}


