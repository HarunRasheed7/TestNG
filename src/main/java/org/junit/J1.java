package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J1 {
	static WebDriver driver;
@Test
public void T1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
@Test
      public void T2() {
		driver.findElement(By.id("email")).sendKeys("Harun");
	}
@Test
public void T3() {
		driver.findElement(By.id("pass")).sendKeys("123456");

	}
@Test
public void T4() {
	driver.findElement(By.id("u_0_b")).click();
		
	}
	

}
