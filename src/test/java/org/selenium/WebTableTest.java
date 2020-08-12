package org.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace-new\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<String> companyname_list=new ArrayList<String>();
		List<String> companyname_list1=new ArrayList<String>();
		List<String> companyname_list2=new ArrayList<String>();
		List<String> companyname_list3=new ArrayList<String>();
		List<String> companyname_list4=new ArrayList<String>();
	    List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
	
	    for (int i = 1; i <=column.size(); i++) {
		String columnxpath="//table[@class='dataTable']/tbody/tr[1]/td["+i+"]";
		String columnxpath1="//table[@class='dataTable']/tbody/tr[2]/td["+i+"]";
		String columnxpath2="//table[@class='dataTable']/tbody/tr[3]/td["+i+"]";
		String columnxpath3="//table[@class='dataTable']/tbody/tr[4]/td["+i+"]";
		String columnxpath4="//table[@class='dataTable']/tbody/tr[5]/td["+i+"]";

		String companyname = driver.findElement(By.xpath(columnxpath)).getText();
		String companyname1 = driver.findElement(By.xpath(columnxpath1)).getText();
		String companyname2 = driver.findElement(By.xpath(columnxpath2)).getText();
		String companyname3 = driver.findElement(By.xpath(columnxpath3)).getText();
		String companyname4 = driver.findElement(By.xpath(columnxpath4)).getText();
		
		companyname_list.add(companyname);
		companyname_list1.add(companyname1);
		companyname_list2.add(companyname2);
		companyname_list3.add(companyname3);
		companyname_list4.add(companyname4);
		  }
	   
        System.out.println(companyname_list);
        System.out.println(companyname_list1);
        System.out.println(companyname_list2);
        System.out.println(companyname_list3);
        System.out.println(companyname_list4);
}
}


