package Pages;

import Generic.Genric;
import org.openqa.selenium.By;

public class FacultyList extends Genric {
    public By faculty = By.linkText("Create Faculty");
    public By fhead = By.xpath("//h1[text()=\"List of Faculty\"]");
    public By create_faculty_btn = By.xpath("//button[@class=\"btn btn-primary mr-4\"]");
    public By facultyTitle = By.id("FacultyTitle");
    public By customFile = By.id("customFile");
    public By facultyContact = By.id("FacultyContact");
    public By facultyEmail = By.id("FacultyEmail");
    public By selectDept = By.xpath("//select[@class=\"custom-select deptId\"]");
    public By selectDesign = By.xpath("//select[@class=\"custom-select design\"]");
    public By skillSet = By.xpath("//textarea[@name=\"skills\"]");
    public By submit_btn = By.xpath("//input[@type=\"submit\"]");
    public By reset_btn = By.xpath("//input[@type=\"reset\"]");
    public By title_err = By.id("FacultyTitle-error");
    public By file_err = By.id("customFile-error");
    public By cantact_err = By.id("FacultyContact-error");
    public By popup_title = By.xpath("//b[text()=\"Create Faculty\"]");
    public By table_items = By.xpath("//table/tbody/tr/td[2]");
}
