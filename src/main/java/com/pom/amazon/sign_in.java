package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign_in {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement siginin;
	@FindBy(xpath = "//a[.='Start here.']")
	private WebElement starthere;
	@FindBy(xpath = "//input[@id='ap_email']" )
	private WebElement email;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_btn;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement pass;
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getSiginin() {
		return siginin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContinue_btn() {
		return continue_btn;
	}
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getStarthere() {
		return starthere;
	}
	public sign_in(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
