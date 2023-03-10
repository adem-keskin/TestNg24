package techproed.tests.hilal.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.FakeMail;
import techproed.pages.AllureAccountPage;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.awt.geom.RectangularShape;

public class TC08 {

    @Test
    public void alreadyExistsTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();
        FakeMail fakeMail = new FakeMail();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        String window1 = Driver.getDriver().getWindowHandle();

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        // allureToYouHomePage.becomeAVendor.click();
        ReusableMethods.clickByJS(allureToYouHomePage.becomeAVendor);
        ReusableMethods.waitFor(2);

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();

        //05- Admin yeni sekmede ana sayfaya gider
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        String window2 = Driver.getDriver().getWindowHandle();

        //06- Admin ana sayfadaki copy butonuna tıklar
        fakeMail.copyButton.click();

        //07- Admin ilk sekmeye geri döner
        ReusableMethods.waitFor(2);
        Driver.getDriver().switchTo().window(window1);

        //08- Admin email textbox ına tıklar
        vendorRegisterPage.vendorEmail.click();

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
        ReusableMethods.waitFor(3);
        Driver.getDriver().switchTo().window(window2);
        Driver.getDriver().navigate().refresh();

        //13- Admin gelen email deki verification code unu kopyalar
        fakeMail.fakeMailNewMail.click();
        Driver.getDriver().switchTo().frame(1);
        String verification = FakeMail.setVerificationCode();
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.waitFor(2);

        //14- Admin ilk sekmeye geri döner
        Driver.getDriver().switchTo().window(window1);

        //15- Admin verification code textbox ına kodu yapıştırır
        ReusableMethods.waitFor(3);
        ReusableMethods.typeWithJS(vendorRegisterPage.verificationCodeTextBox, verification);
        ReusableMethods.waitFor(3);

        //16- Admin password textbox ına valid bir değer girer
        vendorRegisterPage.vendorPassword.sendKeys(ConfigReader.getProperty("fakeMailPassword"));
        actions.keyDown(Keys.ARROW_DOWN).perform();
        actions.keyDown(Keys.ARROW_DOWN).perform();

        //17- Admin confirm password hesabına valid bir değeri tekrar girer
        vendorRegisterPage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("fakeMailPassword"));

        //18- Admin register butonuna tıklar
        // vendorRegisterPage.registerButton.click();
        ReusableMethods.clickByJS(vendorRegisterPage.registerButton);
        ReusableMethods.waitFor(3);

        //19- Admin "Registration Successfully Completed." yazısını görür
        Assert.assertTrue(vendorRegisterPage.registrationSuccessfully.isDisplayed());

        //20- Admin sayfayı refresh eder
        ReusableMethods.waitFor(3);
    //  Driver.getDriver().navigate().back();
      //Driver.getDriver().navigate().refresh();

        vendorRegisterPage.notRightNowButton.click();
        ReusableMethods.waitFor(2);
        allureAccountPage.signOut.click();
        allureAccountPage.logOut.click();

        allureToYouHomePage.registerButton.click();
        ReusableMethods.waitFor(5);
      //  vendorRegisterPage.vendorRegistrationTitle.click();
        ReusableMethods.clickByJS(allureToYouHomePage.becomeAVendor);
       // allureToYouHomePage.becomeAVendor.click();


        //21- Admin aynı bilgiler tekrar girer
        ReusableMethods.waitFor(5);
        vendorRegisterPage.vendorEmail.sendKeys(Keys.COMMAND + "V");
        ReusableMethods.waitFor(3);
        vendorRegisterPage.verificationCodeTextBox.sendKeys("123456");
        ReusableMethods.waitFor(3);
        vendorRegisterPage.vendorPassword.sendKeys(ConfigReader.getProperty("fakeMailPassword"));
        vendorRegisterPage.vendorConfirmPassword.sendKeys(ConfigReader.getProperty("fakeMailPassword"));
        ReusableMethods.clickByJS(vendorRegisterPage.registerButton);
        ReusableMethods.waitFor(5);

        //22- Admin "This Email already exists. Please login to the site and apply as vendor." yazısını görür
        Assert.assertTrue(vendorRegisterPage.emailInvalid.isDisplayed());

        Driver.closeDriver();




    }
}

