package com.pom.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lehanga {
	public WebDriver driver;
	@FindBy(xpath = "//div[@id='search']/div/div/div/span[3]/div[2]/div[9]/div/div/div/div/div/div/span/a/div/img")
	private WebElement nenafashion;

	public WebElement getNenafashion() {
		return nenafashion;
	}
	public lehanga(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

}
