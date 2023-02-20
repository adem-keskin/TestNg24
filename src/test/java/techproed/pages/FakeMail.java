package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class FakeMail {

    public FakeMail(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//*[@class='color cetc']")
    public WebElement copyButton;

    @FindBy(xpath = "//*[@class='animace']")
    public WebElement fakeMailAddresses;







}
