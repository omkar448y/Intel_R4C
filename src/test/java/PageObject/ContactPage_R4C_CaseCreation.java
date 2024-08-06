package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage_R4C_CaseCreation {
public WebDriver ldriver;
	public ContactPage_R4C_CaseCreation(WebDriver rdriver) {
		// Assign the passed WebDriver instance to the class variable
		ldriver = rdriver;
		// Initialize all PageFactory elements on this page using the WebDriver instance
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//button[@title=\"Show Navigation Menu\"]")
	WebElement clickoncontactdropdown ;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity'][normalize-space()='Contacts']")
	WebElement SelectContacts ;

	@FindBy(xpath="//span[@class='triggerLinkText selectedListView slds-page-header__title slds-truncate slds-p-right--xx-small lst-temp-slds-lineHeight uiOutputText']")
	WebElement clickViewDropdown;
	
	@FindBy(xpath = "//span[@class=' virtualAutocompleteOptionText'][normalize-space()='Recently Viewed Contacts']")
	WebElement SelectRecentViewcontact;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/force-list-view-manager-search-bar[1]/div[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]")
	WebElement EnterSearchcontact;
	
	@FindBy(xpath="//th[@class='slds-cell-edit cellContainer']")
	WebElement selecttextcontact;
	
	@FindBy(xpath="//button[normalize-space()='New R4C Case']")   // Click on the CreateR4CCase button
	WebElement ClickonNewR4CCaseButton;
	
	@FindBy(xpath="//span[contains(text(),'Stock Rotation')]")   // To Select service Type as a "Stock Rotation"
	WebElement clickonservicetype;
	
	@FindBy(xpath="//button[normalize-space()='Create']")        //To click on the create button
	WebElement clickoncreatebutton;
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[1]/div[1]/c-r4c_-a-g_-shipping-details[1]/lightning-layout[1]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/span[1]/c-r4c_-a-g_-reusable-lookup[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lightning-input[1]/lightning-primitive-input-simple[1]/div[1]/div[1]/input[1]")
	WebElement EnterSoldto;
	@FindBy(xpath="//span[contains(text(),'6006683685-ALSO Deutschland GmbH')]")    // To select searched contact
	WebElement Clickonsoldtocontacts;
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[1]/div[1]/c-r4c_-a-g_-shipping-details[1]/lightning-layout[6]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/lightning-combobox[1]/div[1]/div[1]/lightning-base-combobox[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement ClickonReturnreasondropdown;                                          // To click on the return reason Dropdown
	
	@FindBy(xpath="/html[1]/body[1]/div[4]/div[1]/section[1]/div[1]/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]/c-r4c_-a-g_-case-header[1]/div[2]/lightning-card[1]/article[1]/div[2]/slot[1]/div[1]/div[1]/c-r4c_-a-g_-shipping-details[1]/lightning-layout[6]/slot[1]/lightning-layout-item[1]/slot[1]/div[1]/lightning-combobox[1]/div[1]/div[1]/lightning-base-combobox[1]/div[1]/div[1]/div[2]/lightning-base-combobox-item[2]")
	WebElement selectStandardStockRotation;                                           // To select Stock Rotation from from dropdown
	
	@FindBy(xpath="//button[normalize-space()='Next']")
	WebElement  clickonnextaftersuldto;
	
	public void Clickoncontactdropdown() {
		clickoncontactdropdown.click();
		
	}
	public void SelectDropdownOption_Contacts() 
	{
		SelectContacts.click();
	}
	public void clickondropdown() 
	{
		clickViewDropdown.click();	
	}
	public void SelectTestContact() 
	{
		SelectRecentViewcontact.click();
	}
	public void EntercontactNameintosearchfield() 
	{
		EnterSearchcontact.sendKeys("Sarah");
		EnterSearchcontact.sendKeys(Keys.RETURN);
	}
	
	public void selecttestcontact() 
	{
		selecttextcontact.click();	
	}
	public void clickonR4CCaseButton()
	{
		ClickonNewR4CCaseButton.click();
	}
	public void selectserviceType()
	{
		clickonservicetype.click();
	}
	public void clickoncreatebutton()
	{
		clickoncreatebutton.click();
	}
	public void EnterSoldTo() {
		EnterSoldto.sendKeys("6006683685");
	}
	public void Selectsearchedcontact() 
	{
		Clickonsoldtocontacts.click();
	}
	public void clickonreturnreson() 
	{
		ClickonReturnreasondropdown.click();
	}
	public void selectstockrotation() 
	{
		selectStandardStockRotation.click();
		clickonnextaftersuldto.click();
		
	}
	
}
