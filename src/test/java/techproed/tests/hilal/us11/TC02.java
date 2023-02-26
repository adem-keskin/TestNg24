package techproed.tests.hilal.us11;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.SignInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC02 {

    @Test
    public void dataVisibilityTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        SignInPage signInPage = new SignInPage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        //01- Vendor ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Vendor sağ üstten Sign In butonuna tıklar
        allureToYouHomePage.signInButton.click();
        ReusableMethods.waitFor(1);

        //03- Vendor email textbox ına tıklar
        signInPage.signInEmailTextBox.click();
        ReusableMethods.waitFor(1);

        //04- Vendor textbox a email adresini girer
        signInPage.signInEmailTextBox.sendKeys(ConfigReader.getProperty("vendorEmail"));
        ReusableMethods.waitFor(1);

        //05- Vendor Password textbox ına tıklar
        signInPage.signInPassword.click();

        //06- Vendor textbox a parolasını girer
        signInPage.signInPassword.sendKeys(ConfigReader.getProperty("vendorPassword"));
        ReusableMethods.waitFor(1);

        //07- Vendor Sign In butonuna tıklar
        signInPage.signInButton.click();
        ReusableMethods.waitFor(1);

        //08- Vendor My Account yazısını görür
        Assert.assertTrue(allureAccountPage.myAccountText2.isDisplayed());
        ReusableMethods.waitFor(1);

        //09- Vendor My Account yazısına tıklar
        allureAccountPage.myAccountText2.click();

        //10- Vendor Orders logosunu gördüğünü doğrular
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(allureAccountPage.ordersLogo.isDisplayed());
        ReusableMethods.waitFor(1);

        //11- Vendor Downloads logosunu gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.downloadsLogo.isDisplayed());
        ReusableMethods.waitFor(1);

        //12- Vendors Addresses logosunu gördügünü dogrular
        Assert.assertTrue(allureAccountPage.addressesLogo.isDisplayed());
        ReusableMethods.waitFor(1);

        //13- Vendor Account details logosunu gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.accountDetailsButton.isDisplayed());
        ReusableMethods.waitFor(1);

        //14- Vendor Wishlist logosunu gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.wishlistLogo.isDisplayed());
        ReusableMethods.waitFor(1);

        //15- Vendor Logout logosunu gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.logoutLogo.isDisplayed());

        Driver.closeDriver();




    }
}
