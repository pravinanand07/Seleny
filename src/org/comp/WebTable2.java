package org.comp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.switchTo().frame("flow_close_btn_iframe");
		Thread.sleep(5000);
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(ele.size());
		/*for (int i = 1; i <= ele.size(); i++) {
			WebElement get = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[1]"));
			String text = get.getText();
			System.out.println(text);
		}*/
		WebElement find = driver.findElement(
				By.xpath("//table[@class='dataTable']/tbody/tr/td/a[contains(text(),'Central Bank')]/../../td[3]"));
		String text1 = find.getText();
		System.out.println(text1);
	}

}
