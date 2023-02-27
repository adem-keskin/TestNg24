package techproed.tests.hilal.us11;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.SignInPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC03 {

    @Test
    public void dataVisibilityTest2() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        SignInPage signInPage = new SignInPage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        //01- Vendor ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Vendor sağ üstten Sign In butonuna tıklar
        allureToYouHomePage.signInButton.click();

        //03- Vendor email textbox ına tıklar
        ReusableMethods.waitFor(1);
        signInPage.signInEmailTextBox.click();
        ReusableMethods.waitFor(1);

        //04- Vendor textbox a email adresini girer
        signInPage.signInEmailTextBox.sendKeys(ConfigReader.getProperty("vendorEmail"));
        ReusableMethods.waitFor(1);

        //05- Vendor Password textbox ına tıklar
        signInPage.signInPassword.click();
        ReusableMethods.waitFor(1);

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
       // allureAccountPage.myAccountText2.click();
        ReusableMethods.clickByJS(allureAccountPage.myAccountText2);
        ReusableMethods.waitFor(1);

        //10- Vendor Store Manager datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.storeManager.isDisplayed());
        ReusableMethods.waitFor(1);

        //11- Vendor Orders datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.orders.isDisplayed());
        ReusableMethods.waitFor(1);

        //12- Vendors Downloads datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.downloads.isDisplayed());
        ReusableMethods.waitFor(1);

        //13- Vendor Addresses datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.addresses.isDisplayed());
        ReusableMethods.waitFor(1);

        //14- Vendor Account details datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.accountDetails.isDisplayed());
        ReusableMethods.waitFor(1);

        //15- Vendor Wishlist datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.wishlist.isDisplayed());
        ReusableMethods.waitFor(1);

        //16- Vendor Support Tickets datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.supportTickets.isDisplayed());
        ReusableMethods.waitFor(1);

        //17- Vendor Followings datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.followings.isDisplayed());
        ReusableMethods.waitFor(1);

        //18- Vendor Logout datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.logout.isDisplayed());

        Driver.closeDriver();



    }
}
