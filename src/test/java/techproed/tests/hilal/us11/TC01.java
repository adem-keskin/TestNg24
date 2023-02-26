package techproed.tests.hilal.us11;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.SignInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC01 {

    @Test
    public void myAccountVisibility() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        SignInPage signInPage = new SignInPage();
        AllureAccountPage allureAccountPage= new AllureAccountPage();

        //01- Vendor ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Vendor sağ üstten Sign In butonuna tıklar
        allureToYouHomePage.signInButton.click();

        //03- Vendor email textbox ına tıklar
        ReusableMethods.waitFor(2);
        signInPage.signInEmailTextBox.click();

        //04- Vendor textbox a email adresini girer
        signInPage.signInEmailTextBox.sendKeys();

        //05- Vendor Password textbox ına tıklar
        signInPage.signInPassword.click();

        //06- Vendor textbox a parolasını girer
        signInPage.signInPassword.sendKeys();

        //07- Vendor Sign In butonuna tıklar
        signInPage.signInButton.click();
        ReusableMethods.waitFor(2);

        //08- Vendor My Account yazısını görür
        Assert.assertTrue(allureAccountPage.myAccountText2.isDisplayed());

        Driver.closeDriver();


    }
}
