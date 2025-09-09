package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMAddEmployee_ContactDetailsPage {
	@FindBy(xpath = "//label[.='Street 1']/parent::div/following-sibling::div//input")
	private WebElement street1Textfield;
	
	@FindBy(xpath = "//label[.='Street 2']/parent::div/following-sibling::div//input")
	private WebElement street2textfield;
	
	@FindBy(xpath = "//label[.='City']/parent::div/following-sibling::div//input")
	private WebElement cityTextfield;
	
	@FindBy(xpath = "//label[.='State/Province']/parent::div/following-sibling::div//input")
	private WebElement stateTextfield;
	
	@FindBy(xpath = "//label[.='Zip/Postal Code']/parent::div/following-sibling::div//input")
	private WebElement postalCodetEXTFIELD;
	
	@FindBy(xpath = "//label[.='Country']/parent::div/following-sibling::div//div[text()='-- Select --']")
	private WebElement countryDropdown; 
	
	@FindBy(xpath = "//label[.='Home']/parent::div/following-sibling::div//input")
	private WebElement homeContactNumberTextField; 
	
	@FindBy(xpath = "//label[.='Mobile']/parent::div/following-sibling::div//input")
	private WebElement mobileNumebrtextfield;
	
	@FindBy(xpath = "//label[.='Work']/parent::div/following-sibling::div//input")
	private WebElement workContactNumber;
	
	@FindBy(xpath = "//label[.='Work Email']/parent::div/following-sibling::div//input")
	private WebElement workEmailIdTextfield;
	
	@FindBy(xpath = "//label[.='Other Email']/parent::div/following-sibling::div//input")
	private WebElement otherEmailIdTextfield;
	
	@FindBy(xpath = "//p[.=' * Required']/following-sibling::button")
	private WebElement contactDetailsSaveButton;
	
	
}
