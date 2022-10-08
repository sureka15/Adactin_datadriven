package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkout_proceed {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement proceed;
	@FindBy(xpath = "//span[.='Proceed to checkout']")
	private WebElement add_proceed;
	@FindBy(xpath="(//a[@title='Add'])[2]")
	private WebElement new_address;

	public WebElement getNew_address() {
		return new_address;
	}
	public WebElement getAdd_proceed() {
		return add_proceed;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public checkout_proceed(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
