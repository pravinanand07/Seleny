package org.comp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");  
		List<WebElement> table = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(table.size());
		for (int i = 1; i <=5; i++) {
			WebElement first = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]"));
			String text = first.getText();
			System.out.println(text);
		}
		WebElement yesb = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'YES Bank')]/../../td[5]"));
		String text1 = yesb.getText();
		System.out.println(text1);
	}

}

