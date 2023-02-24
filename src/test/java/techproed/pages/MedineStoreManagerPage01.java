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

    @FindBy (xpath = "//div[@class='wcfm_form_simple_submit_wrapper']")
    public WebElement successMessage;

    @FindBy(xpath = "(//button[@class='button media-button button-primary button-large media-button-select'])[2]")
    public WebElement addGalleryButton;

    @FindBy (xpath = "//input[@name='submit-data']")
    public WebElement submitButton;

    // PRODUCT LISTELEME
    @FindBy (xpath = "(//a[@class='wcfm_product_title'])[1]")
    public WebElement pratikDusunme2ListName;

    @FindBy (xpath = "(//a[@href='https://allure2you.com/store-manager/products-manage/18609'])[1]")
    public WebElement pratikDusunme2ListImage;


}
