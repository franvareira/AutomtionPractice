/**
 * 
 */
package compraPracticeController;

import org.openqa.selenium.WebDriver;

import compraPracticePages.CheckoutPage;
import compraPracticePages.ResultadoPesquisaPage;
import compraPracticeUtils.Utils;

/**
 * @author franciellev
 *
 */
public class CheckoutController {

	private WebDriver driver;
	private CheckoutPage checkoutpage;
	private Utils utils = new Utils(driver);
	
	public CheckoutController(WebDriver driver) {
		this.driver = driver;
		checkoutpage = new CheckoutPage(this.driver);
	}
	
	public void ProceedCheckout() {
		
		checkoutpage.proceedButton().click();
		checkoutpage.crateemailInput().sendKeys("teste@teste.com.br");
	}
	
}
