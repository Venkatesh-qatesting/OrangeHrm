package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMReports_ViewReportPage {
	
	@FindBy(xpath = "//div[@class='orangehrm-paper-container']")
	private WebElement employeeListTable;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-arrows-fullscreen oxd-icon-button__icon --toggable-icon']")
	private WebElement maximizeEmployeeListTable;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-fullscreen-exit oxd-icon-button__icon --toggable-icon']")
	private WebElement minimizeEmployeeListTable;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-text--count']")
	private WebElement noOfRecordsInEmployeeListTable;
	
	@FindBy(xpath = "//button[@class='oxd-pagination-page-item oxd-pagination-page-item--page']")
	private WebElement pageNumber;
	
	@FindBy(xpath = "//button[@class='oxd-pagination-page-item oxd-pagination-page-item--previous-next']//i[@class='oxd-icon bi-chevron-right']")
	private WebElement goToNextPageButton;
	
	@FindBy(xpath = "//button[@class='oxd-pagination-page-item oxd-pagination-page-item--previous-next']//i[@class='oxd-icon bi-chevron-left']")
	private WebElement goToPreviousPage;
	
	public PIMReports_ViewReportPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmployeeListTable() {
		return employeeListTable;
	}

	public WebElement getMaximizeEmployeeListTable() {
		return maximizeEmployeeListTable;
	}

	public WebElement getMinimizeEmployeeListTable() {
		return minimizeEmployeeListTable;
	}

	public WebElement getNoOfRecordsInEmployeeListTable() {
		return noOfRecordsInEmployeeListTable;
	}

	public WebElement getPageNumber() {
		return pageNumber;
	}

	public WebElement getGoToNextPageButton() {
		return goToNextPageButton;
	}

	public WebElement getGoToPreviousPage() {
		return goToPreviousPage;
	}
	
	
}
