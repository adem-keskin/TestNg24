package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


import java.nio.file.WatchEvent;






    public class AllureAccountPage {
        public AllureAccountPage() {

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


        @FindBy(xpath = "//*[@id='menu-item-1074']")
        public WebElement myAccountText2;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-orders']")
        public WebElement ordersLogo;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-downloads']")
        public WebElement downloadsLogo;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-addresses']")
        public WebElement addressesLogo;

//      @FindBy(xpath = "//*[@class='icon-box-icon icon-account']")
        public WebElement accountDetailsLogo;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-wishlist']")
        public WebElement wishlistLogo;

        @FindBy(xpath = "//*[@class='icon-box-icon icon-logout']")
        public WebElement logoutLogo;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wcfm-store-manager']")
        public WebElement storeManager;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']")
        public WebElement orders;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--downloads']")
        public WebElement downloads;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-address']")
        public WebElement addresses;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--edit-account']")
        public WebElement accountDetails;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--wishlist']")
        public WebElement wishlist;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--support-tickets']")
        public WebElement supportTickets;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--followings']")
        public WebElement followings;

        @FindBy(xpath = "//*[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--customer-logout']")
        public WebElement logout;


        @FindBy(xpath = "//span[@class='icon-box-icon icon-orders']")
        public WebElement ordersButton;

        @FindBy(xpath = "//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
        public WebElement goShopButton;

        @FindBy(xpath ="//div[@class='product-loop product-default content-center product type-product post-14638 status-publish onbackorder product_cat-phone has-post-thumbnail sale shipping-taxable purchasable product-type-simple']//img[2]")
        public WebElement product_select;

        @FindBy(xpath = "//button[@name='add-to-cart']")
        public WebElement addToCart;

        @FindBy(xpath = "//span[@class='icon-box-icon icon-addresses']")
        public WebElement addressesIcon;









    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOut;

    @FindBy(linkText = "Log out")
    public WebElement logOut;


    @FindBy(xpath = "//a[@class='cart-toggle']//i[@class='w-icon-cart']")
    public WebElement addToCartBox;


    @FindBy(xpath = "//a[normalize-space()='Edit Your Billing Address']")
    public WebElement adressEditing;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveAdress;

    @FindBy(xpath = "//a[@class='woocommerce-button btn btn-default btn-rounded btn-outline btn-sm btn-block view']")
    public WebElement viewButton;

    @FindBy(xpath = "//h2[@class='woocommerce-order-details__title']")
    public WebElement orderDetailText;

    @FindBy(xpath = "//a[@class='button checkout wc-forward']")
    public WebElement checkOutBox;

    @FindBy(xpath = "//input[@id='payment_method_cod']")
    public WebElement payAtTheDoor;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//a[@class='showcoupon']")
    public WebElement enterYourCodeOption;

    @FindBy(xpath = "//input[@name='coupon_code']")
    public WebElement couponCodeBox;

    @FindBy(xpath = "//i[@class='fas fa-check']")
    public WebElement shoppingEndeText;

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;


}



