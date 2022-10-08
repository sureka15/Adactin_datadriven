package com.page.manager;

import org.openqa.selenium.WebDriver;

import adactin_pom.Book_hotel;
import adactin_pom.Confirm_page;
import adactin_pom.Hotel_details;
import adactin_pom.Hotel_search;
import adactin_pom.Login_adactin;

public class Page_object_manager {
public WebDriver driver;
private Login_adactin login;
private Hotel_search search ;
private Hotel_details detail;
private Book_hotel hbook ;
private Confirm_page confirm;
public Page_object_manager(WebDriver driver) {
	this.driver= driver;
}
public Login_adactin getLogin() {
	if(login==null)
	{
		login = new Login_adactin(driver);
	}
	return login;
}
public Hotel_search getSearch() {
	if(search ==null)
	{
		search = new Hotel_search(driver);
	}
	return search;
}
public Hotel_details getDetail() {
	if(detail == null )
	{
		detail = new Hotel_details(driver);
	}
	return detail;
}
public Book_hotel getHbook() {
	if(hbook == null )
	{
		hbook= new Book_hotel(driver);
	}
	return hbook;
}
public Confirm_page getConfirm() {
	if(confirm == null)
	{
		confirm = new Confirm_page(driver);
	}
	return confirm;
}


}
