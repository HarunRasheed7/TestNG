package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Four {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("u_0_m")).sendKeys("Harun");
	driver.findElement(By.id("u_0_o")).sendKeys("Rasheed");
	driver.findElement(By.id("u_0_r")).sendKeys("34545545455");
	driver.findElement(By.id("password_step_input")).sendKeys("123456");
	WebElement sel = driver.findElement(By.id("day"));
	Select s=new Select(sel);
	s.selectByValue("12");
	
	WebElement sel1 = driver.findElement(By.id("month"));
	Select s1=new Select(sel1);
	s1.selectByValue("3");

	WebElement sel2 = driver.findElement(By.id("year"));
	Select s2=new Select(sel2);
	s2.selectByValue("1996");
	
	
	driver.findElement(By.id("u_0_7")).click();
	
	


	
	
}
}
