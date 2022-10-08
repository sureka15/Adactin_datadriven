package com.demo.amazon;

import org.openqa.selenium.WebDriver;

import com.demo_adactin.utility_automation;
import com.page.manager.amazon1_manager;

public class amazon_runner extends utility_automation {
	public static WebDriver driver = utility_automation.get_browser();
	public static amazon1_manager manager = new amazon1_manager(driver);

	public static void main(String[] args) {
		get_url("https://www.amazon.in/");
		// direct purchase 
		/*send_keys(manager.home().getSearchbox(), "new design lehanga for girls ");
		click_element(manager.home().getSearchbtn());
		click_element(manager.lehang().getNenafashion());
		Switch_driver();
		click_element(manager.buy().getLehanga());
		send_keys(manager.signin().getEmail(),"9360660723");
		click_element(manager.signin().getContinue_btn());
		send_keys(manager.account().getPass(), "sandhiya_01");
		click_element(manager.signin().getCheckbox());
		click_element(manager.signin().getSiginin());*/
		
		// Signin
		
		/*action_move(manager.home().getSigin());
		click_element(manager.login().getSigin());*/
		
		// new customer sigin 
		action_move(manager.home().getSigin());
		click_element(manager.signin().getStarthere());
//		send_keys(manager.account().getYourname(), "sandhiya");
//		send_keys(manager.account().getPhone(), "9360660723");
//		send_keys(manager.account().getPass(), "sandhiya_01");
//		click_element(manager.account().getContinue_btn());
//		send_keys(manager.signin().getEmail(), "9360660723");
//		click_element(manager.signin().getContinue_btn());
//		send_keys(manager.account().getPass(), "sandhiya_01");
//		click_element(manager.signin().getSiginin());
		
		
		
//		click_element(manager.login().getDrop());

	}

}
