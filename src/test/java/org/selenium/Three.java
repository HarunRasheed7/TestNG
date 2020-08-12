package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Three {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement sel = driver.findElement(By.xpath("(//select)[1]"));
		Select s=new Select(sel);
		s.selectByIndex(3);
		s.selectByValue("Friday");
		s.selectByVisibleText("Monday");
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
			
		}
		WebElement sel1= driver.findElement(By.xpath("(//select)[2]"));
		Select s1=new Select(sel1);
		boolean m = s1.isMultiple();

		System.out.println(m);
	s1.selectByValue("Ohio");
	s1.selectByVisibleText("Texas");
		s1.selectByIndex(0);
		List<WebElement> options2 = s1.getOptions();
		for (WebElement x1 : options2) {
			String text = x1.getText();
			System.out.println(text);
			
		}
		
		
	}

}
