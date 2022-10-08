package adactin_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_search {
public WebDriver driver;
public Hotel_search(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//tbody//descendant::select[@name='location']")
private WebElement location; 
@FindBy(xpath="//option[@ value='Hotel Creek']//parent::select[@id='hotels']")
private WebElement hotels;
@FindBy(xpath="//span[@id='hotel_span']//following::select[@name='room_type']")
private WebElement room_type;
@FindBy(xpath="//td[text()='Check In Date']//preceding::select[@name='room_nos']")
private WebElement room_no;
@FindBy(xpath = "//td//child::input[@type='text' and @name='datepick_in']")
private WebElement Check_in;
@FindBy(xpath = "//tr//descendant::input[@id='datepick_out']")
private WebElement Check_out;
@FindBy(xpath = "//td//child::select[@name='adult_room']")
private WebElement Adult_room;
@FindBy(xpath ="//tr//descendant::select[@id='child_room']")
private WebElement Child_room;
@FindBy(xpath = "//input[@name='datepick_diff']//preceding-sibling::input[@type='submit']")
private WebElement submit_search;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getRoom_no() {
	return room_no;
}
public WebElement getCheck_in() {
	return Check_in;
}
public WebElement getCheck_out() {
	return Check_out;
}
public WebElement getAdult_room() {
	return Adult_room;
}
public WebElement getChild_room() {
	return Child_room;
}
public WebElement getSubmit_search() {
	return submit_search;
}





}
