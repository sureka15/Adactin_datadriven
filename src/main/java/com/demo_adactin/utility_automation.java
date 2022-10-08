package com.demo_adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utility_automation {

	public static WebDriver driver;
	public static String value;

	public static WebDriver get_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static String get_url(String value) {
		driver.get(value);
		return value;
	}

	public static String get_title() {
		return driver.getTitle();

	}
	public static void single_frame(WebElement e)
	{
		driver.switchTo().frame(e);
		
	}

	public static String getcurrent_url() {
		return driver.getCurrentUrl();
	}
	public static void send_keys(WebElement e, String value) {
		e.sendKeys(value);
	}
	public static void click_element(WebElement e) {
		e.click();
	}
	public static void explicit_wait(WebElement e)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(e));
	}

	public static void action_move(WebElement b) {
		Actions a = new Actions(driver);
		a.moveToElement(b).build().perform();

	}

	public static void action_right_click(WebElement c) throws AWTException {
		Actions a = new Actions(driver);
		a.contextClick(c).build().perform();
		Robot_action();
	}

	public static void click_action(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).build().perform();

	}

	public static void Robot_action() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Switch_driver();
	}

	public static void mouse_action(WebElement e, String s) {
		Actions a = new Actions(driver);
		if (s.equalsIgnoreCase("click")) {
			a.click(e).build().perform();

		} else if (s.equalsIgnoreCase("moveto")) {
			a.moveToElement(e).build().perform();
		} else if (s.equalsIgnoreCase("context")) {
			a.contextClick(e).build().perform();
		} else if (s.equalsIgnoreCase("draganddrop")) {
			a.dragAndDrop(e, e).build().perform();
		} else if (s.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(e).build().perform();
		}
	}

	public static void Switch_driver() {

		Set<String> child_window = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(child_window);
		for (int i = list.size() - 1; i >= 0; i++) {
			driver.switchTo().window(list.get(i));
			list.clear();
			break;

		}
	}

	public static String javaScript_Excutor(String value, WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value, e);
		return value;
	}

	public static File take_screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
		return destination;

	}

	public static void Select_byvalue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);

	}

	public static void Select_byvisible(WebElement e, String value) {
		Select s1 = new Select(e);
		s1.selectByVisibleText(value);
	}

	public static void clear(WebElement e) {
		e.clear();
	}

	
public static void select_options(WebElement e,String value1, String value)
{
	Select s = new Select(e);
	if(value1.equals(value))
	{
		s.selectByVisibleText(value);
	}
	else if(!value1.equals(value))
	{
		s.selectByValue(value1);
	}
	else
	{
		s.selectByIndex(0);
	}
	 
}
public static String particular_data(String path, int row, int cell) throws IOException {
	File f = new File (path);
	FileInputStream input = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(input);
	Sheet s = wb.getSheetAt(0);
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	CellType type = c.getCellType();
	if(type.equals(CellType.STRING))
	{
		 value = c.getStringCellValue();
	}
	else if (type.equals(CellType.NUMERIC))
	{
		double d = c.getNumericCellValue();
		// double to int 
		
		long a = (long) d;
		
		// int  to String 
		
		value = String.valueOf(a);
	}
	wb.close();
	return value;
}
public static void data_write(String path) throws IOException
{
	File f = new File(path);
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
wb.createSheet("sample").createRow(0).createCell(0).setCellValue("name");
wb.getSheet("sample").getRow(0).createCell(1).setCellValue("course");
wb.getSheet("sample").createRow(1).createCell(0).setCellValue("sureka");
wb.getSheet("sample").getRow(1).createCell(1).setCellValue("python");
FileOutputStream fos = new FileOutputStream(f);
wb.write(fos);
wb.close();
	
}
	
}
