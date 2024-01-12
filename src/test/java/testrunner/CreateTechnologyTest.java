package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "C:\\Users\\rajin\\IdeaProjects\\Faculty\\src\\test\\resources\\features\\technologies.feature",
                glue = {"stepdefinition"}
        )
public class CreateTechnologyTest {}
