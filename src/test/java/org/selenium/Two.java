package org.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Two {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='cont_btn_bottom loginDisplay']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
        Alert a = driver.switchTo().alert();	
        a.accept();
        WebElement l = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        l.sendKeys("Harun");
        
        Actions acc=new Actions(driver);
        acc.doubleClick(l).perform();
       
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_X);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_X);
        
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        


		
	}

}