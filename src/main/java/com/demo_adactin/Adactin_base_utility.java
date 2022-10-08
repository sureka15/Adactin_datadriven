package com.demo_adactin;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_base_utility {
public static WebDriver driver;
public static WebDriver get_browser() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver1.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
}
public static void get_url(String value)
{
	driver.get(value);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	public static void send_keys(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void click_element(WebElement e)
	{
		e.click();
	}
	public static void Select_byvalue(WebElement e,String value)
	{
		Select s= new Select(e);
		s.selectByValue(value);
		
	}
	public static void Select_byvisible(WebElement e,String value )
	{  
		Select s1= new Select(e);
		s1.selectByVisibleText(value);
	}
	public static void clear(WebElement e)
	{
		e.clear();
	}
	
	



		
	

}
