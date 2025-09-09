package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMReportsPage {

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement reportNameFilterTextField;

	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement resetFilterButton;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement SearchFilterButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-up-fill']")
	private WebElement closeReportsFilterButton;

	@FindBy(xpath = "//button[.=' Add ']")
	private WebElement addReportsButton;

	@FindBy(xpath = "//div[@class='oxd-table']")
	private WebElement reportsTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	private WebElement deleteReportFromTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editReportFromTable;

	@FindBy(xpath = "//i[@class='oxd-icon bi-file-text-fill']")
	private WebElement viewReportFromTable;

	public PIMReportsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getReportNameFilterTextField() {
		return reportNameFilterTextField;
	}

	public WebElement getResetFilterButton() {
		return resetFilterButton;
	}

	public WebElement getSearchFilterButton() {
		return SearchFilterButton;
	}

	public WebElement getCloseReportsFilterButton() {
		return closeReportsFilterButton;
	}

	public WebElement getAddReportsButton() {
		return addReportsButton;
	}

	public WebElement getReportsTable() {
		return reportsTable;
	}

	public WebElement getDeleteReportFromTable() {
		return deleteReportFromTable;
	}

	public WebElement getEditReportFromTable() {
		return editReportFromTable;
	}

	public WebElement getViewReportFromTable() {
		return viewReportFromTable;
	}

}
