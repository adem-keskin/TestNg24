package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AllureToYouHomePage {
    public AllureToYouHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[text()='My Account'])[1]")
    public WebElement myAccountButton;

    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement registerButton;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement becomeAVendor;

    @FindBy(xpath = "//*[@class='w-icon-account']")
    public WebElement signInButton;









}
