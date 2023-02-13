package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MedineAddProductPage01 {

    public MedineAddProductPage01 () { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(id = "product_type") // //select[@id='product_type']
    public WebElement productType;

    @FindBy(xpath = "//option[@value='simple']")
    public WebElement simple;

    @FindBy(xpath = "//option[@value='variable']")
    public WebElement variable;

    @FindBy(xpath = "//option[@value='external']")
    public WebElement external;

}
