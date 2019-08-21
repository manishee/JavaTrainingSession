package javaBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com");
			List <WebElement> lnklist=driver.findElements(By.tagName("a"));
			System.out.println(lnklist.size());
			
			for(int i=0;i<lnklist.size(); i++) {
				String lnktext=lnklist.get(i).getText();
				System.out.println(lnktext);
			}
	}

}
