package org.selenium;

import java.io.File;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class One {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptops");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_3wU53n'])[1]")).click();
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!parent.equals(child)) {
				driver.switchTo().window(x);
				
			}
			
		}
			WebElement ss = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
			ss.click();
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File desc=new File("C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\target\\fk.png");
			FileUtils.copyFile(src, desc);
			driver.quit();
		}

}
