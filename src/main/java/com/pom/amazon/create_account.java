package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_account {
	public WebDriver driver;
	public create_account(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	private WebElement yourname;
	@FindBy(xpath = "//input[@id='ap_phone_number']")
	private WebElement phone;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement pass;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn; 
	public WebElement getContinue_btn() {
		return continue_btn;
	}
	public WebElement getYourname() {
		return yourname;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getPass() {
		return pass;
	}
	
	
	
	

}
