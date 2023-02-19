package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class VendorRegisterPage {
        public VendorRegisterPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "user_email")
        public WebElement vendorEmail;









}








