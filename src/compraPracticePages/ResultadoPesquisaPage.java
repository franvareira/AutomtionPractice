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
public class ResultadoPesquisaPage {

	private WebDriver driver;

	public ResultadoPesquisaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement selecionarImage() {
		WebElement selecionarImage = this.driver.findElement(By.xpath("//div[@class='right-block']/h5[@itemprop='name']/a[@title='Printed Summer Dress']"));
		return selecionarImage;
	}
	
	public WebElement verificaPage() {
		WebElement verificaPage = this.driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1[@itemprop='name']"));
		return verificaPage;
	}
	
	public WebElement addCarButton() {
		WebElement addCarButton = this.driver.findElement(By.xpath("//button[@name='Submit']"));
		return addCarButton;
	}
	
    public WebElement verificaCarButton() {
    	WebElement verificaCarButton = this.driver.findElement(By.xpath("//div[@class='layer_cart_product col-xs-12 col-md-6']/h2"));
    	return verificaCarButton;
    }
	
}
