package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = "C:\\Users\\oyadavx\\eclipse-workspace\\Intel_ISVC_R4C\\src\\test\\java\\Features\\ContactPage.feature",

			glue = "StepDefination",
			dryRun=false, monochrome = true, 
			plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml"} )
			public class CucumberTest extends AbstractTestNGCucumberTests {

			} 
}
