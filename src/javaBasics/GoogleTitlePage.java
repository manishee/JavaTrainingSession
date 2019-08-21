package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitlePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com"); // get-> to go to a web page
		String title=driver.getTitle();
		Thread.sleep(5000);
		System.out.println(title);
		if(driver.getTitle().equals("facebook")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect");
		}
			
			
		driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
		driver.quit();
	}

}
