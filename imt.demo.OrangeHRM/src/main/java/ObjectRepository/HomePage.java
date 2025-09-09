package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement logoutProfile;

	@FindBy(linkText = "Logout")
	private WebElement logoutButton;

	@FindBy(xpath = "//span[.='Admin']")
	private WebElement adminMenu;

	@FindBy(xpath = "//span[.='PIM']")
	private WebElement pimMenu;

	@FindBy(xpath = "//span[.='Leave']")
	private WebElement leaveMenu;

	@FindBy(xpath = "//span[.='Time']")
	private WebElement timeMenu;

	@FindBy(xpath = "//span[.='Recruitment']")
	private WebElement recruitmentMenu;

	@FindBy(xpath = "//span[.='My Info']")
	private WebElement myInfoMenu;

	@FindBy(xpath = "//span[.='Performance']")
	private WebElement performanceMenu;

	@FindBy(xpath = "//span[.='Dashboard']")
	private WebElement dashboardMenu;

	@FindBy(xpath = "//span[.='Directory']")
	private WebElement directoryMenu;

	@FindBy(xpath = "//span[.='Maintenance']")
	private WebElement maintenanceMenu;

	@FindBy(xpath = "//span[.='Claim']")
	private WebElement claimMenu;

	@FindBy(xpath = "//span[.='Buzz']")
	private WebElement buzzMenu;

	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement closeOpenMenuButton;

	@FindBy(xpath = "//button[.=' Upgrade']")
	private WebElement upgradeButton;

	@FindBy(xpath = "//button[@class='oxd-icon-button']")
	private WebElement helpButton;

	@FindBy(linkText = "OrangeHRM, Inc")
	private WebElement orangeHrmLink;
	
	@FindBy(xpath = "//p[.='Time at Work']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement timeAtWorkWidget;
	
	@FindBy(xpath = "//p[.='My Actions']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement actionWidget;
	
	@FindBy(xpath = "//p[.='Quick Launch']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement quickLaunchWidget;

	@FindBy(xpath = "//p[.='Buzz Latest Posts']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement buzzLatestPostsWidget;

	@FindBy(xpath = "//p[.='Employees on Leave Today']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement employeesOnLeaveTodayWidget;

	@FindBy(xpath = "//p[.='Employee Distribution by Sub Unit']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement employeeDistributionBySubUnitWidget;
	
	@FindBy(xpath = "//p[.='Employee Distribution by Location']/ancestor::div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")
	private WebElement employeeDistributionByLocationWidget;
	
	
	public WebElement getOrangeHrmLink() {
		return orangeHrmLink;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutProfile() {
		return logoutProfile;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getAdminMenu() {
		return adminMenu;
	}

	public WebElement getPimMenu() {
		return pimMenu;
	}

	public WebElement getLeaveMenu() {
		return leaveMenu;
	}

	public WebElement getTimeMenu() {
		return timeMenu;
	}

	public WebElement getRecruitmentMenu() {
		return recruitmentMenu;
	}

	public WebElement getMyInfoMenu() {
		return myInfoMenu;
	}

	public WebElement getPerformanceMenu() {
		return performanceMenu;
	}

	public WebElement getDashboardMenu() {
		return dashboardMenu;
	}

	public WebElement getDirectoryMenu() {
		return directoryMenu;
	}

	public WebElement getMaintenanceMenu() {
		return maintenanceMenu;
	}

	public WebElement getClaimMenu() {
		return claimMenu;
	}

	public WebElement getBuzzMenu() {
		return buzzMenu;
	}

	public WebElement getCloseOpenMenuButton() {
		return closeOpenMenuButton;
	}

	public WebElement getUpgradeButton() {
		return upgradeButton;
	}

	public WebElement getHelpButton() {
		return helpButton;
	}

	public void logout() {
		getLogoutProfile().click();
		getLogoutButton().click();
	}
}
