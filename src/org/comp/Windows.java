package org.comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.name("q")).sendKeys("redmi mobiles" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[4]")).click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String X : child) {
			if (!parent.equals(X)) {
				List<String> li = new ArrayList<>();
				li.addAll(child);
				String getwin = li.get(2);
				driver.switchTo().window(getwin);
			}
		}
	}
}
