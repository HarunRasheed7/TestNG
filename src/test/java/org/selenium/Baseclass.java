package org.selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace-new\\\\TestNG\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void clickk(WebElement e) {
	e.click();
	}
	public static void dropDown(WebElement e,String value) {
		Select sel=new Select(e);
		sel.selectByValue(value);
		
		
	}
	public static void windowsHandling(WebElement e) {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(x);
				
			}
			
		}
		
		}
	}


