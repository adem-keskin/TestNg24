package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;




public class Erdem1415 {
    public Erdem1415() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement SignIn;
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "(//*[@name='password'])[1]")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement singInButton;
    @FindBy(xpath = "//li[@id='menu-item-1074']")
    public WebElement myAcc;
    @FindBy(partialLinkText = "Store Manager")
    public WebElement storeManager;
    @FindBy(xpath = "//div[@class='wcfm_menu_items wcfm_menu_wcfm-products']")
    public WebElement products;
    @FindBy(partialLinkText = "Add New")
    public WebElement addNewButton;
    @FindBy(xpath = "(//div//h2)[2]")
    public WebElement addProduckt;
    @FindBy(xpath = "//select[@id='product_type']")
    public WebElement productTypeDD;

    //TC02bykRes
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement bykResim;
    @FindBy(xpath = "(//button[text()='Upload files'])[3]")
    public WebElement UploadFiles;
    @FindBy(xpath = "//button[@id='__wp-uploader-id-1']")
    public WebElement selectFiles;
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public WebElement selectOk;
    @FindBy(xpath = "//img[@id='featured_img_display']")
    public WebElement bykResGör;

    //TC02kckRes
    @FindBy(xpath = "//img[@id='gallery_img_gimage_0_display']")
    public WebElement kckRes;
    @FindBy(xpath = "//button[@id='menu-item-browse']")
    public WebElement mediaLib;
    @FindBy(xpath = "(//div[@class='attachment-preview js--select-attachment type-image subtype-png landscape'])[2]")
    public WebElement kckResEkle;
    @FindBy(xpath = "//button[@class='button media-button button-primary button-large media-button-select']")
    public  WebElement addToGalery;
    @FindBy(xpath = "//img[@src='https://allure2you.com/wp-content/uploads/2023/02/TTT.png']")
    public WebElement kckResGör;

    //TC03
    //TC03-01
    @FindBy(xpath = "//input[@id='pro_title']")
    public WebElement proTitel;

    //TC03-02
    @FindBy(xpath = "//iframe[@id='excerpt_ifr']")
    public WebElement shortIframe;
    @FindBy(xpath = "//body[@data-id='excerpt']")
    public WebElement shortDes;
    @FindBy(xpath ="//body[@class='mce-content-body excerpt post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']//p")
    public  WebElement shortDogrulama;

    //TC03-03
    @FindBy(xpath = "//iframe[@id='description_ifr']")
    public WebElement desIframe;
    @FindBy(xpath = "//body[@class='mce-content-body description post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']")
    public WebElement des;
    @FindBy(xpath = "//body[@class='mce-content-body description post-type-page post-status-publish page-template-default locale-en-us mceContentBody webkit wp-editor html5-captions']//p")
    public WebElement desDogrulama;

    //TC04
    @FindBy(xpath = "//p[@class='wcfm_title wcfm_full_ele']")
    public WebElement Categories;
    @FindBy(xpath = "//span[text()='Arabalar']")
    public WebElement arabalarCategory;
    @FindBy(xpath = "//input[@value='413']")
    public WebElement arabalarClick;

    //TC05-01
    @FindBy(xpath = "//p[text()='+Add new category']")
    public WebElement addNewCateg;
    @FindBy(xpath = "//input[@id='wcfm_new_cat']")
    public WebElement categoryName;

    //TC05-02
    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement parentCategDD;
    @FindBy(id = "wcfm_new_cat")
    public WebElement CategoryNameGörünme;
    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement parentCategoryGörünme;
    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[1]")
    public WebElement categoryAddButton;
    @FindBy(xpath = "//span[text()='otomasyonCategory']")
    public WebElement eklenenCategoryGörünme;

    //TC06
    @FindBy(xpath = "//strong[text()='Product brands']")
    public WebElement productBrands;
    @FindBy(xpath = "//input[@value='335']")
    public WebElement ackBrands;

    //TC047-01
    @FindBy(xpath = "//p[text()='+Add new Product brands']")
    public WebElement addNewProductBrandsButton;
    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
    public WebElement productBrandsNameBox;

    //TC07-02
    @FindBy(xpath = "//select[@id='wcfm_new_parent_product_brand']")
    public WebElement parentTaxonomiDD;
    @FindBy(xpath = "(//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt'])[2]")
    public WebElement bransAddButton;
    @FindBy(xpath = "//span[@class='wcfmfa fa-arrow-circle-right sub_checklist_toggler fa-arrow-circle-down']")
    public WebElement grünGalssClick;
    @FindBy(xpath = "//li[@data-item='498']")
    public WebElement eklenenBrandGörünüm;


    //TC08-01
    @FindBy(xpath = "//textarea[@id='product_tags']")
    public WebElement tagsBox;

    //TC08-02
    @FindBy(xpath = "//p[text()='Choose from the most used tags']")
    public WebElement tagsChooseButton;
    @FindBy(xpath = "//a[@aria-label='A+ enerji (2 items)']")
    public WebElement hazirTags;

    //TC09
    @FindBy(xpath = "//select[@id='catalog_visibility']")
    public WebElement categoryVisibiityDD;

    //Bazi dogrilamalar
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement search;
    @FindBy(xpath = "(//i[@class='w-icon-search'])[1]")
    public WebElement searchClick;
    @FindBy(xpath = "//*[text()='02.04brands']")
    public WebElement brandsgör;
    @FindBy(xpath = "//*[text()='02.04Tags']")
    public WebElement tagsGör;



    //*******---------US15---------*****

    //TC01
    @FindBy(xpath = "//label[@class='wcfmfa fa-database']")
    public WebElement inventory;
    @FindBy(xpath = "//label[@class='wcfmfa fa-truck']")
    public WebElement shipping;
    @FindBy(xpath = "//label[@class='wcfmfa fa-server']")
    public WebElement atributes;
    @FindBy(xpath = "//div[@id='wcfm_products_manage_form_linked_head']")
    public WebElement linked;
    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[8]")
    public WebElement seo;
    @FindBy(xpath = "//label[@class='wcfmfa fa-certificate']")
    public WebElement toptan;
    @FindBy(xpath = "(//div[@class='page_collapsible_content_holder'])[10]")
    public WebElement advenced;

    //TC02-01
    @FindBy(xpath = "//input[@id='sku']")
    public WebElement sku;

    //TC02-02
    @FindBy(xpath = "//input[@id='manage_stock']")
    public WebElement mngStok;

    @FindBy(xpath = "//input[@id='stock_qty']")
    public WebElement stokQty;

    @FindBy(xpath = "//select[@id='backorders']")
    public WebElement allowBackorders;

    @FindBy(xpath = "(//option[.='Allow'])[1]")
    public WebElement allowgör;

    //TC02-03
    @FindBy(xpath = "//select[@id='stock_status']")
    public WebElement stokStatus;

    //TC02-04

    @FindBy(xpath = "//input[@id='sold_individually']")
    public WebElement soldInduvidalty;

    //TC03-01-02
    @FindBy(xpath = "//input[@id='weight']")
    public WebElement weigt;
    //TC03-03
    @FindBy(xpath = "//select[@id='shipping_class']")
    public WebElement shippingClass;
    //TC03-04
    @FindBy(xpath = "//select[@id='_wcfmmp_processing_time']")
    public WebElement procesTime;

    //TC04-01

    @FindBy(xpath = "//input[@id='attributes_is_active_1']")
    public WebElement colorClick;
    @FindBy(xpath = "(//button[text()='Add New'])[1]")
    public WebElement colorAddNew;

    @FindBy(xpath = "//select[@id='attributes_value_1']")
    public WebElement colorDD;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_select_all_attributes'])[1]")
    public WebElement colorSelectAll;
    @FindBy(xpath = "//button[@class='button wcfm_add_attribute_term wcfm_select_no_attributes']")
    public WebElement colorSelectNone;


    //TC04-02
    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeClick;

    @FindBy(xpath = "(//button[@class='button wcfm_add_attribute_term wcfm_add_attributes_new_term'])[2]")
    public WebElement sizeAddNew;

    @FindBy(xpath = "//li[@title='otosize']")
    public WebElement eklenenSize;

    @FindBy(xpath = "//select[@id='attributes_value_2']")
    public WebElement sizeDD;

    @FindBy(xpath = "(//*[text()='Select all'])[2]")
    public WebElement sizeSelectAll;

    @FindBy(xpath = "(//*[text()='Select none'])[2]")
    public WebElement sizeSelectNone;

    //TC05-01
    @FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
    public WebElement upSells;

    @FindBy(xpath = "//select[@id='upsell_ids']//select[@id='upsell_ids']")
    public WebElement upsellsDD;

    //TC05-02

    @FindBy(xpath = "(//ul[@class='select2-selection__rendered'])[5]")
    public  WebElement crossSells;

    @FindBy(xpath = "//select[@id='crosssell_ids']")
    public WebElement crossSellsDD;

    //TC06-01
    @FindBy(id = "yoast_wpseo_focuskw_text_input")
    public WebElement enterFocusKeyword;

    @FindBy(xpath = "//input[@value='02:04SEOkeyword']")
    public WebElement enterFocusDogrulama;

    //TC06-01
    @FindBy(id = "yoast_wpseo_metadesc")
    public WebElement metaDescrption;

    @FindBy(xpath = "//textarea[text()='02.04metaDES']")
    public WebElement metaDesDogrulama;

    //TC07-01
    @FindBy(id = "piecetype")
    public WebElement pieceType;
    //TC07-02
    @FindBy(id = "unitpercart")
    public WebElement UnitsPerPiece;
    //TC07-03
    @FindBy(id = "minorderqtytr")
    public WebElement minOrderQuantity;

    //TC08-01
    @FindBy(xpath = "//input[@name='enable_reviews']")
    public WebElement enableRewiews;
    @FindBy(id = "menu_order")
    public WebElement menuOrder;

    //TC08-02
    @FindBy(id = "purchase_note")
    public WebElement purchasNote;

    //Submit butonu

    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement submitButton;

    //Bzi dogrulamalkar us15
    @FindBy(xpath = "//span[@class='sku']")
    public WebElement skuDog;

    @FindBy(xpath = "//*[text()=' (4)']")
    public WebElement stkqtyDog;

    //TC03-01
    @FindBy(xpath = "//li[@id='tab-title-additional_information']")
    public WebElement specification;
    @FindBy(xpath ="//td[text()='3 kg']")
    public WebElement weigthDogru;
    //TC03-02
    @FindBy(xpath = "//td[text()='3 × 4 × 5 cm']")
    public WebElement dimenDogru;

    //TC06 dogrulama
    @FindBy(xpath = "//*[text()='Baslik02.04']")
    public WebElement Baslik02;

    @FindBy(xpath = "//input[@value='02:04SEOkeyword']")
    public WebElement enterKeyDog;
    @FindBy(xpath = "//*[text()='02.04metaDES']")
    public  WebElement metaDesDog;

    //TC07-02-03
    @FindBy(xpath = "//input[@value='12']")
    public WebElement ünitsperDog;
    @FindBy(xpath = "(//input[@value='2'])[1]")
    public WebElement minOrdDog;


}












