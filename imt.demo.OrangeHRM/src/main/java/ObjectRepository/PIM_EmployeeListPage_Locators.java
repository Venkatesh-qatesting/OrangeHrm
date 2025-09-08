package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_EmployeeListPage_Locators {

	@FindBy(xpath = "//span[.='Configuration ']")
	private WebElement configurationDropdown;

	@FindBy(linkText = "Employee List")
	private WebElement employeeListButton;

	@FindBy(linkText = "Add Employee")
	private WebElement addEmployeeButton;

	@FindBy(linkText = "Reports")
	private WebElement reportsButton;

	@FindBy(xpath = "//div[@class='oxd-table-filter']")
	private WebElement employeeInformationFilter;

	@FindBy(xpath = "//button[@class='oxd-icon-button' and@title='Help']")
	private WebElement helpButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-up-fill']")
	private WebElement closeEmployeeListFilter;

	@FindBy(xpath = "//label[.='Employee Name']/parent::div/following-sibling::div/descendant::input")
	private WebElement employeeNameFilterTextField;

	@FindBy(xpath = "//label[.='Employee Id']/parent::div/following-sibling::div/descendant::input")
	private WebElement employeeIdFilterTextBox;

	@FindBy(xpath = "//label[.='Supervisor Name']/parent::div/following-sibling::div/descendant::input")
	private WebElement supervisorFilterTextBox;

	@FindBy(xpath = "//label[.='Employment Status']/parent::div/following-sibling::div/descendant::i")
	private WebElement employmentStatusFilterDropdown;

	@FindBy(xpath = "//label[.='Include']/parent::div/following-sibling::div/descendant::i")
	private WebElement includeFilterDropdown;

	@FindBy(xpath = "//label[.='Job Title']/parent::div/following-sibling::div/descendant::i")
	private WebElement jobTitleFilterDropdown;

	@FindBy(xpath = "//label[.='Sub Unit']/parent::div/following-sibling::div/descendant::i")
	private WebElement subUnitFilterDropdown;

	@FindBy(xpath = "//button[.=' Reset ']")
	private WebElement resetFilterButton;

	@FindBy(xpath = "//button[.=' Search ']")
	private WebElement searchFilterButton;

	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addEmployeeGridButton;

	@FindBy(xpath = "//div[@row-decorator='oxd-table-decorator-card']")
	private WebElement employeeListTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editProfileFromTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement deleteProfileFromTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-sort-alpha-down oxd-icon-button__icon oxd-table-header-sort-icon']")
	private WebElement sortIdColumnInTable;

	@FindBy(xpath = "//div[text()='First (& Middle) Name']/child::div/child::i")
	private WebElement sortFirstNameColumnInTable;

	@FindBy(xpath = "//div[text()='Last Name']/child::div/child::i")
	private WebElement sortLastNameColumnInTable;

	@FindBy(xpath = "//div[text()='Job Title']/child::div/child::i")
	private WebElement sortJobTitleColumnInTable;

	@FindBy(xpath = "//div[text()='Employment Status']/child::div/child::i")
	private WebElement sortEmploymentStatusColumnInTable;

	@FindBy(xpath = "//div[text()='Sub Unit']/child::div/child::i")
	private WebElement sortSubUnitColumnInTable;

	@FindBy(xpath = "//div[text()='Supervisor']/child::div/child::i")
	private WebElement sortSupervisorColumnInTable;

	@FindBy(linkText = "Optional Fields")
	private WebElement optionalFieldsDropdownOption;

	@FindBy(linkText = "Custom Fields")
	private WebElement customFieldsDropdownOption;

	@FindBy(linkText = "Data Import")
	private WebElement dataImportDropdownOption;

	@FindBy(linkText = "Reporting Methods")
	private WebElement reportingMethodsDropdownOption;

	@FindBy(linkText = "Termination Reasons")
	private WebElement terminationReasonsDropdownOption;
	
	@FindBy(xpath = "//div[@class='oxd-table orangehrm-employee-list']")
	private WebElement listOfEmployees;
	
	public PIM_EmployeeListPage_Locators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfigurationDropdown() {
		return configurationDropdown;
	}

	public WebElement getEmployeeListButton() {
		return employeeListButton;
	}

	public WebElement getAddEmployeeButton() {
		return addEmployeeButton;
	}

	public WebElement getReportsButton() {
		return reportsButton;
	}

	public WebElement getEmployeeInformationFilter() {
		return employeeInformationFilter;
	}

	public WebElement getHelpButton() {
		return helpButton;
	}

	public WebElement getCloseEmployeeListFilter() {
		return closeEmployeeListFilter;
	}

	public WebElement getEmployeeNameFilterTextField() {
		return employeeNameFilterTextField;
	}

	public WebElement getEmployeeIdFilterTextBox() {
		return employeeIdFilterTextBox;
	}

	public WebElement getSupervisorFilterTextBox() {
		return supervisorFilterTextBox;
	}

	public WebElement getEmploymentStatusFilterDropdown() {
		return employmentStatusFilterDropdown;
	}

	public WebElement getIncludeFilterDropdown() {
		return includeFilterDropdown;
	}

	public WebElement getJobTitleFilterDropdown() {
		return jobTitleFilterDropdown;
	}

	public WebElement getSubUnitFilterDropdown() {
		return subUnitFilterDropdown;
	}

	public WebElement getResetFilterButton() {
		return resetFilterButton;
	}

	public WebElement getSearchFilterButton() {
		return searchFilterButton;
	}

	public WebElement getAddEmployeeGridButton() {
		return addEmployeeGridButton;
	}

	public WebElement getEmployeeListTable() {
		return employeeListTable;
	}

	public WebElement getEditProfileFromTable() {
		return editProfileFromTable;
	}

	public WebElement getDeleteProfileFromTable() {
		return deleteProfileFromTable;
	}

	public WebElement getSortIdColumnInTable() {
		return sortIdColumnInTable;
	}

	public WebElement getSortFirstNameColumnInTable() {
		return sortFirstNameColumnInTable;
	}

	public WebElement getSortLastNameColumnInTable() {
		return sortLastNameColumnInTable;
	}

	public WebElement getSortJobTitleColumnInTable() {
		return sortJobTitleColumnInTable;
	}

	public WebElement getSortEmploymentStatusColumnInTable() {
		return sortEmploymentStatusColumnInTable;
	}

	public WebElement getSortSubUnitColumnInTable() {
		return sortSubUnitColumnInTable;
	}

	public WebElement getSortSupervisorColumnInTable() {
		return sortSupervisorColumnInTable;
	}

	public WebElement getOptionalFieldsDropdownOption() {
		return optionalFieldsDropdownOption;
	}

	public WebElement getCustomFieldsDropdownOption() {
		return customFieldsDropdownOption;
	}

	public WebElement getDataImportDropdownOption() {
		return dataImportDropdownOption;
	}

	public WebElement getReportingMethodsDropdownOption() {
		return reportingMethodsDropdownOption;
	}

	public WebElement getTerminationReasonsDropdownOption() {
		return terminationReasonsDropdownOption;
	}

	public void searchEmployee(String empId) {
		getEmployeeIdFilterTextBox().sendKeys(empId);
		getSearchFilterButton().click();
	}
		
}
