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

        @FindBy(xpath = "//*[@id='confirm_pwd']")
        public WebElement vendorConfirmPassword;









}








