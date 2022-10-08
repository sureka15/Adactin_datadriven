package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement sigin;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	@FindBy(xpath = "//span[@aria-label='Go']//child::input")
	private WebElement searchbtn;
	@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
	private WebElement drop;
	public WebElement getSigin() {
		return sigin;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getDrop() {
		return drop;
	}
}
