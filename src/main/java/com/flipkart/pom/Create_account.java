package com.flipkart.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_account {
	public WebDriver driver;
	public Create_account(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath = "//a[starts-with(.,'New')] ")
private WebElement create_acnt;
@FindBy(xpath = "//input[@type='text' and @maxlength='10']")
private WebElement phonenum;
@FindBy(xpath = "//button[@type='submit']//descendant::span")
private WebElement continue_btn;
public WebElement getCreate_acnt() {
	return create_acnt;
}
public WebElement getPhonenum() {
	return phonenum;
}
public WebElement getContinue_btn() {
	return continue_btn;
}

}
