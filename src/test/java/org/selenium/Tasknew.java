package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;

public class Tasknew extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
    launch();
	url("http://flipkart.com");
	WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	WebElement searchbar = driver.findElement(By.name("q"));
	WebElement search = driver.findElement(By.xpath("//button[@class='vh79eN']"));
	WebElement one = driver.findElement(By.xpath("(//div[@class='_3wU53n'])[2]"));
	Thread.sleep(3000);
	clickk(close);
	fill(searchbar, "redmi mobiles");
	clickk(search);
	Thread.sleep(3000);
	clickk(one);
	
}
}