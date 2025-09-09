package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_AddEmployeePage {
	
	@FindBy(name = "firstName")
	private WebElement firstNametextField;

	@FindBy(name = "middleName")
	private WebElement middleNameTextField;

	@FindBy(name = "lastName")
	private WebElement lastNameTextField;

	@FindBy(xpath = "//label[.='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement employeeIdTextField;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement createLoginDetailsButton;

	@FindBy(xpath = "//label[.='Username']/parent::div/following-sibling::div/child::input")
	private WebElement usernameTextField;

	@FindBy(xpath = "//label[.='Password']/parent::div/following-sibling::div/child::input")
	private WebElement passwordTextField;

	@FindBy(xpath = "//label[.='Confirm Password']/parent::div/following-sibling::div/child::input")
	private WebElement confirmPasswordTextField;

	@FindBy(xpath = "//label[.='Disabled']")
	private WebElement disabledStatusRadioButton;

	@FindBy(xpath = "//label[.='Enabled']")
	private WebElement enabledStatusRadioButton;

	@FindBy(xpath = "//button[.=' Cancel ']")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveButton;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement uploadProfileButton;

	public PIM_AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNametextField() {
		return firstNametextField;
	}

	public WebElement getMiddleNameTextField() {
		return middleNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmployeeIdTextField() {
		return employeeIdTextField;
	}

	public WebElement getCreateLoginDetailsButton() {
		return createLoginDetailsButton;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getDisabledStatusRadioButton() {
		return disabledStatusRadioButton;
	}

	public WebElement getEnabledStatusRadioButton() {
		return enabledStatusRadioButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getUploadProfileButton() {
		return uploadProfileButton;
	}

	public void createEmployee(String firstName, String lastName, String empId, String profilePhoto)
			throws InterruptedException {
		getFirstNametextField().sendKeys(firstName);
		getLastNameTextField().sendKeys(lastName);
		getEmployeeIdTextField().clear();
//		getEmployeeIdTextField().sendKeys(empId);	
		getUploadProfileButton().sendKeys(profilePhoto);
		getSaveButton().click();
	}
}