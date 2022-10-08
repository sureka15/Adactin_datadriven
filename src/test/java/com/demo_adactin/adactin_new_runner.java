package com.demo_adactin;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.page.manager.Page_object_manager;
import com.singleton.property.data_reader;
import com.singleton.property.manager_class;

import adactin_pom.Book_hotel;
import adactin_pom.Confirm_page;
import adactin_pom.Hotel_details;
import adactin_pom.Hotel_search;
import adactin_pom.Login_adactin;

public class adactin_new_runner extends utility_automation {
	public static WebDriver driver = utility_automation.get_browser();
	public static Page_object_manager manager= new Page_object_manager(driver);
	public static Logger log=Logger.getLogger(adactin_new_runner.class);
	public static void main(String[] args) throws InterruptedException, IOException {

		
		PropertyConfigurator.configure("log4j.properties");
		
		String url = manager_class.get_instance().reader_instance().get_url();
		get_url(url);
		log.info("browser launch with url");
		//send_keys(manager.getLogin().getUsername(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 1, 5));
		send_keys(manager.getLogin().getUsername(), manager_class.get_instance().reader_instance().get_username());
		//send_keys(manager.getLogin().getPassword(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 2, 5));
		send_keys(manager.getLogin().getPassword(), manager_class.get_instance().reader_instance().get_password());
		click_element(manager.getLogin().getLogin_in());
		log.info("page successfully log");

		Select_byvalue(manager.getSearch().getLocation(),  particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 4, 5));
		Select_byvisible(manager.getSearch().getHotels(),  particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 5, 5));
		Select_byvalue(manager.getSearch().getRoom_type(),  particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 6, 5));
		Select_byvalue(manager.getSearch().getRoom_no(),  particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 7, 5));
		clear(manager.getSearch().getCheck_in());
		send_keys(manager.getSearch().getCheck_in(), "23/09/2022");
		clear(manager.getSearch().getCheck_out());
		send_keys(manager.getSearch().getCheck_out(), "30/09/2022");
		Select_byvalue(manager.getSearch().getAdult_room(),particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 10, 5));
		Select_byvisible(manager.getSearch().getChild_room(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 11, 5));
		click_element(manager.getSearch().getSubmit_search());
		log.info("your searched hotel available");

		click_element(manager.getDetail().getRadio_btn());
		click_element(manager.getDetail().getContinue_btn());
		log.warn("please agree the terms and condition");

		send_keys(manager.getHbook().getFirstname(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 15, 5));
		send_keys(manager.getHbook().getLastname(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 16, 5));
		send_keys(manager.getHbook().getAddress(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 17, 5));
		send_keys(manager.getHbook().getCard_num(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 18, 5));
		Select_byvalue(manager.getHbook().getCard_type(),particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 19, 5));
		Select_byvisible(manager.getHbook().getExp_mnth(),particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 20, 5));
		Select_byvalue(manager.getHbook().getExp_yr(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 21, 5));
		send_keys(manager.getHbook().getCvv(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 22, 5));
		click_element(manager.getHbook().getSubmit());
		log.fatal("please check your details");
		// javaScript_Excutor("arguments[0].scrollIntoView()", confirm.getSearch());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(manager.getConfirm().getSearch()));
		click_element(manager.getConfirm().getSearch());
		log.error("here driver get waited for searching the element");

		Select_byvalue(manager.getSearch().getLocation(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 25, 5));
		Select_byvisible(manager.getSearch().getHotels(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 26, 5));
		Select_byvalue(manager.getSearch().getRoom_type(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 27, 5));
		Select_byvalue(manager.getSearch().getRoom_no(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 28, 5));
		clear(manager.getSearch().getCheck_in());
		send_keys(manager.getSearch().getCheck_in(),"30/09/2022");
		clear(manager.getSearch().getCheck_out());
		send_keys(manager.getSearch().getCheck_out(),"5/10/2022");
		Select_byvalue(manager.getSearch().getAdult_room(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 31, 5));
		Select_byvisible(manager.getSearch().getChild_room(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 32, 5));
		click_element(manager.getSearch().getSubmit_search());

		click_element(manager.getDetail().getRadio_btn());
		click_element(manager.getDetail().getContinue_btn());

		send_keys(manager.getHbook().getFirstname(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 36, 5));
		send_keys(manager.getHbook().getLastname(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 37, 5));
		send_keys(manager.getHbook().getAddress(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 38, 5));
		send_keys(manager.getHbook().getCard_num(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 39, 5));
		Select_byvalue(manager.getHbook().getCard_type(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 40, 5));
		Select_byvisible(manager.getHbook().getExp_mnth(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 41, 5));
		Select_byvalue(manager.getHbook().getExp_yr(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 42, 5));
		send_keys(manager.getHbook().getCvv(), particular_data("C:\\Users\\BALA\\Desktop\\adactin.xlsx", 43, 5));
		click_element(manager.getHbook().getSubmit());
		wait.until(ExpectedConditions.elementToBeClickable(manager.getConfirm().getLtinenary()));
		click_element(manager.getConfirm().getLtinenary());
		
		

	}
}
