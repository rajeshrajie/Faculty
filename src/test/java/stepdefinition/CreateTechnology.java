package stepdefinition;

import Pages.Technologies;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateTechnology extends Technologies {
    @When("navigate to technologies page")
    public void navigate_to_technologies_page() {
        Click(d,tech);
        Assert.assertTrue(display(d,thead));
    }

    @When("technology name is entered as {string} and click on submit")
    public void technology_name_is_entered_as_and_click_on_submit(String name) {
        SendKeys(d,tname,name);
        Click(d,submit_btn);
    }

    @Then("new technology should be created in departments table as {string}")
    public void new_technology_should_be_created_in_departments_table_as(String name) {
        Assert.assertTrue(ElementStatus(d,table_items,name));
    }
}
