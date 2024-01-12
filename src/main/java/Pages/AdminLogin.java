package Pages;

import Generic.Genric;
import org.openqa.selenium.By;

public class AdminLogin extends Genric {
    public By username = By.id("username");
    public By password = By.id("password");
    public By submit = By.xpath("//input[@value=\"Submit\"]");
    public By Login_error = By.xpath("//div[@class=\"alert alert-danger\"]");
    public By dashboard = By.xpath("//h1[text()=\"Dashboard\"]");
}
