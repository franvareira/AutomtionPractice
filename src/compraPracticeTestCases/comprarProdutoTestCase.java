/**
 * 
 */
package compraPracticeTestCases;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import compraPracticeController.HomeController;
import compraPracticeController.ResultadoPesquisaController;
import compraPracticeUtils.BaseTest;
import compraPracticeUtils.Utils;

/**
 * @author franciellev
 *
 */

public class comprarProdutoTestCase extends BaseTest {
	
	private WebDriver driver = this.getDriver();
	
	@Test
	public void RealizarCompra() throws InterruptedException, IOException {
		
		logger = report.createTest("Compra_PracticeAutomation");
		
		HomeController homecontroller = new HomeController(driver);
		ResultadoPesquisaController resultadopesquisacontroller = new ResultadoPesquisaController(driver);
		
		logger.info("Start Aplicattion");
		homecontroller.pesquisarProduto();
		resultadopesquisacontroller.selecionarProduto();
		logger.pass("Produto Selecionado com sucesso");
		logger.addScreenCaptureFromPath(Utils.captureScreenshot(this.getDriver()));
		resultadopesquisacontroller.adicionarCarrinho();
		logger.pass("Produto adicionado no carrinho com sucesso");
		logger.addScreenCaptureFromPath(Utils.captureScreenshot(this.getDriver()));
		
	}
}
