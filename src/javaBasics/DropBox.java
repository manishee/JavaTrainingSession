package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mchugh\\Desktop\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			String title=driver.getTitle();
			Thread.sleep(5000);
			System.out.println(title);
			Select selectMonth=new Select(driver.findElement(By.name("birthday_month")));
			selectMonth.selectByVisibleText("May");
			Select selectDay=new Select(driver.findElement(By.id("day")));
			selectDay.selectByVisibleText("12");
			Select selectYear=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
			selectYear.selectByVisibleText("1981");
			
	}
		
}
