package org.comp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class POM {

			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				PageFactory.initElements(driver, POM1.class);
				
				POM1.loginname.sendKeys("pravinanand07");
				POM1.loginpassword.sendKeys("123456543");
				POM1.loginlogin.click();
	}

}
