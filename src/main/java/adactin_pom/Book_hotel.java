package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
public WebDriver  driver;
	
	
	public Book_hotel(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[@class='reg_error']//following::input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//label[@id='last_name_span']//preceding-sibling::input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//tr//descendant::textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath = "//label[@class='reg_error']//preceding-sibling::input[@id='cc_num']")
	private WebElement card_num;
	@FindBy(xpath = "//option[@value='VISA']//parent::select[@id='cc_type']")
	private WebElement card_type;
	@FindBy(xpath = "//td//child::select[@id='cc_exp_month']")
	private WebElement exp_mnth;
	@FindBy(xpath = "//label[@id='cc_expiry_span']//preceding-sibling::select[@id='cc_exp_year']")
	private WebElement exp_yr;
	@FindBy(xpath = "//td//child::input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath = "//input[@id='cancel']//preceding-sibling::input[@type='button']")
	private WebElement submit;


	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCard_num() {
		return card_num;
	}
	public WebElement getCard_type() {
		return card_type;
	}
	public WebElement getExp_mnth() {
		return exp_mnth;
	}
	public WebElement getExp_yr() {
		return exp_yr;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	


}
