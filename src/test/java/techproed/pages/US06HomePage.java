package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US06HomePage {


        public US06HomePage(){
            //PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate etmek icin kullanilir.
            //Sayfa objeleri cagrildiginda null pointer alinmaz.
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(xpath = "(//*[@class='form-control'])[1]")
        public WebElement searchbox;

        @FindBy (name = "add-to-cart")
        public WebElement addToCart;

        @FindBy (xpath = "(//i[@class='w-icon-cart'])[1]")
        public WebElement cartButton;

        @FindBy (xpath = "//*[text()='View cart']")
        public WebElement viewCardButton;

        @FindBy (xpath = "//*[text()='Checkout']")
        public WebElement checkoutButton;

        @FindBy(xpath = "(//*[text()='Shopping Cart'])[2]")
        public WebElement shoppingCart;

        @FindBy (xpath = "//*[@class='quantity-plus w-icon-plus']")
        public WebElement plusButton;

        @FindBy(xpath = "//*[text()='Update cart']")
        public WebElement updateCartButton;

        @FindBy (xpath = "//*[@class='checkout-button button alt wc-forward']")
        public WebElement proceedToCheckoutButton;

        @FindBy(xpath = "//*[@id='billing_first_name']" )
        public WebElement firstNameBox;

        @FindBy (xpath = "//*[text()='Payment Methods']")
        public WebElement paymentMethodsText;

        @FindBy(xpath = "//input[@id='billing_address_1']")
        public WebElement streetAddressBox;

        @FindBy(xpath = "//*[@id='billing_city']")
        public WebElement townCityBox;

        @FindBy(xpath = "//*[@id='place_order']")
        public WebElement placeOrderButton;

        @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
        public WebElement orderConfirmationText;


        //20

        @FindBy(xpath = "//span[text()='Sign In ']")
        public WebElement signInButton;

        @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[1]")
        public WebElement emailBox;

        @FindBy(xpath = "(//input[@class='woocommerce-Input woocommerce-Input--text input-text'])[2]")
        public WebElement passwordBox;


        @FindBy(xpath = "//button[@class='woocommerce-button button woocommerce-form-login__submit']")
        public WebElement girisBolumundekSignInButton;

        @FindBy(xpath = "//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1074']")
        public WebElement myAccountButton;

        @FindBy(xpath = "//h2[@class='page-title']")
        public WebElement myAccountBasligi;


        @FindBy(xpath = "//a[text()='Store Manager']")
        public WebElement storeManagerButton;

        @FindBy(xpath = "(//span[@class='text'])[6]")
        public WebElement couponsButton;

        @FindBy(xpath = "//*[@id='coupon_amount']")
        public WebElement cuponAmount;

        @FindBy(xpath = "//h2[text()='Coupons Listing']")
        public WebElement couponsListingYazisi;

        @FindBy(xpath = "//span[text()='Add New']")
        public WebElement addNewButton;

        @FindBy(xpath = "//*[@class='wcfm_sub_menu_items wcfm_sub_menu_items_coupon_manage moz_class']")
        public WebElement digeraddNewButton;

        @FindBy(xpath = "//input[@id='title']")
        public WebElement codeBox;


        @FindBy(xpath = "//h4[text()='Payment Methods']")
        public WebElement paymentMethodtext;

        @FindBy(xpath = "//input[@id='payment_method_cod']")
        public WebElement payAtTheDoorButton;

//    @FindBy(xpath = "//*[@class='wcfm-textarea wcfm_ele']")
//    public WebElement descriptionBox;

        @FindBy(xpath = "//input[@id='expiry_date']")
        public WebElement couponExpiryDateBox;


        @FindBy(xpath = "(//input[@class='wcfm-checkbox wcfm_ele'])[1]")
        public WebElement allowFreeShippingButton;



        @FindBy(xpath = "//input[@id='show_on_store']")
        public WebElement showOnStoreBox;

        //US21
        @FindBy(xpath = "(//*[@class='site-logo skip-data-lazy attachment-full size-full'])[1]")
        public WebElement spendingGoodYazisi;//ilk sayfada oldugumuzu gostersin diye bir locate aldim

        @FindBy(xpath = "//h1[@class='product_title entry-title']")
        public WebElement pinkSweatshirtUrunu;//urun sayfasinda oldugumuzu gostermek icin yazdik

        @FindBy(xpath = "//th[@class='product-thumbnail']")
        public WebElement productYazsisi;//yeni sayfaya gectigimizi gostermek icin yazildi.



        @FindBy(xpath = "//input[@id='coupon_code']")
        public WebElement couponTextBox;


        @FindBy(xpath = "//button[@class='btn btn-rounded btn-border-thin btn-outline btn-dark button']")
        public WebElement applyCouponButton;

        @FindBy(xpath = "//h3[text()='Billing details']")
        public WebElement billingDetailsYazisi;//proceedcheckout dedikten sonra yeni sayfaya gectigimizi gosterebilmek icin yazilan locate.

        @FindBy(xpath = "//*[text()='Thank you. Your order has been received.']")
        public WebElement thankYouText;

        @FindBy(xpath = "//*[@id='select2-billing_country-container']")
        public WebElement ulkeDegistirme;



    }


