package stepdefinition;

import Pages.FacultyList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.time.Duration;

public class CreateFaculty extends FacultyList{

    @When("navigate to create faculty page")
    public void navigate_to_create_faculty_page() {
        Click(d,faculty);
        Assert.assertTrue(display(d,fhead));
    }

    @When("click on create faculty button")
    public void click_on_create_faculty_button() {
        Click(d,create_faculty_btn);
    }

    @Then("pop up should appear with title {string}")
    public void pop_up_should_appear_with_title(String string) {
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertTrue(display(d,popup_title));
    }

    @When("enter faculty name as {string}")
    public void enter_faculty_name_as(String name) {
        SendKeys(d,facultyTitle,name);
    }

    @When("upload profile file as {string}")
    public void upload_profile_file_as(String file) {
        SendKeys(d,customFile,file);
    }

    @When("enter faculty contact as {string}")
    public void enter_faculty_contact_as(String number) {
        SendKeys(d,facultyContact,number);
    }

    @When("enter faculty email as {string}")
    public void enter_faculty_email_as(String email) {
        SendKeys(d,facultyEmail,email);
    }

    @When("select department as {string}")
    public void select_department_as(String department) {
        DropdownSelect(d,selectDept,department);
    }

    @When("select designation as {string}")
    public void select_designation_as(String designation) {
        DropdownSelect(d,selectDesign,designation);
    }

    @When("enter skillset as {string}")
    public void enter_skillset_as(String skills) {
        SendKeys(d,skillSet,skills);
    }

    @When("click on submit button")
    public void click_on_submit_button() {
        Click(d,submit_btn);
    }

    @Then("faculty should be created with name {string}")
    public void faculty_should_be_created_with_name(String name) {
        Assert.assertTrue(ElementStatus(d,table_items,name));
    }
}
