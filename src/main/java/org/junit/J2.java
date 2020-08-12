package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J2 {
	static WebDriver driver;
@Test
	public void T5() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
	}
	@Test
	public void T6() {

		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	}
	@Test
	public void T7() {

		driver.findElement(By.name("q")).sendKeys("redmi mobiles");
	}
	@Test
	public void T8() {

		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();	


	}
	


}
