package stepdefinition;

import Pages.Departments;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateDepartment extends Departments {

    @When("navigate to departments page")
    public void navigate_to_departments_page() {
        Click(d,dept);
    }

    @Then("page title should be {string}")
    public void page_title_should_be(String string) {
        display(d,dhead);
    }

    @When("department name is entered as {string} ans click on submit")
    public void department_name_is_entered_as_ans_click_on_submit(String name) {
        SendKeys(d,dname,name);
        Click(d,submit_btn);
    }

    @Then("new department should be created in departments table as {string}")
    public void new_department_should_be_created_in_departments_table_as(String name) {
        Assert.assertTrue(ElementStatus(d,tabel_items,name));
    }
}
