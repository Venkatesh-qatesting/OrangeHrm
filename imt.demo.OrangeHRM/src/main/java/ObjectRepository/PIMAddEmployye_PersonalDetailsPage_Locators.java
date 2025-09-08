package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMAddEmployye_PersonalDetailsPage_Locators {
	
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
	
	public PIMAddEmployye_PersonalDetailsPage_Locators(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
