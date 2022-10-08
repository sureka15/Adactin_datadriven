package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	public WebDriver driver;
	@FindBy(xpath= "//a[@id='nav-link-accountList']")
	private WebElement login;
	public login_page(WebDriver driver) {
this.driver = driver;
PageFactory.initElements(driver, this);
	
	}
	public WebElement getLogin() {
		return login;
	}
	@FindBy(xpath = "//div[@id='nav-al-signin']//descendant::span")
	private WebElement sigin;
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	@FindBy(xpath = "//span[@aria-label='Go']//child::input")
	private WebElement searchbtn;
	@FindBy(xpath = "//a[.='Start here.']")
	private WebElement starthere;
	@FindBy(xpath = "//select[@aria-describedby='searchDropdownDescription']")
	private WebElement drop;

	public WebElement getDrop() {
		return drop;
	}
	public WebElement getStarthere() {
		return starthere;
	}
	
	public WebElement getSigin() {
		return sigin;
	}
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	


}
