package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_page {
	public WebDriver driver;

	public Confirm_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;
	@FindBy(xpath = "//table[@class='login']//descendant::input[@name='search_hotel']")
	private WebElement search;
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement ltinenary;

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLtinenary() {
		return ltinenary;
	}

	public WebElement getSearch() {
		return search;
	}

	

}
