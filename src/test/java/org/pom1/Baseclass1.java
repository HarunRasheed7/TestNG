package org.pom1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass1 {
	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	public static void url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void clickk(WebElement e) {
		e.click();
	}
	public static void windowHandle(WebElement e) {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x: child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(x);
				
			}
			
		}
				
				}
			}
	


