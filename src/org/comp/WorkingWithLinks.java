package org.comp;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		int count = 0;
		List<WebElement> fEles = driver.findElements(By.tagName("a"));
		for (WebElement y : fEles) {
			String link = y.getAttribute("href");

			try {

				URL u = new URL(link);
				URLConnection opc = u.openConnection();
				HttpURLConnection http = (HttpURLConnection) opc;
				int rcode = http.getResponseCode();
				System.out.println(rcode);
				if (rcode >= 400) {
					count++;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		System.out.println(count);
	}

}
