package org.test1.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login1 {
@Test
public void l2() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");

}
}
