package org.comp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differ {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.adactin.com/HotelApp/");
	        driver.manage().window().maximize();
	}

}
