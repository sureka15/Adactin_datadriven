package com.page.manager;


import org.openqa.selenium.WebDriver;

import com.automation_pom.My_store;
import com.automation_pom.Shippingproceed;
import com.automation_pom.Sign_in;
import com.automation_pom.Women;
import com.automation_pom.Women_casual;
import com.automation_pom.checkout_proceed;
import com.automation_pom.confirm_order;
import com.automation_pom.frame_handle;

public class Autoamation_manager {
	
	public WebDriver driver;
	private Women women;
	private My_store store;
	private Women_casual casual;
	private frame_handle frame;
	private checkout_proceed proceed;
	private Sign_in signin;
	private Shippingproceed shipping;
	private confirm_order order;
	public Autoamation_manager(WebDriver driver) {
		this.driver=driver;
	}
	public Women getWomen() {
		if(women ==null)
		{
			women = new Women(driver);
		}
		return women;
	}
	public My_store getStore() {
		if(store == null) {
			store = new My_store(driver);
		}
		return store;
	}
	public Women_casual getCasual() {
		if(casual == null)
		{
			casual = new Women_casual(driver);
		}
		return casual;
	}
	public frame_handle getFrame() {
		{
			frame= new frame_handle(driver);
		}
		return frame;
	}
	public checkout_proceed getProceed() {
		{
			if(proceed == null)
			{
				proceed = new checkout_proceed(driver);
			}
		}
		return proceed;
	}
	public Sign_in getSignin() {
		if(signin == null)
		{
			signin = new Sign_in(driver);
		}
		return signin;
	}
	public Shippingproceed getShipping() {
		if(shipping== null)
		{
			shipping= new Shippingproceed(driver);
		}
		return shipping;
	}
	public confirm_order getOrder() {
		if(order == null)
		{
			order = new confirm_order(driver); 
		}
		return order;
	}
	
	
	

}
