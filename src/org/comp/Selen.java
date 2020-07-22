package org.comp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adactin.com/HotelApp/");
        driver.manage().window().maximize();
        JavascriptExecutor jj = (JavascriptExecutor)driver;
        WebElement ll = driver.findElement(By.xpath("//*[@id=\'username\']"));
        WebElement kk = driver.findElement(By.xpath("//*[@id=\'password\']"));
        WebElement hh = driver.findElement(By.xpath("//*[@id=\'login\']"));
        jj.executeScript("arguments[0].setAttribute('value','pravinanand07')", ll);
        jj.executeScript("arguments[0].setAttribute('value','baipraveen07')", kk);
        Object text = jj.executeScript("return arguments[0].getAttribute('value')", ll);
        System.out.println(text);
        jj.executeScript("arguments[0].click()", hh);
	}

}
