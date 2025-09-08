package imt.demo.OrangeHRM.GenricLibrary;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * This class is created to use the Selenium objects or methods
 * 
 * @author venkatesh
 */
public class SeleniumUtility {

	/**
	 * This method is created to take Screenshots
	 * 
	 * @param driver
	 * @param name
	 * @throws IOException
	 */
	public void takeScreenshot(WebDriver driver, String name) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + name + ".png");
		Files.copy(src, dest);
	}

	/**
	 * This method is created to maximize the browser
	 * 
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is created to do implicit wait
	 * 
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	/**
	 * This method is created to wait until element is visible
	 * 
	 * @param driver
	 * @param element
	 */
	public void explicitWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is created to wait until element is clickable
	 * 
	 * @param driver
	 * @param element
	 */

	public void explicitWaitClick(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method is created to convert the String Path into Absolute Path for Uploading the file
	 * @param profilPhoto
	 * @return
	 */
	public String Upload(String profilPhoto) {
		File file = new File(profilPhoto);
		String absoluteFile = file.getAbsolutePath();
		return absoluteFile;
	}
	
	/**
	 * this method is created to clear or add data in fields which are not able to edit by Selenium
	 * @param driver
	 * @param element
	 * @param data
	 */
	public void addJsValue(WebDriver driver, WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].Value="+data+";", element);
	}
	
}
