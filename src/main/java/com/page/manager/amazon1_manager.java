package com.page.manager;

import org.openqa.selenium.WebDriver;

import com.pom.amazon.Buy_now;
import com.pom.amazon.Homepage;
import com.pom.amazon.create_account;
import com.pom.amazon.lehanga;
import com.pom.amazon.login_page;
import com.pom.amazon.sign_in;


public class amazon1_manager {
	public WebDriver driver;
	private login_page login;
	private sign_in signin;
	private lehanga lehang;
	private Buy_now buy;
	private create_account account;
	private Homepage home;
	public amazon1_manager(WebDriver driver) {
      this.driver =driver; 
	}
	public login_page login()
	{
		if(login==null)
		{
			login = new login_page(driver);
		}
		return login;
	}

	public sign_in signin()
	{
		if(signin==null)
		{
			signin = new sign_in(driver);
		}
		
		return signin;
	}
	public lehanga lehang() {
		if(lehang==null)
		{
			lehang = new lehanga(driver);
		}
		return lehang;
		
	}
	public create_account account() {
	if(account == null)
	{
		account = new create_account(driver);
	}
		return account;
	}
	public Buy_now buy() {
		if(buy == null )
		{
			buy = new Buy_now(driver);
		}
		return buy;
	}
	public Homepage home() {
		if(home == null )
		{
			home = new Homepage(driver);
		}
		return home;
	}
}
