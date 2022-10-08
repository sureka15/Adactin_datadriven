package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_adactin {
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='login_error']//preceding-sibling::input[@type='text']")
	private WebElement username;
	@FindBy(xpath="//td//child::input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//tr//descendant::input[@type='Submit']")
	private WebElement login_in;
	public Login_adactin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin_in() {
		return login_in;
	}
	

}
