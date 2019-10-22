/**
 * 
 */
package compraPracticeController;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import compraPracticePages.ResultadoPesquisaPage;
import compraPracticeUtils.Utils;
import junit.framework.Assert;

/**
 * @author franciellev
 *
 */
public class ResultadoPesquisaController {
	
	
	private WebDriver driver;
	private ResultadoPesquisaPage pageResultadoPesquisa;
	private Utils utils = new Utils(driver);
	private ExtentTest logger;
	
	public ResultadoPesquisaController(WebDriver driver) {
		this.driver = driver;
		pageResultadoPesquisa = new ResultadoPesquisaPage(this.driver);
	}
	
	
	public void selecionarProduto() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		pageResultadoPesquisa.selecionarImage().click();
		Thread.sleep(1000);
		String verifica = pageResultadoPesquisa.verificaPage().getText();
		assertEquals(verifica, "Printed Summer Dress");
		
	}
	
	public void adicionarCarrinho() throws InterruptedException, IOException {
		
		pageResultadoPesquisa.addCarButton().click();
		Thread.sleep(1000);
		String verifica = pageResultadoPesquisa.verificaCarButton().getText();
		assertEquals(verifica, "Product successfully added to your shopping cart");
		pageResultadoPesquisa.checkoutButton().click();
		validationCheckout();
		
	}
	
	public void validationCheckout () {
		try {
		String validation = pageResultadoPesquisa.verificaCheckout().getText();
		assertEquals(validation,"01.");
	}catch (Exception ex) {
		
		logger.fail("Assert falhou");
	}
  }
}
