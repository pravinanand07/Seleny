package org.comp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM1 {

	@FindBy(id="email")
	public static WebElement loginname;
	@FindBy(id="pass")
	public static WebElement loginpassword;
	@FindBy(xpath="//*[@id=\'u_0_b\']")
	public static WebElement loginlogin;
}
