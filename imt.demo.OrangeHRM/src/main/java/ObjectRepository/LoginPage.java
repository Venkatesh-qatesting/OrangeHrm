package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement usernameTextField;
	
	@FindBy(name = "password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//button[. =' Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//p[. ='Forgot your password? ']")
	private WebElement forgotPasswordLink;
	
	@FindBy(linkText = "OrangeHRM, Inc")
	private WebElement orangeHrmLink;
	
	@FindBy(xpath = "//p[.='Invalid credentials']")
	private WebElement errorMessage;
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getOrangeHrmLink() {
		return orangeHrmLink;
	}
	
	public void loginPage(String username, String password) {
		getUsernameTextField().sendKeys(username);
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
}
