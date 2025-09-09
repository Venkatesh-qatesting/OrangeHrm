
package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMConfiguration_OptionalFieldsPage {

	@FindBy(xpath = "//div[@class='orangehrm-card-container']")
	private WebElement optionalFieldsPage;

	@FindBy(xpath = "//p[contains(. , 'Show Nick Name, Smoker')]/following-sibling::div/descendant::label/span")
	private WebElement showNickNameSmokerAndMilitaryServiceInPersonalDetailsCheckBox;

	@FindBy(xpath = "//p[contains(. , 'Show SSN field in Personal Details')]/following-sibling::div/descendant::label/span")
	private WebElement showSSNFieldInPersonalDetailsCheckBox;

	@FindBy(xpath = "//p[contains(. , 'Show SIN field in Personal Details')]/following-sibling::div/descendant::label/span")
	private WebElement showSINFieldInPersonalDetailsCheckBox;

	@FindBy(xpath = "//p[contains(. , 'Show US Tax Exemptions menu')]/following-sibling::div/descendant::label/span")
	private WebElement showUSTaxExemptionsMenuCheckBox;

	@FindBy(xpath = "//button[.=' Save ']")
	private WebElement saveButton;

	public PIMConfiguration_OptionalFieldsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOptionalFieldsPage() {
		return optionalFieldsPage;
	}

	public WebElement getShowNickNameSmokerAndMilitaryServiceInPersonalDetailsCheckBox() {
		return showNickNameSmokerAndMilitaryServiceInPersonalDetailsCheckBox;
	}

	public WebElement getShowSSNFieldInPersonalDetailsCheckBox() {
		return showSSNFieldInPersonalDetailsCheckBox;
	}

	public WebElement getShowSINFieldInPersonalDetailsCheckBox() {
		return showSINFieldInPersonalDetailsCheckBox;
	}

	public WebElement getShowUSTaxExemptionsMenuCheckBox() {
		return showUSTaxExemptionsMenuCheckBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
