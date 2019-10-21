/**
 * 
 */
package compraPracticeUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author franciellev
 *
 */
public class Browser {

	protected WebDriver driver;

	public WebDriver startApplication(String typeBrowser) {

		if(typeBrowser.equals("Chrome")){
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			
		}else if(typeBrowser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(typeBrowser.equals("IE")) {
			
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			
		}else {
			
			System.out.println("Browser não suportado");
		}
		
		return driver;
								
		 /*switch (typeBrowser) { 
		
		 case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		
		/*case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		case "":
			System.out.println("Browser não suportado");
		}*/

	}
}