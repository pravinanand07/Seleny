package org.comp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php"); 
		List<WebElement> value1 = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(value1.size());
		Thread.sleep(3000);
		for (int i = 1; i <value1.size() ; i++) {
			WebElement value2 = driver.findElement(By.xpath("//table/tbody/tr["+i+"]"));
			String text = value2.getText();
			System.out.println(text);
		}
		WebElement value3 = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'Asian Paints')]/../../td[4]"));
		String text1 = value3.getText();
		System.out.println(text1);
	}

}
