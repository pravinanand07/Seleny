package org.comp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flights {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
		WebElement dep = driver.findElement(By.tagName("(//select)[1]"));
		Select s = new Select(dep);
		s.selectByValue("KQH");

	}

}
