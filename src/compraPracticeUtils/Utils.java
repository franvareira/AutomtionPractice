package compraPracticeUtils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.io.FileHandler;

public class Utils {

	private WebDriver driver;
	
	public Utils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void elementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public void waitLoadElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
   public static String getCurrentDateTime () {
	
	   DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	   Date currenteDate = new Date();
	   return customFormat.format(currenteDate);  
    }
   
   public static String captureScreenshot(WebDriver driver) {
	   
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   String screenshotPath = System.getProperty("user.dir") + "/Screenshot/Compra_Practice_" + getCurrentDateTime() + ".png";
	   try {
		   
		  FileHandler.copy(src, new File(screenshotPath));
		  System.out.println("Screenshot capturada");
		  
	   }catch (IOException e){
	  
		   System.out.println("Falha na captura do Screenshot" + e.getMessage());
		   }
	   
	   return screenshotPath;
   }
}
