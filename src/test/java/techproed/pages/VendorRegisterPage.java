package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class VendorRegisterPage {
        public VendorRegisterPage(){
                PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "//*[@class='page-title']")
        public WebElement vendorRegistrationTitle;

        @FindBy(id = "user_email")
        public WebElement vendorEmail;

        @FindBy(xpath = "//*[@id='passoword']")
        public WebElement vendorPassword;

        @FindBy(xpath = "//*[@class='wcfm-text wcfm_submit_button wcfm_email_verified_button']")
        public WebElement reSendCode;

        @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
        public WebElement verificationMessage;

        @FindBy(xpath = "(//input[@data-required='1'])[2]")
        public WebElement verificationCodeTextBox;

        @FindBy(xpath = "//*[@id='confirm_pwd']")
        public WebElement vendorConfirmPassword;

        @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
        public WebElement registerButton;

        @FindBy(xpath = "//*[@class='wcicon-status-completed']")
        public WebElement registrationSuccessfully;

        @FindBy(xpath = "//*[@class='wcfm-message wcfm-error']")
        public WebElement emailInvalid;

        @FindBy(xpath = "//*[@class='button button-large']")
        public WebElement notRightNowButton;

        @FindBy(xpath = "//*[@class='short']")
        public WebElement tooShortMessage;

        @FindBy(xpath = "//*[@class='weak']")
        public WebElement weakMessage;

        @FindBy(xpath = "//*[@class='good']")
        public WebElement goodMessage;

        @FindBy(xpath = "//*[@class='strong']")
        public WebElement strongMessage;




}














