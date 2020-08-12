package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class J3 {
	static WebDriver driver;
	@BeforeClass
	public static void launch() {
		System.setProperty("webdriver.chrome.driver",".//driver//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
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
	@Before
	public void start() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void end() {
		Date d=new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void quit() {
		driver.quit();
	}
	
	

}
