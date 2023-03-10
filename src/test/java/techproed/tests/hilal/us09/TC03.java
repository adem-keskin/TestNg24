package techproed.tests.hilal.us09;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.FakeMail;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC03 {

    @Test
    public void verificationCodeSentTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();
        FakeMail fakeMail = new FakeMail();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        String window1 = Driver.getDriver().getWindowHandle();

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        ReusableMethods.waitFor(3);

        //03- Admin "Become a Vendor" butonuna tıklar
        allureToYouHomePage.becomeAVendor.click();
        ReusableMethods.waitFor(3);

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();
        ReusableMethods.waitFor(3);

        ReusableMethods.waitFor(2);

        //03- Admin "Become a Vendor" butonuna tıklar
       // allureToYouHomePage.becomeAVendor.click();
        ReusableMethods.clickByJS(allureToYouHomePage.becomeAVendor);
        ReusableMethods.waitFor(2);

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();
        ReusableMethods.waitFor(2);


        //05- Admin yeni sekmede ana sayfaya gider
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        String window2 = Driver.getDriver().getWindowHandle();

        //06- Admin ana sayfadaki copy butonuna tıklar
        ReusableMethods.waitFor(1);
        fakeMail.copyButton.click();

        //07- Admin ilk sekmeye geri döner
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().window(window1);

        //08- Admin email textbox ına tıklar
        vendorRegisterPage.vendorEmail.click();

        ReusableMethods.waitFor(3);

        //09- Admin email adresini yapıştırır
        vendorRegisterPage.vendorEmail.sendKeys(Keys.COMMAND + "V");
        ReusableMethods.waitFor(3);

        ReusableMethods.waitFor(1);

        //09- Admin email adresini yapıştırır
        vendorRegisterPage.vendorEmail.sendKeys(Keys.COMMAND + "V");
        ReusableMethods.waitFor(1);


        //10- Admin re-send code butonuna tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ARROW_DOWN).perform();
        vendorRegisterPage.reSendCode.click();

        //11- Admin "Verification code sent to your email:" uyarı mesajını alır
        ReusableMethods.waitFor(3);
        Assert.assertTrue(vendorRegisterPage.verificationMessage.isDisplayed());

        Driver.closeDriver();


    }
}
