package com.demo_adactin;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class amazon_base_utility {

	public static WebDriver driver;

	public static WebDriver get_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static String get_url(String value) {
		driver.get(value);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return value;
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void mouse_action(WebElement e, String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("click")) {
			a.click(e).build().perform();

		} else if (s.equalsIgnoreCase("moveto")) {
			a.moveToElement(e).build().perform();
			;
		} else if (s.equalsIgnoreCase("context")) {
			a.contextClick(e).build().perform();
		} else if (s.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(e, e).build().perform();
		} else if (s.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(e).build().perform();
		}
	}

	public static void Select_option(WebElement e, String value,String value1,int index ) {
		Select s = new Select(e);
		if (value.equals(value1)) {
			s.selectByValue(value);
		} else if (!value.equals(value1)) {
			s.selectByVisibleText(value1);
		} else if(value.equalsIgnoreCase(value1)){
			s.selectByIndex(index);
		}
	}

	public static String navigate_url(String value) {
		if (value.contains("http")) {
			driver.navigate().to(value);
		}

		return value;

	}

	public static String javaScript_Excutor(String value, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, e);
		return value;
	}

}
