package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefination.BaseClass;

public class WaitHelper extends  BaseClass
{

	private WebDriver driver;

    public WaitHelper(WebDriver driver) {
        this.driver = driver;
    }

    // Add Explicit Wait 
    public void waitForElement(WebElement element, Duration timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
	
	
	
}
