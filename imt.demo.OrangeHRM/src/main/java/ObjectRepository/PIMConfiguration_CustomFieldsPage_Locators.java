package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMConfiguration_CustomFieldsPage_Locators {
	@FindBy(xpath = "//div[@class='orangehrm-container']")
	private WebElement customFieldsPageTable;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addCustomeFieldsButton;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement deleteRecordIconFromTable;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editRecordIconFromTable;
}
