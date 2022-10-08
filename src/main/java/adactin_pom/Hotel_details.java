package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_details {
	public WebDriver  driver;
	
	
	public Hotel_details(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody//descendant::input[@type='radio'] ")
	private WebElement Radio_btn;
	@FindBy(xpath = "//label[@id='radiobutton_span']//preceding-sibling::input[@type='submit']")
	private WebElement continue_btn;
	public WebElement getRadio_btn() {
		return Radio_btn;
	}
	public WebElement getContinue_btn() {
		return continue_btn;
	}
	
	

}
