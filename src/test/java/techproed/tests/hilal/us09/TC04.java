package techproed.tests.hilal.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.FakeMail;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC04 {

    @Test
    public void verificationCodeTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();
        FakeMail fakeMail = new FakeMail();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        String window1 = Driver.getDriver().getWindowHandle();

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();
        ReusableMethods.waitFor(1);

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
        ReusableMethods.waitFor(1);

        //06- Admin ana sayfadaki copy butonuna tıklar
        fakeMail.copyButton.click();

        //07- Admin ilk sekmeye geri döner
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().window(window1);

        //08- Admin email textbox ına tıklar
        vendorRegisterPage.vendorEmail.click();
        ReusableMethods.waitFor(1);

        //09- Admin email adresini yapıştırır
        vendorRegisterPage.vendorEmail.sendKeys(Keys.COMMAND + "V");

        //10- Admin re-send code butonuna tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ARROW_DOWN).perform();
        vendorRegisterPage.reSendCode.click();

        //11- Admin "Verification code sent to your email:" uyarı mesajını alır
        ReusableMethods.waitFor(2);
        Assert.assertTrue(vendorRegisterPage.reSendCode.isDisplayed());

        //12- Admin ikinci sekmeye geri döner
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().window(window2);
        Driver.getDriver().navigate().refresh();

        //13- Admin gelen email deki verification code unu kopyalar
        fakeMail.fakeMailNewMail.click();
        Driver.getDriver().switchTo().frame(1);
        String verification = FakeMail.setVerificationCode();
        Driver.getDriver().switchTo().defaultContent();

        //14- Admin ilk sekmeye geri döner
        Driver.getDriver().switchTo().window(window1);

        //15- Admin verification code textbox ına kodu yapıştırır
        ReusableMethods.typeWithJS(vendorRegisterPage.verificationCodeTextBox, verification);

        Driver.closeDriver();



    }
}
