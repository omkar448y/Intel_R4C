package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public void LoginpPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id=\"username\"]")
	WebElement textEmail;

	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement textPassword;

	@FindBy(xpath = "//input[@id=\"Login\"]")
	WebElement Clickonlogin;

	public void SetUserName(String Uname) {

		textEmail.sendKeys(Uname);

	}

	public void SetPassword(String Password) {

		textPassword.sendKeys(Password);

	}

	public void Clickonlogin() {
		Clickonlogin.click();
	}

}
