package stepdefinition;

import Pages.AdminLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginSteps extends AdminLogin {
    WebDriver d;

    @Given("browser is opened")
    public void browser_is_opened() throws IOException {
        d=launch();
    }

    @When("username is entered as {string} and password is entered as {string}")
    public void username_is_entered_as_and_password_is_entered_as(String uname, String pword) {
       SendKeys(d,username,uname);
       SendKeys(d,password,pword);
       Click(d,submit);
    }

    @Then("dashboard page should appear")
    public void dashboard_page_should_appear() {
        display(d,dashboard);
    }

    @Then("exit the application")
    public void exit_the_application(){
        closeallbrowsers();
    }

}
