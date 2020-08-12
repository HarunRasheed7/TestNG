package org.test;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestNG extends DataDriven{
@Test(dataProvider="Smoke")
public void Test1(String s1,String s2) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys(s1);
	driver.findElement(By.id("pass")).sendKeys(s2);
	}
@DataProvider(name="Smoke",parallel=true)
public static Object[][]data() throws Throwable{
 return getData();
}
}