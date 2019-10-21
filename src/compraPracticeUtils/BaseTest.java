/**
 * 
 */
package compraPracticeUtils;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * @author franciellev BaseTest
 */
public class BaseTest {

	private WebDriver driver;
	private Browser browser = new Browser();
	private String typeBrowser ="Chrome";
	private String url ="http://automationpractice.com/index.php";
	public ExtentReports report;
	public ExtentTest logger;
	
	
	public WebDriver getDriver() {
		if(this.driver == null) {
			driver = browser.startApplication(typeBrowser);
		}
		return this.driver;
	}
	
	@Before
	public void setUp() {
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/Practice_"+Utils.getCurrentDateTime()+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);
		getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		getDriver().manage().window().maximize();
		getDriver().get(url);
	}

	@After
	public void tearDown() {
		if(driver != null) {
			getDriver().quit();
		}
	report.flush();
	}
}