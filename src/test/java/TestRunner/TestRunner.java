package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"StepDefinitions_1"},
		//plugin = {"pretty", "json:target/json-report/cucumber.json"},
		//dryRun = true,
		monochrome = true
		//tags = "@S01"
		//name = {"Logo"}
		)
public class TestRunner  {

}


