package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class HomePageUS3 {

    //    Kullanici anasayfaya gider
    //    Kullanici sag ustteki MY ACCOUNT yazisina tiklar
    //    Kullanici MY ACCOUNT sayfasina gelir
    //    Kullanici My account sayfasinda ADRESSES yazisina tiklar
    //    Kullanici Adresses sayfasinda billing basligi altinda ADD secenegine tiklar
    //    Kullanici Billing Adres sayfasina gelir
    //    Kullanici Billing adres sayfasinda oldugunu dogrular
    //    Kullanici First Name alanina valid bir deger girer
    //    Kullanici Lastname alanina valid bir deger girer.
    //    Kullanici Country/Region alanina ulke ismi girer
    //    Kullanici Street adress alanina valid bir deger girer
    //    Kullanici TOWN/CITY alanina valid bir deger girer
    //    Kullanici STATE alaninda valid bir eyalet ismi secer
    //    Kullanici ZIP/POSTCODE alanina valid bir deger girer
    //    Kullanici PHONE alanina valid bir numara girer
    //    Kullanici kayit olunan EMAIL adresini otomatik olarak gorur
    //    Kullanici email adresini otomatik olarak gordugunu dogrular
    //    Kullanici sayfadaki SAVE ADRESS butonuna tiklar
    //    Kullanici Billing Adresine eklendigine dair mesaj alir
    //    kullanici aldigi bilgi mesajini dogrular


    //NEGATIVE SENARYO
//
//	Kullanici anasayfaya gider
//	Kullanici sag ustteki MY ACCOUNT yazisina tiklar
//	Kullanici MY ACCOUNT sayfasina gelir
//	Kullanici My account sayfasinda ADRESSESS yazisina tiklar
//	Kullanici Adresses sayfasinda billing basligi altinda ADD secenegine tiklar
//	Kullanici Billing Adres sayfasina gelir
//	Kullanici Billing adres sayfasinda oldugunu dogrular
//	Kullanici FirstName alanini bos birakir
//	Kullanici Lastname alanina valid bir deger girer.
//  Kullanici Country/Region alanina ulke ismi girer
//  Kullanici Street adress alanina valid bir deger girer
//  Kullanici TOWN/CITY alanina valid bir deger girer
//  Kullanici STATE alaninda valid bir eyalet ismi secer
//1 Kullanici ZIP/POSTCODE alanina valid bir deger girer
//1 Kullanici PHONE alanina valid bir numara girer
//1 Kullanici kayit olunan EMAIL adresini otomatik olarak gorur
//1 Kullanici sayfadaki SAVE ADRESS butonuna tiklar
//1 Kullanici bir uyari mesaji gorur
//1 Kullanici uyari mesajini dogrular

    //(AYNI SENARYO firstname,lastname ,streetadress,towncity ,postcode icin de gecerlidir )


    public HomePageUS3(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //LOGIN DATALARI
    @FindBy(xpath = "(//i[@class='w-icon-account'])[1]")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement email;
    @FindBy(xpath ="//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "(//button[@class='woocommerce-button button woocommerce-form-login__submit'])[1]")
    public WebElement signInButonu;

//    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
//     public WebElement logOut;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOut;

    @FindBy(xpath = "(//i[@class='w-icon-account'])[2]")
    public WebElement signout;


    //MY ACCOUNT DATALARI

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Addresses']")
    public WebElement adresses;

    @FindBy(xpath = "//a[@href='https://allure2you.com/my-account-2/edit-address/billing/']")
    public WebElement addButonu;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//select[@id='billing_country']")
    public WebElement country;//dropdown

    @FindBy(xpath = "//input[@id='billing_address_1']")
    public WebElement streetAddress;

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
    public WebElement streetAddressMessage;

    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement postCodeMessage;

    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement townCityMessage;

    @FindBy(xpath = "//ul[@role='alert']")
    public WebElement phoneMessage;









}

