package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			Thread.sleep(3000);
			//use Actions class to mouse over
			Actions action=new Actions(driver);
			action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();
			Thread.sleep(3000);// pause the execution for 3 seconds
			driver.findElement(By.linkText("Visa Services")).click();
	}

}
