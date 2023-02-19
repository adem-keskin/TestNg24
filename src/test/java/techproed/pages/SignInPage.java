package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "PageFactory.initElements(Driver.getDriver(),this);")
    public WebElement signInEmailTextBox;



}
