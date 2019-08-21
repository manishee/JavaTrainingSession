package javaBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		Thread.sleep(5000);
		System.out.println(title);
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText()); // get the text of the alert
		alert.accept(); // accept the alert
		//alert.dismiss(); // dismiss the alert
		
		
	}

}
