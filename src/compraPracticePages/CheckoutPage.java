/**
 * 
 */
package compraPracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author franciellev
 *
 */
public class CheckoutPage {

	private WebDriver driver;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement proceedButton() {
		
		WebElement proceedButton = this.driver.findElement(By.xpath("//a[@title='Proceed to checkout'][@class='button btn btn-default standard-checkout button-medium']"));
		return proceedButton;
	}
	
	public WebElement crateemailInput() {
		
		WebElement crateemailInput = this.driver.findElement(By.xpath("//div[@class='form-group']/input[@id='email_create']"));
		return crateemailInput;
	}
	
}
