package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends Baseclass{
	public POM() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getSignup() {
		return signup;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirst() {
		return first;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getPhno() {
		return phno;
	}
	public WebElement getNewpass() {
		return newpass;
	}
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	 
	@FindBy(id="u_0_b")
	private WebElement login;

	@FindBy(id="u_0_m")
	private WebElement first;
	
	@FindBy(id="u_0_o")
	private WebElement last;

	@FindBy(id="u_0_r")
	private WebElement phno;

	@FindBy(id="password_step_input")
	private WebElement newpass;
	
	@FindBy(id="u_0_7")
	private WebElement gender;
	
	@FindBy(id="day")
	private WebElement day;
	
	@FindBy(id="month")
	private WebElement month;

	@FindBy(id="year")
	private WebElement year;
@FindBy(id="u_0_12")
private WebElement signup;

	
	

}
