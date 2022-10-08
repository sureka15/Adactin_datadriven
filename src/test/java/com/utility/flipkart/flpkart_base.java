package com.utility.flipkart;

import org.openqa.selenium.WebDriver;

import com.demo_adactin.utility_automation;
import com.flipkart.pom.Create_account;

public class flpkart_base extends utility_automation{
	public static WebDriver driver = utility_automation.get_browser();
	public static Create_account account = new Create_account(driver);

	public static void main(String[] args) {
		get_url("https://www.flipkart.com/");
		
		
		
	}

	

}
