package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePageUS13 {


        public HomePageUS13() {
            PageFactory.initElements(Driver.getDriver(), this);

        }
        //---------------------------------US04--------------------------------

// Kullanici anasayfaya gider
//  Kullanici sag ustteki MY ACCOUNT yazisina tiklar
// Kullanici MY ACCOUNT sayfasina gelir
// Kullanici My account sayfasinda ADRESSES yazisina tiklar
// Kullanici Adresses sayfasinda Shipping basligi altinda ADD butonuna tiklar
// Kullanici Shipping Adres sayfasina gelir
// Kullanici Shipping adres sayfasinda oldugunu dogrular
// Kullanici First Name alanina valid bir deger girer
// Kullanici Lastname alanina valid bir deger girer.
// Kullanici Country/Region alanina ulke ismi girer
// Kullanici Street adress alanina valid bir deger girer
// Kullanici TOWN/CITY alanina valid bir deger girer
// Kullanici STATE alaninda valid bir eyalet ismi secer
// Kullanici ZIP/POSTCODE alanina valid bir deger girer
// Kullanici sayfadaki SAVE ADRESS butonuna tiklar
// Kullanici Shipping Adresine eklendigine dair mesaj alir
// kullanici bilgi mesajini dogrular

        //LOGIN DATALARI

        @FindBy(xpath = "//input[@id='reg_username']")
        public WebElement userName;

        @FindBy(xpath = "//input[@id='reg_email']")
        public WebElement email;

        @FindBy(xpath ="//input[@id='reg_password']")
        public WebElement password;

        @FindBy(xpath = "//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
        public WebElement signUpButonu;


        //MY ACCOUNT DATALARI
        @FindBy(xpath = "(//a[text()='My Account'])[1]")
        public WebElement myAccount;

        @FindBy(xpath = "//a[text()='Addresses']")
        public WebElement adresses;

        @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[2]")
        public WebElement addButonu;



        @FindBy(xpath = "//input[@id='shipping_first_name']")
        public WebElement firstName;

        @FindBy(xpath = "//input[@id='shipping_last_name']")
        public WebElement lastName;


        @FindBy(xpath ="//input[@name='shipping_company']" )
        public  WebElement companyName;

        @FindBy(xpath = "//select[@id='shipping_country']")
        public WebElement country;//dropdown

        @FindBy(xpath = "//input[@id='shipping_address_1']")
        public WebElement streetAddress;

        @FindBy(xpath = "//input[@id='shipping_address_2']")
        public WebElement apartment;

        @FindBy(xpath = "//input[@id='shipping_city']")
        public WebElement townCity;

        @FindBy(xpath = "//select[@id='shipping_state']")
        public WebElement state;//dropdown

        @FindBy(xpath = "//input[@id='shipping_postcode']")
        public WebElement postCode;

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
        public WebElement streetAddressMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement postCodeMessage;

        @FindBy(xpath = "//ul[@role='alert']")
        public WebElement townCityMessage;

    }


