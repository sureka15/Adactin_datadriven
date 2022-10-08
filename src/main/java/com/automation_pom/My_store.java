package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_store {
	public WebDriver driver;
	public My_store(WebDriver driver )
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[.='Women']")
	private WebElement women;
//	@FindBy(xpath = "(//a[.='Casual Dresses'])[1]")
//	private WebElement casual;
	@FindBy(xpath  = "//div[@class='header_user_info']//child::a")
	private WebElement sig_in;
	@FindBy(xpath = "//div[@id='contact-link']//child::a")
	private WebElement Contact_us;
	@FindBy(xpath = "//input[@name='search_query']")
	private WebElement search_box;
	@FindBy(xpath ="//input[@name='search_query']//following-sibling::button")
	private WebElement search_icon;
	@FindBy(xpath= "//div[@class='shopping_cart']//child::a")
	private WebElement cart;
	@FindBy(xpath = "(//a[.='Dresses'])[2]")
	private WebElement dresses; 
	@FindBy(xpath= "//a[.='Dresses']//following::a[.='T-shirts']")
	private WebElement tshirt;
	
	public WebElement getWomen() {
		return women;
	}
//	public WebElement getCasual() {
//		return casual;
//	}
//	
	public WebElement getSig_in() {
		return sig_in;
	}
	public WebElement getContact_us() {
		return Contact_us;
	}
	public WebElement getSearch_box() {
		return search_box;
	}
	public WebElement getSearch_icon() {
		return search_icon;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getTshirt() {
		return tshirt;
	}

}
