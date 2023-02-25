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

    @FindBy (xpath = "//span[@class='wcicon-status-completed']" )  /* //div[@class='wcfm-message wcfm-success'] */
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addGalleryButton;

    @FindBy (xpath = "//input[@name='submit-data']")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@class='login logout inline-type']")
    public WebElement signOut;

    @FindBy(linkText = "Log out")
    public WebElement logOut;


    // PRODUCT LISTELEME
    @FindBy (xpath = "(//a[@class='wcfm_product_title'])[1]")
    public WebElement pratikDusunme2ListName;

    @FindBy (xpath = "(//a[@href='https://allure2you.com/store-manager/products-manage/18609'])[1]")
    public WebElement pratikDusunme2ListImage;

    // US18-EXTERNAL

    @FindBy (xpath = "//input[@id='product_url']")
    public WebElement urlTextBox;

    @FindBy (xpath = "//input[@id='button_text']")
    public WebElement buttonTextBox;

    @FindBy (xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
    public WebElement attributeButton;

    @FindBy (xpath = "(//img[@src='https://allure2you.com/wp-content/uploads/2023/02/okul-esyalari-150x150.jpg'])[1]")
    public WebElement listeUrunResmi;

    @FindBy (xpath = "//img[@id='featured_img_display']")
    public WebElement listeUrunBuyukResmi;

    @FindBy (xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorTick;

    @FindBy (xpath = "//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term']")
    public WebElement addNewAttributeButton;



}
