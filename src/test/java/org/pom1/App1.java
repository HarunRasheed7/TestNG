package org.pom1;

public class App1 extends Baseclass1 {
	public static void main(String[] args) throws Throwable {
		launch();
		url("http://flipkart.com");
		
		POM1 p=new POM1();
		clickk(p.getClose());
		fill(p.getSearch(),"Redmi mobiles");
		clickk(p.getEnter());
		Thread.sleep(2000);
		clickk(p.getPhone());
		windowHandle(p.getCart());
		
		clickk(p.getCart());
		
	}
	

}
