package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features=".//Features/login.feature",
		         glue="stepDefination",
		         dryRun=false,
		         monochrome=true,
		         tags= "@sanity",
		         plugin= {"pretty","html:testOutput"}
		
		        )




public class TestRunner {

}
