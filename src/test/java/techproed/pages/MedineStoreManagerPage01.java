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



}
