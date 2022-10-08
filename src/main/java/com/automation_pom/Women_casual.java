package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_casual {
	public WebDriver driver;
	public Women_casual(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//img[@title='Printed Dress']")
	private WebElement printed_dress;

	public WebElement getPrinted_dress() {
		return printed_dress;
	}
	
}
