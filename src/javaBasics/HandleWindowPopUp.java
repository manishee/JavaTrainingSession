package javaBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Demo Website for Practice Automation")).click();
	
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String parentWindowId= it.next();
		System.out.println(parentWindowId);
		
		String childWindowId= it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
