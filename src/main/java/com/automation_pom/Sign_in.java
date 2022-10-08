package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in {
	public WebDriver driver;
	public Sign_in(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath ="//input[@type='password']")
	private WebElement pass;
	@FindBy(xpath = "//i[normalize-space(.='Sign in')]//ancestor::button[@id='SubmitLogin']")
	private WebElement login;
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
	

}
