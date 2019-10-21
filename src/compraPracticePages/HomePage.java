/**
 * 
 */
package compraPracticePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import compraPracticeUtils.Browser;
import compraPracticeUtils.BaseTest;

/**
 * @author franciellev
 *
 */
public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement pesquisarTextField() {
		WebElement pesquisarTextField = this.driver.findElement(By.xpath("//input[@id='search_query_top']"));
		return pesquisarTextField;
	}

	public WebElement searchButton() {
		WebElement searchButton = this.driver.findElement(By.xpath("//button[@class='btn btn-default button-search']"));
		return searchButton;
	}
}
