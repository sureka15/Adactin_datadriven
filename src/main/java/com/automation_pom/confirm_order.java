package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class confirm_order {
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement paybank;
	@FindBy(xpath = "//span[.='I confirm my order']")
	private WebElement confirmorder;
	@FindBy(xpath = "//a[.='Back to orders']")
	private WebElement backorder;
	@FindBy(xpath = "(//i[@class='icon-chevron-left'])[2]")
	private WebElement backtohome;

	public WebElement getBacktohome() {
		return backtohome;
	}

	public WebElement getPaybank() {
		return paybank;
	}

	public WebElement getConfirmorder() {
		return confirmorder;
	}

	public WebElement getBackorder() {
		return backorder;
	}
	

	public confirm_order(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
