package org.comp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(3000);									
		List<String> companyname_List = new ArrayList<String>();		
		List<WebElement> row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(row.size());
		for (int i = 1; i < row.size(); i++) {
			String row_xpath = "//table[@class='dataTable']/tbody/tr["+i+"]/td[1]";
			String companyname = driver.findElement(By.xpath(row_xpath)).getText();			
			companyname_List.add(companyname);
		}
		System.out.println(companyname_List.size());		
		System.out.println(companyname_List);
			
		List<String> previous_List = new ArrayList<>();								
		for (int j = 1; j < row.size(); j++) {
			String datas = "//table[@class='dataTable']/tbody/tr["+j+"]/td[3]";
			String previous = driver.findElement(By.xpath(datas)).getText();
			previous_List.add(previous);
		}
		System.out.println(previous_List.size());
		System.out.println(previous_List);

		List<String> currentprice_List = new ArrayList<>();
		for (int k = 1; k < row.size(); k++) {
			String current = "//table[@class='dataTable']/tbody/tr["+k+"]/td[4]";
			String currentprice = driver.findElement(By.xpath(current)).getText();
			currentprice_List.add(currentprice);
		}
		System.out.println(currentprice_List);
		List<String> currentpercent_List = new ArrayList<>();
		for (int l = 1; l < row.size(); l++) {
			String chenge = "//table[@class='dataTable']/tbody/tr["+l+"]/td[5]";
			String currendpercent = driver.findElement(By.xpath(chenge)).getText();
			currentpercent_List.add(currendpercent);
		}
		System.out.println(currentpercent_List);
	}

}

