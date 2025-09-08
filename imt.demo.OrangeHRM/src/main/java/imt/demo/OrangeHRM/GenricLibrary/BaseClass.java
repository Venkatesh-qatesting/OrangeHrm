package imt.demo.OrangeHRM.GenricLibrary;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import ObjectRepository.HomePage_Locators;
import ObjectRepository.LoginPage_Locators;

public class BaseClass {
	public static WebDriver driver;
	SeleniumUtility sutil = new SeleniumUtility();
	FileUtility f = new FileUtility();

	@BeforeSuite
	public void DatabaseConnection() {
		Reporter.log("Database Connected Successfully", true);
	}

	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = new ChromeDriver();
		String Url = f.getPropertyFile("url");
		sutil.maximizeBrowser(driver);
		driver.get(Url);
		sutil.implicitWait(driver);
	}

	@BeforeMethod
	public void loginPage() throws IOException {
		LoginPage_Locators lp = new LoginPage_Locators(driver);
		FileUtility file = new FileUtility();
		String Username = file.getPropertyFile("username");
		String Password = file.getPropertyFile("password");
		sutil.explicitWait(driver, lp.getUsernameTextField());
		lp.loginPage(Username, Password);
	}

	@AfterMethod
	public void logout() {
		HomePage_Locators hp = new HomePage_Locators(driver);
		sutil.implicitWait(driver);
		hp.logout();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void closeDBConnection() {
		Reporter.log("Database Disconnected", true);
	}

}
