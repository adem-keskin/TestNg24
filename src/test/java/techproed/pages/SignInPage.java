package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='username']")
    public WebElement signInEmailTextBox;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement signInPassword;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement signInButton;


}
