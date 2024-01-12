package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\rajin\\IdeaProjects\\Faculty\\src\\test\\resources\\features\\Login.feature",
                glue = {"stepdefinition"}
        )
public class LoginTest {}
