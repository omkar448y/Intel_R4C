package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	public WebDriver driver;
	private WebDriver rdriver;

	public LoginPage(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement textEmail;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement textPassword;

	@FindBy(xpath = "//input[@id=\"Login\"]")
	WebElement Clickonlogin;

	public void SetUserName(String uname) {
		textEmail.sendKeys(uname);
	}

	public void SetPassword(String Password) {
		textPassword.sendKeys(Password);
	}

	public void Clickonlogin() {
		Clickonlogin.click();
	}


}
