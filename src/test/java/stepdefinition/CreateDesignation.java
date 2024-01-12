package stepdefinition;

import Pages.Designations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateDesignation extends Designations {
    @When("navigate to designations page")
    public void navigate_to_designations_page() {
        Click(d,design_pg);
        Assert.assertTrue(display(d,design));
    }

    @When("department is selected as {string}")
    public void department_is_selected_as(String dept) {
        DropdownSelect(d,select_drpdwn,dept);
    }

    @When("designation is entered as {string}")
    public void designation_is_entered_as(String name) {
        SendKeys(d,design_name,name);
        Click(d,submit_btn);
    }

    @Then("new designation should be created in designations table as {string}")
    public void new_designation_should_be_created_in_designations_table_as(String name) {
        Assert.assertTrue(ElementStatus(d,tabel_items,name));
    }
}
