package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class US01_Register {


    public US01_Register() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@class='register inline-type']")
    public WebElement registerButton;

    @FindBy(xpath = "//a[@class='nav-link active']")
    public WebElement signUpYaziElementi;

    @FindBy(xpath = "//input[@id='reg_username']")
    public WebElement usernameTexBox;

    @FindBy(xpath = "//button[@value='Sign Up']")
    public WebElement signUpButton;

    @FindBy(xpath = "//input[@id='reg_email']")
    public WebElement emailTextBox;

@FindBy(xpath= "//input[@id='reg_password']")
    public WebElement passwordTextBox;

@FindBy(xpath = "//input[@id='register-policy']")
    public WebElement IAgreeButton;

@FindBy(xpath = "//p[text()='Welcome to Allure to you!']")
    public WebElement basariliGirisYaziElementi;

}

