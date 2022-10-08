package com.automation_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
public WebDriver driver;
public Women(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(this.driver, this);
}
@FindBy(xpath="//a[.='Women']")
private WebElement women;
@FindBy(xpath = "//a[.='Tops']")
private WebElement tops;
@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/ul/li[2]/a[.='Dresses']")
private WebElement dresses;
public WebElement getWomen() {
	return women;
}
public WebElement getTops() {
	return tops;
}
public WebElement getDresses() {
	return dresses;
}
@FindBy(xpath="//div[@id='block_top_menu']/ul/li/ul/li/ul/li/a[.='T-shirts']")
private WebElement tshirt;
@FindBy(xpath = "//a[.='Blouses']")
private WebElement blouses;
@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/ul/li[2]/ul/li/a[.='Casual Dresses']")
private WebElement women_causal;
@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/ul/li[2]/ul/li/a[.='Evening Dresses']")
private WebElement Women_evening;
@FindBy(xpath = "//div[@id='block_top_menu']/ul/li/ul/li[2]/ul/li/a[.='Summer Dresses']")
private WebElement women_summer;
public WebElement getTshirt() {
	return tshirt;
}
public WebElement getBlouses() {
	return blouses;
}
public WebElement getWomen_causal() {
	return women_causal;
}
public WebElement getWomen_evening() {
	return Women_evening;
}
public WebElement getWomen_summer() {
	return women_summer;
}





}
