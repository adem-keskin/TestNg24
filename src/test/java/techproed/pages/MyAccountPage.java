package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;




    public class MyAccountPage {
        public MyAccountPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//h2[@class='page-title']")
        public WebElement myAccountText;

        @FindBy(xpath = "//input[@id='username']")
        public WebElement usernameBox;

        @FindBy(xpath = "(//*[@name='password'])[1]")
        public WebElement passwordBox;

        @FindBy(xpath = "//button[@name='login']")
        public WebElement singInButton;

    }

