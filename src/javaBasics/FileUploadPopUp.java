package javaBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mchugh\\Desktop\\Manish\\JavaTraining\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		String title = driver.getTitle();
		Thread.sleep(5000);
		System.out.println(title);
		driver.findElement(By.id("uploadfile_0"))
				.sendKeys("C:\\Users\\mchugh\\Desktop\\JavaTraining\\JavaTrainingSession\\Git.pptx");
	}

}
