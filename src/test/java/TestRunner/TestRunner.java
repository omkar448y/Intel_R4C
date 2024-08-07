package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

	@CucumberOptions(features = "C:\\Users\\oyadavx\\git\\repository3\\Intel_ISVC_R4C\\src\\test\\java\\Features\\LoginPage.feature",

			glue = "StepDefination",
			dryRun=false, monochrome = true, 
			plugin = {"pretty", "html:target/cucumber-reports.html", "junit:target/cucumber.xml"} )
			public class CucumberTest extends AbstractTestNGCucumberTests {

			} 
}
