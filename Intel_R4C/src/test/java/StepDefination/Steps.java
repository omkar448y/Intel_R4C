package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseClass 
{
    private LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	   ChromeOptions option=new ChromeOptions();
	   option.addArguments("--disable-notification");
	   driver=new ChromeDriver(option);
	   
	}
	@When("User open url {string}")
	public void user_open_url(String string) throws InterruptedException {
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(2000);

	}
	@When("User Enter Email {string} as and pass {string}")
	public void user_enter_email_as_and_pass(String string, String string2) throws InterruptedException {
	    Thread.sleep(5000);
		
	}
//	@When("User Enter Email {string} as and pass {string}")
//	public void user_enter_email_as_and_pass(String Uname, String Password) throws InterruptedException {
//	    lp.SetUserName(Uname);
//	    Thread.sleep(2000);
//		lp.SetPassword(Password);
		
	//}
	@When("Click on login")
	public void click_on_login() {
	    
		lp.Clickonlogin();
	}
	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	    
	}
	@When("User Click on logout link")
	public void user_click_on_logout_link() {
	    
	}
	@Then("Close brower")
	public void close_brower() {
	    
	}
}
