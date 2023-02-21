package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;




    public class AllureAccountPage_a {
        public AllureAccountPage_a() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//h2[@class='page-title']")
        public WebElement myAccountText;

        @FindBy(css = ".icon-box-icon.icon-account")
        public WebElement accountDetailsButton;

        @FindBy(xpath = "//input[@id='username']")
        public WebElement usernameBox;

        @FindBy(xpath = "(//*[@name='password'])[1]")
        public WebElement passwordBox;

        @FindBy(xpath = "//button[@name='login']")
        public WebElement singInButton;

        @FindBy(xpath = "//input[@id='rememberme']")
        public WebElement rememberMeBox;

        @FindBy(xpath = "//*[@name='account_first_name']")
        public WebElement firstNameBox;

        @FindBy(xpath = "//*[@name='account_last_name']")
        public WebElement lastNameBox;

        @FindBy(xpath = "//*[@name='account_display_name']")
        public WebElement displayNameBox;

        @FindBy(id = "tinymce")
        public WebElement descriptionBox;

        @FindBy(xpath = "//*[@name='account_email']")
        public WebElement emailBox;

        @FindBy(xpath = "//input[@id='password_current']")
        public WebElement currentPasswordBox;

        @FindBy(xpath = "//input[@id='password_1']")
        public WebElement changePasswordButton;

        @FindBy(xpath = "//input[@id='password_2']")
        public WebElement confirmChangePasswordButton;

        @FindBy(xpath = "//button[@value='Save changes']")
        public WebElement saveChangesButton;

        @FindBy(css = "div[role='alert']")
        public WebElement alertBox;

        @FindBy(xpath = "//span[@class='icon-box-icon icon-orders']")
        public WebElement ordersButton;

        @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
        public WebElement goShopButton;




    }

