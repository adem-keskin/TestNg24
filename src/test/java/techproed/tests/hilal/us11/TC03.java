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
        Assert.assertTrue(allureAccountPage.myAccountText2.isDisplayed());

        //09- Vendor My Account yazısına tıklar
        allureAccountPage.myAccountText2.click();

        //10- Vendor Store Manager datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.storeManager.isDisplayed());

        //11- Vendor Orders datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.orders.isDisplayed());

        //12- Vendors Downloads datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.downloads.isDisplayed());

        //13- Vendor Addresses datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.addresses.isDisplayed());

        //14- Vendor Account details datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.accountDetails.isDisplayed());

        //15- Vendor Wishlist datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.wishlist.isDisplayed());

        //16- Vendor Support Tickets datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.supportTickets.isDisplayed());

        //17- Vendor Followings datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.followings.isDisplayed());

        //18- Vendor Logout datasını gördüğünü doğrular
        Assert.assertTrue(allureAccountPage.logout.isDisplayed());



    }
}
