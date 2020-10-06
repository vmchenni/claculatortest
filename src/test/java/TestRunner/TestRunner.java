package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "ChromeDriver/Features",
        glue = {"stepDefinition"},
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"},
        tags = {"@Sanity"}
        )
public class TestRunner {

}
