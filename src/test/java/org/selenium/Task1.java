package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("gosuggest_inputSrc"));
		from.sendKeys("Chennai");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement to = driver.findElement(By.id("gosuggest_inputDest"));
		to.sendKeys("Mumbai"); 
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		WebElement dcal = driver.findElement(By.id("departureCalendar")); 
		dcal.click();
		driver.findElement(By.id("fare_20200723")).click();
		
		WebElement rcal = driver.findElement(By.id("returnCalendar")); 
		rcal.click();
		driver.findElement(By.id("fare_20200727")).click();
		
		driver.findElement(By.id("gi_search_btn")).click();


		
		}
}