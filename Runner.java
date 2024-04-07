package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		tags = "@regression",
		glue = "steps",
		monochrome = true,
		dryRun =true,
		plugin = {
				"pretty",
				"html:target/reports/cucmber.html",
				"json:target/reports/cucmber.json"
		}
		)
public class Runner {

}
