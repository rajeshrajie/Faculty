package Pages;

import Generic.Genric;
import org.openqa.selenium.By;

public class Technologies extends Genric {
    public By tech = By.linkText("Technologies");
    public By thead = By.xpath("//h1[text()=\"Technologies\"]");
    public By tname = By.xpath("//input[@name=\"tech_name\"]");
    public By submit_btn = By.xpath("//input[@type=\"submit\"]");
    public By reset_btn = By.xpath("//input[@type=\"reset\"]");
    public By err_msg = By.id("tech_name-error");
    public By table_items = By.xpath("//table/tbody/tr/td[2]");
    public By table_search = By.xpath("//input[@type=\"search\"]");
}
