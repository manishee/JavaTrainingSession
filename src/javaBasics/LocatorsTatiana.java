package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsTatiana {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tbogatch\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
				
		driver.findElement(By.name("firstname")).sendKeys("Tatiana");
		driver.findElement(By.name("lastname")).sendKeys("Bog");
		driver.findElement(By.name("reg_email__")).sendKeys("tbogatch@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tbogatch@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("password1!");
		
		Select drpMonth = new Select(driver.findElement(By.name("birthday_month")));
		drpMonth.selectByVisibleText("June");
		Select drpDay = new Select(driver.findElement(By.name("birthday_day")));
		drpDay.selectByVisibleText("22");
		Select drpYear = new Select(driver.findElement(By.name("birthday_year")));
		drpYear.selectByVisibleText("1980");
					
		driver.findElement(By.name("sex")).click(); // Female
		
		driver.findElement(By.name("websubmit")).click(); 
		System.out.println("... going to the next page");
	
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 Thread.sleep(5000);
		 					 
		 System.out.println("Waited for some time and ready to print the link text");
		 
		//WebElement linkHref = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a")));
		String linkText = driver.findElement(By.tagName("a")).getText();
	    System.out.println(linkText);
	    
		/* 
		WebElement linkname = driver.findElement(By.linkText("Didn't get a code?"));
		if (linkname.isDisplayed())
		{
	    System.out.println("Link Didn't get a code? is displayed");
		}
		else
	    System.out.println("Link Didn't get a code? is NOT displayed");
			    WebElement linkHref = driver.findElement(By.tagName("a"));
	      	        	    .getAttribute(href);
	    */
	    
		//  javascript alert ???
		// Alert alert = driver.switchTo().alert();
		// System.out.println(driver.switchTo().alert().getText());
		
		// driver.quit();
	}

}
