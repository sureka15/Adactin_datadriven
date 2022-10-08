package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingproceed {
	public WebDriver driver;
@FindBy(xpath = "//input[@type='checkbox']")
private WebElement checkbox;
@FindBy 
(xpath ="//span[normalize-space(.='Proceed to checkout')]//ancestor::button[@type='submit' and @name='processCarrier']")
private WebElement proceed;
public Shippingproceed(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public WebElement getCheckbox() {
	return checkbox;
}
public WebElement getProceed() {
	return proceed;
}
}
