package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Dell\\\\eclipse-workspace-new\\\\TestNG\\\\driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(""
				+ "");
		driver.manage().window().maximize();
		List<WebElement> iTable = driver.findElements(By.tagName("Table"));
		for (int i = 0; i <iTable.size(); i++) {
			WebElement Table = iTable.get(i);
			List<WebElement> iRow= driver.findElements(By.tagName("tr"));
			for (int j = 0; j < iRow.size(); j++) {
				WebElement Row = iRow.get(j);
				List<WebElement> iData = driver.findElements(By.tagName("td"));
				for (int k = 0; k < iData.size(); k++) {
					String text = iData.get(k).getText();
					System.out.println(text);
						
						
					}
							
						}									
							}			
				}
			}
			
	


