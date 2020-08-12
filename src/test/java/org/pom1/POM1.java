package org.pom1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 extends Baseclass1{
	public POM1() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getSearch() {
		return search;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getCart() {
		return cart;
	}
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	private WebElement close;
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	private WebElement enter;
	
	@FindBy(xpath="(//div[@class='_3wU53n'])[1]")
	private WebElement phone;
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement cart;
	

	
	
	

}
