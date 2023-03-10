package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MedineStoreManagerPage01 {

    public MedineStoreManagerPage01() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='https://allure2you.com/store-manager/']")
    public WebElement storeManagerButton;

    @FindBy(xpath = "//h2[@class='page-title']")
    public WebElement storeManagerText;

    @FindBy(xpath = "//span[normalize-space()='Products']")
    public WebElement productsButton;

    @FindBy(xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement productsText;

    @FindBy(id = "add_new_product_dashboard")
    public WebElement addNewProductDashboardButton;

    @FindBy(xpath = "//h2[normalize-space()='Add Product']")
    public WebElement addProductText;

    // ADDNEW PRODUCT

    @FindBy(id = "product_type") // //select[@id='product_type']
    public WebElement productType;

    @FindBy(xpath = "//option[@value='simple']")
    public WebElement simple;

    @FindBy(xpath = "//option[@value='variable']")
    public WebElement variable;

    @FindBy(xpath = "//option[@value='external']")
    public WebElement external;

    @FindBy(xpath = "//input [@id='is_virtual']")
    public WebElement virtualCheckbox;

    @FindBy(xpath = "//input [@id='is_downloadable']")
    public WebElement downloadableCheckbox;

    @FindBy(xpath = "//input[@id='regular_price']")
    public WebElement regularPriceTextBox;

    @FindBy(xpath = "//input[@id='sale_price']")
    public WebElement salePriceTextBox;

    // ADD IMAGES - CATEGORIES - SUBMIT

    @FindBy (xpath = "//li[@aria-label='Kitap']//div[@class='thumbnail']")
    public WebElement pratikDusunmeImage;

    @FindBy (xpath = "//li[@aria-label='stifte'][1]")
    public WebElement kalemImage;

    @FindBy (xpath = "(//li[@data-id='15287'])[2]")
    public WebElement keysImage;

    @FindBy (xpath = "//input[@value='232']")
    public WebElement categorieBookMedien;

    @FindBy (xpath = "//div[contains(text(),'Product Successfully Published.')]" )  /* //div[@class='wcfm-message'] //span[@class='wcicon-status-completed'] //div[contains(text(),'Product Successfully Published.')] */
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addGalleryButton;

    @FindBy (xpath = "//input[@id='wcfm_products_simple_submit_button']")
    public WebElement submitButton;

    @FindBy(xpath = "//main[@id='main']")
    public WebElement mainPage;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOut;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logOut;


    // PRODUCT LISTELEME
    @FindBy (xpath = "(//a[@class='wcfm_product_title'])[1]")
    public WebElement pratikDusunme2ListName;

    @FindBy (xpath = "(//img[@class='attachment-thumbnail size-thumbnail'])[1]") //(//img[@src='https://allure2you.com/wp-content/uploads/2023/02/cozum-odakli-terapinin-amaci-nedir-150x150.jpg'])[3]
    public WebElement pratikDusunme2ListImage; //(//img[@class='attachment-thumbnail size-thumbnail'])[1] //(//img[@src='https://allure2you.com/wp-content/uploads/2023/02/cozum-odakli-terapinin-amaci-nedir-150x150.jpg'])[3]

    // US18-EXTERNAL

    @FindBy (xpath = "//input[@id='product_url']")
    public WebElement urlTextBox;

    @FindBy (xpath = "//input[@id='button_text']")
    public WebElement buttonTextBox;

    @FindBy (xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributeButton;

    @FindBy (xpath = "(//img[@class='attachment-thumbnail size-thumbnail'])[13]")
    public WebElement listeUrunResmi;

    @FindBy (xpath = "//img[@id='featured_img_display']")
    public WebElement listeUrunBuyukResmi;

    @FindBy (xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorTick;

     @FindBy (xpath = "(//span[@title='Toggle Block'])[2]")
    public WebElement colorToggBlock;


    @FindBy (xpath = "(//ul[@class='select2-selection__rendered'])[2]")
    public WebElement colorTextBoxWrite;

    @FindBy (xpath = "//input[@id='attributes_is_visible_1']")
    public WebElement colorVisibleTick;

    @FindBy (xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[1]")
    public WebElement addNewAttributeButtonColor;

    @FindBy (xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizeTick;

    @FindBy (xpath = "(//span[@title='Toggle Block'])[3]")
    public WebElement sizeToggBlock;

    @FindBy (xpath = "(//ul[@class='select2-selection__rendered'])[3]")
    public WebElement sizeTextBoxWrite;

    @FindBy (xpath = "//input[@id='attributes_is_visible_2']")
    public WebElement sizeVisibleTick;

    @FindBy (xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    public WebElement addNewAttributeButtonSize;

    @FindBy (xpath = "//input[@value='View']")
    public WebElement viewButton;

    @FindBy (xpath = "(//div[@class='page_collapsible_content_holder'])[6]")
    public WebElement variationsButton;

    @FindBy (xpath = "//select[@name='default_attributes[attribute_pa_color]']")
    public WebElement variationsColorDropDown;

    @FindBy (xpath = "//select[@name='default_attributes[attribute_pa_size]']")
    public WebElement variationsSizeDropDown;

    @FindBy (xpath = "//a[@class='nav-link active']")
    public WebElement specificationTab;

    @FindBy (xpath = "//(//input[@class='select2-search__field'])[2]")////span[@aria-expanded='true']//input[@placeholder='Search for an attribute ...']
    public WebElement colorDropDown;

    @FindBy (xpath = "//span[@class='select2 select2-container select2-container--default select2-container--above select2-container--focus']//input[@placeholder='Search for an attribute ...']") //(//li[@class='select2-search select2-search--inline'])[3]
    public WebElement sizeDropDown;

    @FindBy (xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorAktiveTick;

    @FindBy (xpath = "//input[@id='attributes_is_active_2']")
    public WebElement sizeAktiveTick;

    @FindBy(xpath = "(//td[@class='woocommerce-product-attributes-item__value'])[1]")
    public WebElement colorVisibleTextKontrol;

    @FindBy(xpath = "(//td[@class='woocommerce-product-attributes-item__value'])[2]")
    public WebElement sizeVisibleTextKontrol;





}
