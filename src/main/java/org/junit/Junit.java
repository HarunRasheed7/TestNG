package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {
static WebDriver driver;
@BeforeClass
public static void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://facebook.com");
}
@Test
public void Test1() {
	Assert.assertTrue(driver.getCurrentUrl().contains("http"));
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("Harun");
	
}
@Test
public void Test2() {
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("123456");
	Assert.assertEquals("123456",pass.getAttribute("value"));
}
@Test
public void Test3() {
	WebElement login = driver.findElement(By.id("u_0_b"));
	login.click();
}
@Before
public void Start() {
	Date d=new Date();
		System.out.println(d);
	}
@After
public void End() {
	Date d=new Date();
	System.out.println(d);
}
@AfterClass
public static void quit() {
	driver.quit();
	
}
	
	


}
	

