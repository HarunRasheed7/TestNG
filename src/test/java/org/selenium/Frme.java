package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frme {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace-new\\\\TestNG\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		List<WebElement> iFramess = driver.findElements(By.tagName("iframe"));
		System.out.println(iFramess.size());
		WebElement frame = driver.findElement(By.id("a077aa5e"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		



}
}