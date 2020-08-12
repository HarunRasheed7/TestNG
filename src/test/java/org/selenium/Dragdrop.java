package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace-new\\\\TestNG\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions acc=new Actions(driver);
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Thread.sleep(2000);
		acc.clickAndHold(drag).moveToElement(drop).release(drop).perform();
		


}
}