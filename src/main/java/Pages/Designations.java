package Pages;

import Generic.Genric;
import org.openqa.selenium.By;

public class Designations extends Genric {
    public By design_pg = By.linkText("Designations");
    public By design = By.xpath("//h1[text()=\"Designations\"]");
    public By select_drpdwn = By.xpath("(//select[@class='form-control select2'and@name='dept_name'])[1]");
    public By design_name = By.xpath("//input[@placeholder=\"Enter Designation Name\"]");
    public By submit_btn = By.xpath("//input[@type=\"submit\"]");
    public By reset_btn = By.xpath("//input[@type=\"reset\"]");
    public By tabel_items = By.xpath("//table/tbody/tr/td[3]");
    public By err_msg_dept = By.xpath("//span[@id='dept_name-error']");
    public By err_msg_design = By.xpath("//span[@id=\"degn_name-error\"]");
    public By table_search = By.xpath("//input[@type=\"search\"]");
}
