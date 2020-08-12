package org.test1.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void l1() {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com");

	}

}
