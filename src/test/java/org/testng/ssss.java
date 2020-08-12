package org.testng;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ssss {
 static WebDriver driver;
 
 @org.testng.annotations.BeforeClass
 public static void launch() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("https://facebook.com");
	 driver.manage().window().maximize();
	 }
 @BeforeMethod
 public void Start() {
	 Date d=new Date();
	 System.out.println(d);
 }
 
 @Test
 public void t1() {
	 driver.findElement(By.id("email")).sendKeys("harun");
 }
 @Test
 public void t2() {
	 driver.findElement(By.id("pass")).sendKeys("123456");
 }
 @Test
 public void t3() {
	 driver.findElement(By.id("u_0_b")).click();
 }
 @AfterMethod
 public void end() {
	 Date d=new Date();
	 System.out.println(d);
 }
 @org.testng.annotations.AfterClass
 public void quit() {
	 driver.quit();
 }
 
 	
}

