package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buy_now {
	public WebDriver driver;
	public Buy_now(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[@class='a-button-inner']//child::input[@id='buy-now-button']")
	private WebElement lehanga;

	public WebElement getLehanga() {
		return lehanga;
	}
	

}
