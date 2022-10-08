package demo_automation;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.demo_adactin.utility_automation;
import com.page.manager.Autoamation_manager;

public class automation_runner extends utility_automation {
	public static WebDriver driver = utility_automation.get_browser();
	public static Autoamation_manager manager = new Autoamation_manager(driver);
	public static Logger log = Logger.getLogger(automation_runner.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		get_url("http://automationpractice.com/index.php");
		log.info("browser launch");
		action_move(manager.getStore().getWomen());
		log.info("tab in women in mystore page");
		click_element(manager.getWomen().getWomen_causal());
		log.info("clicked in womens causal dresses ");
		click_action(manager.getCasual().getPrinted_dress());
		log.info("select one printed dress");
		log.warn("it must be frame ");
		single_frame(manager.getFrame().getFrame());
		log.info("inside the frame");
		click_action(manager.getFrame().getPlus_btn());
		Select_byvalue(manager.getFrame().getSelect_size(), "3");
		click_element(manager.getFrame().getAddcard());
		log.error("driver waiting for element to be clickable" );
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(manager.getProceed().getCheckout()));
		click_element(manager.getProceed().getCheckout());
		
		click_element(manager.getProceed().getProceed());
		javaScript_Excutor("arguments[0].value='surekaxyz56@gmail.com'", manager.getSignin().getEmail());
		javaScript_Excutor("arguments[0].value='sureka@rajesh20'", manager.getSignin().getPass());
		click_action(manager.getSignin().getLogin());
		click_action(manager.getProceed().getAdd_proceed());
		click_action(manager.getShipping().getCheckbox());
		click_action(manager.getShipping().getProceed());
		click_action(manager.getOrder().getPaybank());
		click_action(manager.getOrder().getConfirmorder());
		click_action(manager.getOrder().getBackorder());
		click_action(manager.getOrder().getBacktohome());
		action_move(manager.getStore().getWomen());
		click_element(manager.getWomen().getWomen_evening());
		click_action(manager.getCasual().getPrinted_dress());
		single_frame(manager.getFrame().getFrame());
		click_action(manager.getFrame().getPlus_btn());
		Select_byvalue(manager.getFrame().getSelect_size(), "3");
		click_element(manager.getFrame().getAddcard());
		log.error("driver waiting for element to be clickable" );
		wait.until(ExpectedConditions.elementToBeClickable(manager.getProceed().getCheckout()));
		click_element(manager.getProceed().getCheckout());
		click_element(manager.getProceed().getProceed());
		click_action(manager.getProceed().getAdd_proceed());
		click_action(manager.getShipping().getCheckbox());
		click_action(manager.getShipping().getProceed());
		click_action(manager.getOrder().getPaybank());
		click_action(manager.getOrder().getConfirmorder());
		click_action(manager.getOrder().getBackorder());

	}

}
