package LoginPageRunnableFiles;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepository.HomePage_Locators;
import ObjectRepository.PIMAddEmployye_PersonalDetailsPage_Locators;
import ObjectRepository.PIM_AddEmployeePage_Locators;
import ObjectRepository.PIM_EmployeeListPage_Locators;
import imt.demo.OrangeHRM.GenricLibrary.BaseClass;
import imt.demo.OrangeHRM.GenricLibrary.FileUtility;
import imt.demo.OrangeHRM.GenricLibrary.ListnersClass;
import imt.demo.OrangeHRM.GenricLibrary.SeleniumUtility;
import imt.demo.OrangeHRM.GenricLibrary.ipathConstants;

@Listeners(ListnersClass.class)

public class LoginPageScripts extends BaseClass {	
	FileUtility file = new FileUtility();
	SeleniumUtility sutil = new SeleniumUtility();
	
	
	@Test(groups = "Smoke")
	public void login() {
		Reporter.log("Login Successful", true);
	}
	public static String EmployeeId1;
	@Test(groups = "Smoke",dependsOnMethods = "login")
	public void createEmployee() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage_Locators hp = new HomePage_Locators(driver);
		PIM_EmployeeListPage_Locators pimhome = new PIM_EmployeeListPage_Locators(driver);
		WebElement dashboardMenu = hp.getDashboardMenu();
		Assert.assertTrue(dashboardMenu.isDisplayed());
		sutil.explicitWait(driver, hp.getPimMenu());
		hp.getPimMenu().click();
		WebElement addEmployeeButton = pimhome.getAddEmployeeButton();
		Assert.assertTrue(addEmployeeButton.isDisplayed());
		sutil.explicitWaitClick(driver, pimhome.getAddEmployeeButton());
		pimhome.getAddEmployeeButton().click();
		PIM_AddEmployeePage_Locators addemp = new PIM_AddEmployeePage_Locators(driver);
		String firstName = file.readExcelData("EmployeeData", 1, 0);
		String lastName = file.readExcelData("EmployeeData", 1, 2);
		String employeeId = file.readExcelData("EmployeeData", 1, 3);
		String uploadPhoto = sutil.Upload(ipathConstants.profilePhoto);
		EmployeeId1 = addemp.getEmployeeIdTextField().getAttribute("value");
		addemp.createEmployee(firstName, lastName, employeeId, uploadPhoto);
		PIMAddEmployye_PersonalDetailsPage_Locators editDetails = new PIMAddEmployye_PersonalDetailsPage_Locators(driver);
		WebElement personalDetailsPage = editDetails.getPersonalDetailsPage();
		sutil.explicitWait(driver, personalDetailsPage);
		Assert.assertTrue(personalDetailsPage.isDisplayed());
	}

	@Test(groups = "Smoke",dependsOnMethods = "createEmployee")
	public void searchCreatedEmployee() throws InterruptedException {
		HomePage_Locators hp = new HomePage_Locators(driver);
		hp.getPimMenu().click();
		PIM_EmployeeListPage_Locators elist = new PIM_EmployeeListPage_Locators(driver);
		WebElement employeeListTable = elist.getEmployeeListTable();
		sutil.explicitWait(driver, employeeListTable);
		Assert.assertTrue(employeeListTable.isDisplayed());
		elist.searchEmployee(EmployeeId1);
		
	}
}