package techproed.tests.hilal.us09;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.FakeMail;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.awt.event.KeyEvent;
import java.security.Key;
import java.security.KeyStore;
import java.security.spec.KeySpec;

public class TC02 {

    @Test
    public void getFakeEmailTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();
        FakeMail fakeMail = new FakeMail();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        String window1 = Driver.getDriver().getWindowHandle();

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        allureToYouHomePage.becomeAVendor.click();

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
        WebElement emailde = Driver.getDriver().findElement(By.id("user_email"));
        emailde.sendKeys(Keys.COMMAND + "V");



    }
}
