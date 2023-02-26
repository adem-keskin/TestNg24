package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePageUS12 {

        public HomePageUS12() {
            PageFactory.initElements(Driver.getDriver(), this);

        }

        //LOGIN DATALARI
        @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
        public WebElement signIn;
        @FindBy(xpath = "//input[@id='username']")
        public WebElement email;
        @FindBy(xpath = "//input[@id='password']")
        public WebElement password;
        @FindBy(xpath = "(//button[@class='woocommerce-button button woocommerce-form-login__submit'])[1]")
        public WebElement signInButonu;


        //MY ACCOUNT DATALARI

        @FindBy(xpath = "(//a[text()='My Account'])[1]")
        public WebElement myAccount;

        @FindBy(xpath = "//a[text()='Addresses']")
        public WebElement adresses;

        @FindBy(xpath = "//a[@href='https://allure2you.com/my-account-2/edit-address/billing/']")

        public WebElement addButonu;

        @FindBy(xpath = "//input[@id='billing_first_name']")
        public WebElement firstName;

        @FindBy(xpath ="//input[@id='billing_last_name']")
        public WebElement lastName;

        @FindBy(xpath ="//input[@name='billing_company']" )
        public  WebElement companyName;


        @FindBy(xpath = "//select[@id='billing_country']")
        public WebElement country;//dropdown

        @FindBy(xpath = "//input[@id='billing_address_1']")
        public WebElement streetAddress;

        @FindBy(xpath = "//input[@id='billing_address_2']")
        public WebElement apartment;

        @FindBy(xpath = "//input[@id='billing_city']")
        public WebElement townCity;

        @FindBy(xpath = "//select[@id='billing_state']")
        public WebElement state;//dropdown

        @FindBy(xpath = "//input[@id='billing_postcode']")
        public WebElement postCode;

        @FindBy(xpath = "//input[@id='billing_phone']")
        public WebElement phone;

        @FindBy(xpath = "//input[@id='billing_email']")
        public WebElement emailAddress;

        @FindBy(xpath = "//button[@class='btn btn-dark btn-rounded btn-sm']")
        public WebElement saveAddressButonu;


        //BILGI MESAJI LOCATER
        @FindBy(xpath = "//div[@role='alert']")
        public WebElement accountChangeMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement firstNameMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement lastNameMessage;


        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement countryMessage;


        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement streetAddressMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement postCodeMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement townCityMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement phoneMessage;

    }
