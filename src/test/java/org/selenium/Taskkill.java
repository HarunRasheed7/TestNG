package org.selenium;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskkill {
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
		System.out.println("done");
		
		
		
		
			
			
			
		}
	
	
		
	}


