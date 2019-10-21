/**
 * 
 */
package compraPracticeController;

import org.openqa.selenium.WebDriver;

import compraPracticePages.HomePage;
import compraPracticeUtils.Utils;

/**
 * @author franciellev
 *
 */
public class HomeController {

	private WebDriver driver;
	private HomePage page;
	private Utils utils = new Utils(driver);
	
	public HomeController(WebDriver driver) {
		this.driver = driver;
		page = new HomePage(this.driver);
	}

	public void pesquisarProduto() {
		//utils.elementToBeClickable(page.pesquisarTextField());
		page.pesquisarTextField().click();
		page.pesquisarTextField().sendKeys("casual");
		page.searchButton().click();
		

	}
}
