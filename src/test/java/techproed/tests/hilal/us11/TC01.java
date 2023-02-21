package techproed.tests.hilal.us11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.MyAccountPage;
import techproed.pages.SignInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC01 {

    @Test
    public void myAccountVisibility() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        SignInPage signInPage = new SignInPage();
        MyAccountPage myAccountPage = new MyAccountPage();

        //01- Vendor ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Vendor sağ üstten Sign In butonuna tıklar
        allureToYouHomePage.signInButton.click();

        //03- Vendor email textbox ına tıklar
        ReusableMethods.waitFor(2);
        signInPage.signInEmailTextBox.click();

        //04- Vendor textbox a email adresini girer
        signInPage.signInEmailTextBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        //05- Vendor Password textbox ına tıklar
        signInPage.signInPassword.click();

        //06- Vendor textbox a parolasını girer
        signInPage.signInPassword.sendKeys(ConfigReader.getProperty("vendorPassword"));

        //07- Vendor Sign In butonuna tıklar
        signInPage.signInButton.click();
        ReusableMethods.waitFor(2);

        //08- Vendor My Account yazısını görür
        Assert.assertTrue(myAccountPage.myAccountText2.isDisplayed());


    }
}
