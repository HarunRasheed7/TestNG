package org.test1.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login2 {
@Test
public void l3() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");

}
}
