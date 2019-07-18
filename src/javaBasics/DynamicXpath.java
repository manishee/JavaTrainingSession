package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com");
			//how to create your own xpath
			
			//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Java");
			//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
			driver.findElement(By.xpath("//input[contains(@id, 'gh-')]")).sendKeys("Java");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(), 'My eBay')]")).click();
	}

}
