package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frame_handle {
	public WebDriver driver;
	public frame_handle(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); 
		}

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	@FindBy(xpath = "//i[@class='icon-plus']/..")
	private WebElement plus_btn;
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement select_size;
	@FindBy(xpath = "//span[.='Add to cart']//parent::button")
	private WebElement addcard;

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getPlus_btn() {
		return plus_btn;
	}

	public WebElement getSelect_size() {
		return select_size;
	}

	public WebElement getAddcard() {
		return addcard;
	}
}
	
