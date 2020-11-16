package org.temp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		List<String> li = new ArrayList<>();
		List<WebElement> fl = driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(fl.size());
		Thread.sleep(3000);
		for (int i = 1; i < fl.size(); i++) {
			WebElement fn = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]"));
			String text = fn.getText();
			li.add(text);
			System.out.println(li);
		}
		Thread.sleep(3000);
		WebElement fle = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'NCC')]/../../td[3]"));
		String text1 = fle.getText();
		System.out.println(text1);
	}

}
