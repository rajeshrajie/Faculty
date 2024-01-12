package Pages;

import Generic.Genric;
import org.openqa.selenium.By;

public class Departments extends Genric {
    public By dept = By.linkText("Departments");
    public By dhead = By.xpath("//h1[text()=\"Departments\"]");
    public By dname = By.xpath("//*[@id=\"quickFormdept\"]/div[1]/div/input");
    public By submit_btn = By.xpath("//input[@type=\"submit\"]");
    public By reset_btn = By.xpath("//input[@type=\"reset\"]");
    public By err_msg = By.id("dept_name-error");
    public By tabel_items = By.xpath("//tbody/tr/td[2]");
    public By table_search = By.xpath("//input[@type=\"search\"]");
}
