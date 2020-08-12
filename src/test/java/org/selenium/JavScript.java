package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavScript {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement login = driver.findElement(By.id("u_0_b"));
	JavascriptExecutor jk=(JavascriptExecutor)driver;
	jk.executeScript("arguments[0].setAttribute('value','Harun')",user);
	jk.executeScript("arguments[0].setAttribute('value','123456')", pass);
	jk.executeScript("arguments[0].click()", login);
	
	
	
		

		
		
	}

}
