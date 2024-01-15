package stepdefinition;

import Pages.AdminLogin;
import io.cucumber.java.en.When;

public class validation extends AdminLogin {
    @When("username is entered as <string> and password is entered as <string>")
    public void username_is_entered_as_and_password_is_entered_as(String uname, String pword) {
        SendKeys(d,username,uname);
        SendKeys(d,password,pword);
        Click(d,submit);
    }
}
