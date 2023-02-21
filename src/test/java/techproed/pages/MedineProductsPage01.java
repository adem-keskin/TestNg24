package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MedineProductsPage01 {

    public MedineProductsPage01() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[normalize-space()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "(//div[@class='login-popup'])[1]")
    public WebElement signInPage;

    @FindBy(id = "username")
    public WebElement signInUsername;

    @FindBy(id = "password")
    public WebElement signInPassword;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement myAccountText;

    @FindBy(xpath = "//p[@class='greeting mb-0']")
    public WebElement helloText;


}

