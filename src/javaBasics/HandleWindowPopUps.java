package javaBasics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandleWindowPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Demo Website for Practice Automation")).click();
		
		
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		
		String ParentWindowId=it.next();
		System.out.println(ParentWindowId);
		
		String childWindowId=it.next();
		System.out.println(childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
