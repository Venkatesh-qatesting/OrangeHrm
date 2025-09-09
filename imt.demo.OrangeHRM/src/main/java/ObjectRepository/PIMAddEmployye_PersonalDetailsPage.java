package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMAddEmployye_PersonalDetailsPage {
	
	@FindBy(xpath = "//div[@class='orangehrm-edit-employee']")
	private WebElement PersonalDetailsPage;
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(name = "middleName")
	private WebElement middleNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	@FindBy(xpath = "//label[.='Employee Id']/parent::div/following-sibling::div/child::input")
	private WebElement employeeIdTextField;
	
	@FindBy(xpath = "//label[.='Other Id']/parent::div/following-sibling::div/child::input")
	private WebElement orderIdTextField;
	
	@FindBy(xpath = "//label[contains(., 'Driver')]/parent::div/following-sibling::div/child::input")
	private WebElement drivingLicenseTextField;
	
	@FindBy(xpath = "//label[.='License Expiry Date']/parent::div/following-sibling::div/descendant::i")
	private WebElement drivingLicenseExpiryCalendar;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']/child::p")
	private WebElement drivingLicenseExpirySelectMonth;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']/child::p")
	private WebElement drivingLicenseExpirySelectYear;

	@FindBy(xpath = "//div[@class='oxd-calendar-date']")
	private WebElement drivingLicenseExpirySelectDate;
	
	@FindBy(xpath = "//label[.='Date of Birth']/parent::div/following-sibling::div/descendant::i")
	private WebElement dateOfBirthCalendarField;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']/child::p")
	private WebElement dateOfBirthSelectMonth;
	
	@FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']/child::p")
	private WebElement dateOfBirthSelectYear;

	@FindBy(xpath = "//div[@class='oxd-calendar-date']")
	private WebElement dateOfBirthSelectDate;
	
	@FindBy(xpath = "//div[@class='oxd-date-input-link --today']")
	private WebElement todayButtonInCalendar;
	
	@FindBy(xpath = "//div[@class='oxd-date-input-link --clear']")
	private WebElement clearButtonInCalendar;
	
	@FindBy(xpath = "//div[@class='oxd-date-input-link --close']")
	private WebElement closeButtonInCalendar;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-chevron-right']")
	private WebElement nextMonthArrowButton;
	
	@FindBy(xpath = "oxd-icon bi-chevron-left")
	private WebElement previousMonthArrowButton;
	
	@FindBy(xpath = "//label[.='License Expiry Date']/parent::div/following-sibling::div//input[@placeholder='mm-dd-yyyy']")
	private WebElement enterLicenseExpiryDate;
	
	@FindBy(xpath = "//label[.='Date of Birth']/parent::div/following-sibling::div//input[@placeholder='mm-dd-yyyy']")
	private WebElement enterDateOfBirth;
	
	@FindBy(xpath = "//label[.='Nationality']/parent::div/following-sibling::div//div[text()='-- Select --']")
	private WebElement nationalityDropdown;
	
	@FindBy(xpath = "//label[.='Marital Status']/parent::div/following-sibling::div//div[text()='-- Select --']")
	private WebElement martialStatusDropdown;
	
	@FindBy(xpath = "//label[.='Male']")
	private WebElement genderMaleRadioButton;
	
	@FindBy(xpath = "//label[.='Female']")
	private WebElement genderFemaleRadioButton;
	
	@FindBy(xpath = "//p[.=' * Required']/following-sibling::button[.=' Save ']")
	private WebElement savePersonalDetailsButton;
	
	@FindBy(xpath = "//label[.='Blood Type']/parent::div/following-sibling::div//div[text()='-- Select --']")
	private WebElement bloodTypeDropdown;
	
	@FindBy(xpath = "//label[.='Test_Field']")
	private WebElement testFieldTextBox;
	
	@FindBy(xpath = "//h6[.='Custom Fields']/following-sibling::form/descendant::div[@class='oxd-form-actions']/child::button")
	private WebElement saveCustomFieldsButton;
	
	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addDocumentsButton;
	
	@FindBy(linkText = "Contact Details")
	private WebElement contactDetailsMenuButton;
	
	@FindBy(linkText = "Emergency Contacts")
	private WebElement EmergencyContactMenuButton;
	
	@FindBy(linkText = "Dependents")
	private WebElement dependentsMenuButton;
	
	@FindBy(linkText = "Immigration")
	private WebElement immigrationMenuButton;
	
	@FindBy(linkText = "Job")
	private WebElement jobMenuButton;
	
	@FindBy(linkText = "Salary")
	private WebElement salaryMenuButton;
	
	@FindBy(linkText = "Report-to")
	private WebElement reportsToMenuButton;
	
	@FindBy(linkText = "Qualifications")
	private WebElement qualificationsMenuButton;
	
	@FindBy(xpath = "Memberships")
	private WebElement membershipsMenuButton;
	
	
	public PIMAddEmployye_PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNationalityDropdown() {
		return nationalityDropdown;
	}

	public WebElement getMartialStatusDropdown() {
		return martialStatusDropdown;
	}

	public WebElement getGenderMaleRadioButton() {
		return genderMaleRadioButton;
	}

	public WebElement getGenderFemaleRadioButton() {
		return genderFemaleRadioButton;
	}

	public WebElement getSavePersonalDetailsButton() {
		return savePersonalDetailsButton;
	}

	public WebElement getBloodTypeDropdown() {
		return bloodTypeDropdown;
	}

	public WebElement getTestFieldTextBox() {
		return testFieldTextBox;
	}

	public WebElement getSaveCustomFieldsButton() {
		return saveCustomFieldsButton;
	}

	public WebElement getAddDocumentsButton() {
		return addDocumentsButton;
	}

	public WebElement getContactDetailsMenuButton() {
		return contactDetailsMenuButton;
	}

	public WebElement getEmergencyContactMenuButton() {
		return EmergencyContactMenuButton;
	}

	public WebElement getDependentsMenuButton() {
		return dependentsMenuButton;
	}

	public WebElement getImmigrationMenuButton() {
		return immigrationMenuButton;
	}

	public WebElement getJobMenuButton() {
		return jobMenuButton;
	}

	public WebElement getSalaryMenuButton() {
		return salaryMenuButton;
	}

	public WebElement getReportsToMenuButton() {
		return reportsToMenuButton;
	}

	public WebElement getQualificationsMenuButton() {
		return qualificationsMenuButton;
	}

	public WebElement getMembershipsMenuButton() {
		return membershipsMenuButton;
	}

	public WebElement getPersonalDetailsPage() {
		return PersonalDetailsPage;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
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

	public WebElement getOrderIdTextField() {
		return orderIdTextField;
	}

	public WebElement getDrivingLicenseTextField() {
		return drivingLicenseTextField;
	}

	public WebElement getDrivingLicenseExpiryCalendar() {
		return drivingLicenseExpiryCalendar;
	}

	public WebElement getDrivingLicenseExpirySelectMonth() {
		return drivingLicenseExpirySelectMonth;
	}

	public WebElement getDrivingLicenseExpirySelectYear() {
		return drivingLicenseExpirySelectYear;
	}

	public WebElement getDrivingLicenseExpirySelectDate() {
		return drivingLicenseExpirySelectDate;
	}

	public WebElement getDateOfBirthCalendarField() {
		return dateOfBirthCalendarField;
	}

	public WebElement getDateOfBirthSelectMonth() {
		return dateOfBirthSelectMonth;
	}

	public WebElement getDateOfBirthSelectYear() {
		return dateOfBirthSelectYear;
	}

	public WebElement getDateOfBirthSelectDate() {
		return dateOfBirthSelectDate;
	}

	public WebElement getTodayButtonInCalendar() {
		return todayButtonInCalendar;
	}

	public WebElement getClearButtonInCalendar() {
		return clearButtonInCalendar;
	}

	public WebElement getCloseButtonInCalendar() {
		return closeButtonInCalendar;
	}

	public WebElement getNextMonthArrowButton() {
		return nextMonthArrowButton;
	}

	public WebElement getPreviousMonthArrowButton() {
		return previousMonthArrowButton;
	}

	public WebElement getEnterLicenseExpiryDate() {
		return enterLicenseExpiryDate;
	}

	public WebElement getEnterDateOfBirth() {
		return enterDateOfBirth;
	}
	
}
