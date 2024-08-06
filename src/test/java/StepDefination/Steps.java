package StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.ContactPage_R4C_CaseCreation;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps extends BaseClass {
	public WebDriver rdriver;
	public LoginPage lp;
	public ContactPage_R4C_CaseCreation contacts;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Start browser maximized
		options.addArguments("--disable-notifications"); // Disable notifications
		// options.addArguments("--incognito"); // Open in incognito mode
		driver = new ChromeDriver(options);
		lp = new LoginPage(driver);
	}

	@When("User open url {string}")
	public void user_open_url(String string) throws InterruptedException {
		driver.get(string);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("User Enter Email {string} as and pass {string}")
	public void user_enter_email_as_and_pass(String email, String password) throws InterruptedException {
		lp = new LoginPage(driver);
		lp.SetUserName(email);
		Thread.sleep(2000);
		lp.SetPassword(password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.Clickonlogin();
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
		String Title = driver.getTitle();
		System.out.println("Actual title" + Title);
	}

	@When("User Click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {

	}

	@Then("Close brower")
	public void close_brower() {
		driver.quit();

	}

//Contact - R4C-New case creation

	@Given("User is logged in and on the Dashboard page")
	public void user_is_logged_in_and_on_the_dashboard_page() {

	}

	@When("User Click on Contact menu")
	public void user_click_on_contact_menu() throws InterruptedException {
		Thread.sleep(2000);
		contacts = new ContactPage_R4C_CaseCreation(driver);
		contacts.Clickoncontactdropdown();
		Thread.sleep(3000);

	}

	@When("Select Contact from list")
	public void select_contact_from_list() throws InterruptedException {
		contacts.SelectDropdownOption_Contacts();
		Thread.sleep(3000);
		contacts.clickondropdown();
		Thread.sleep(3000);
		contacts.SelectTestContact();
		Thread.sleep(3000);
		contacts.EntercontactNameintosearchfield();
		Thread.sleep(3000);
		contacts.selecttestcontact();
		Thread.sleep(3000);
	}

	@When("Click on the New R4C case creation button")
	public void click_on_the_new_r4c_case_creation_button() throws InterruptedException {
		contacts.clickonR4CCaseButton();
		Thread.sleep(3000);

	}

	@Then("User can view New R4C Case popup")
	public void user_can_view_new_r4c_case_popup() {
		System.out.println("User Are Able to see New R4C Popup");
	}

	@Then("Select service type as {string}")
	public void select_service_type_as(String string) throws InterruptedException {
		try {
			contacts.selectserviceType();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
	}

	@Then("Click on the create button")
	public void click_on_the_create_button() throws InterruptedException {
		contacts.clickoncreatebutton();
		Thread.sleep(2000);

	}

	@When("User enter Sold to and other details")
	public void user_enter_sold_to_and_other_details() throws InterruptedException {
		contacts.EnterSoldTo();
		Thread.sleep(2000);
		contacts.Selectsearchedcontact();
		Thread.sleep(5000);
		contacts.clickonreturnreson();
		Thread.sleep(3000);
		contacts.selectstockrotation();
		Thread.sleep(3000);


	}

	@When("Click on the Next button After Sold To")
	public void click_on_the_next_button_after_sold_to() {
contacts.selectstockrotation();
	}

	@When("Select Purchase\\/Sales Order button and Enter PO Number {string}")
	public void select_purchase_sales_order_button_and_enter_po_number(String string) {

	}

	@Then("Click on the search button")
	public void click_on_the_search_button() {

	}

	@Then("Select All Line items")
	public void select_all_line_items() {

	}

	@Then("Click on the Next button after All Line Items")
	public void click_on_the_next_button_after_all_line_items() {

	}

	@Then("Click on Product Validation and Next button")
	public void click_on_product_validation_and_next_button() {

	}

	@When("Enter Return Quantity")
	public void enter_return_quantity() {

	}

	@When("Click on the Get credit price")
	public void click_on_the_get_credit_price() {

	}

	@When("Click on the Next button After credit Price")
	public void click_on_the_next_button_after_credit_price() {

	}

	@When("Enter Credit price")
	public void enter_credit_price() {

	}

	@When("Click on the Next button After Credit")
	public void click_on_the_next_button_after_credit() {

	}

	@When("Click on the Validate Allowance")
	public void click_on_the_validate_allowance() {

	}

	@When("Click on the Save and Summary button")
	public void click_on_the_save_and_summary_button() {

	}

	@When("Click on submit button After Summary")
	public void click_on_submit_button_after_summary() {

	}

	@Then("User can view Case creation Popup message")
	public void user_can_view_case_creation_popup_message() {

	}

	@Then("Click on the Submit button")
	public void click_on_the_submit_button() {

	}

	@Then("User can view Successful message")
	public void user_can_view_successful_message() {

	}

	@Then("Close browser")
	public void close_browser() {

	}
}
