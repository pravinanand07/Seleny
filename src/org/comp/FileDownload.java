package org.comp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/mozilla/geckodriver/releases");
		driver.findElement(By.linkText("0.27.0")).click();
		driver.findElement(By.partialLinkText("win64.zip")).click();
		
		Thread.sleep(10000);
		
		File file = new File("Downloads");
		
		File[] list = file.listFiles();
		for (File file2 : list) {
			
			if (file2.getName().equals("geckodriver-v0.27.0-win64")) {
				System.out.println("File is Downloaded");
				break;
			}
		}

	}

}
