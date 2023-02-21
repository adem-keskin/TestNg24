package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


public class US_07Compare {


   public US_07Compare() {

    PageFactory.initElements(Driver.getDriver(), this);

}
    @FindBy(xpath = "//*[@aria-label='Search']")
    public WebElement searchBox;

   @FindBy(xpath = "//*[@class='compare btn-product-icon']")
    public WebElement compareButton;


   @FindBy(xpath = "//*[@class='btn btn-dark btn-rounded']")
    public WebElement startCompareButton;

   @FindBy(xpath = "//h2[text()='Compare']")
    public WebElement comparePage;

   @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[1]")
    public WebElement firstDelete;

   @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[2]")
    public WebElement secondDelete;

   @FindBy(xpath = "//main[@id='main']//div[2]//div[1]//a[2]")
    public WebElement thirdDelete;

   @FindBy(xpath = "//div[@class='compare-col compare-value last-col']//a[@class='compare-action remove_from_compare']")
    public WebElement fourthDelete;

   @FindBy(xpath = "//*[text()='No products added to the compare']")
    public WebElement emptyComparePage;




}

