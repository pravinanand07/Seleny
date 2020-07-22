package org.comp;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnSt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.4");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File tk = ts.getScreenshotAs(OutputType.FILE);
        File ss = new File("C:\\Users\\Praveen\\eclipse-workspace\\SRYA\\Seleny\\Img\\srn.png");
        FileUtils.copyFile(tk, ss);
        driver.quit();
	}

}
