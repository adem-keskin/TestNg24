package techproed.tests.hilal.us11;

import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.SignInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TC01 {

    @Test
    public void myAccountVisibility() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        SignInPage signInPage = new SignInPage();

        //01- Vendor ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Vendor sağ üstten Sign In butonuna tıklar
        allureToYouHomePage.signInButton.click();

        //03- Vendor email textbox ına tıklar
        signInPage.signInEmailTextBox.click();

        //04- Vendor textbox a email adresini girer
        signInPage.signInEmailTextBox.sendKeys("vendorEmail");

        //05- Vendor Password textbox ına tıklar
        //06- Vendor textbox a parolasını girer
        //07- Vendor Sign In butonuna tıklar
        //08- Vendor My Account yazısını görür



    }
}
