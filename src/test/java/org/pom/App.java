package org.pom;

import org.openqa.selenium.support.ui.Select;

public class App extends Baseclass {
	public static void main(String[] args) {
		launch();
		url("http://facebook.com");
		POM p=new POM();
		fill(p.getUser(),"Harun");
		fill(p.getPass(), "123456");
		fill(p.getFirst(), "Harun");
		fill(p.getLast(), "Rasheed");
		fill(p.getPhno(), "99998989889");
		fill(p.getNewpass(), "123323");
		dropDown(p.getDay(), "12");
		dropDown(p.getMonth(), "3");
		dropDown(p.getYear(), "1996");
		clickk(p.getGender());
		clickk(p.getSignup());
		
		
		
	}
	
	
		
}
