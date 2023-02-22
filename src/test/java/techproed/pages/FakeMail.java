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

    @FindBy(xpath = "//*[@class='hidden-xs hidden-sm klikaciRadek newMail'][1]")
    public WebElement fakeMailNewMail;

    @FindBy(xpath = "(//p[@style='margin: 0 0 16px;'])[2]")
    private static WebElement verificationCodeInEmail;


    public static String setVerificationCode() {
        String[] emailCode = verificationCodeInEmail.getText().split(" ");
        String verification = emailCode[7];
        return verification;

    }

}
