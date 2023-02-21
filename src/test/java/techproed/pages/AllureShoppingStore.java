package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class AllureShoppingStore {
    public AllureShoppingStore(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@aria-label='Search']")
    public WebElement searchBox;

    @FindBy(css = "button[aria-label='Search Button'] i[class='w-icon-search']")
    public WebElement searchButton;
}
