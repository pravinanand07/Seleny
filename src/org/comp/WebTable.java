package org.comp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	static WebDriver driver;
	
	public static void handleframe() {
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(5000);
		//handleframe();
		List<String> all = new ArrayList<>();
		List<WebElement> path = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(path.size());
		for (int i = 1; i <path.size(); i++) {
			String text = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td")).getText();
			all.add(text);
			}
		
		System.out.println(all);
		WebElement ypath = driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'Apollo')]/../../td[3]"));
		String text1 = ypath.getText();
		System.out.println(text1);
	}

}
