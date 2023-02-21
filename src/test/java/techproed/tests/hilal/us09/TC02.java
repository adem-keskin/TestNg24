package techproed.tests.hilal.us09;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.FakeMail;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TC02 {

    @Test
    public void getFakeEmailTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();
        FakeMail fakeMail = new FakeMail();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        allureToYouHomePage.becomeAVendor.click();

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();

        //05- Admin yeni sekmede ana sayfaya gider
        Driver.getDriver().navigate().to("https://www.fakemail.net/");

        //06- Admin ana sayfadaki copy butonuna tıklar
        fakeMail.copyButton.click();

        //07- Admin ilk sekmeye geri döner
        Driver.getDriver().navigate().back();

        //08- Admin email textbox ına tıklar
        vendorRegisterPage.vendorEmail.click();

        //09- Admin email adresini yapıştırır
        Actions actions = new Actions(Driver.getDriver());
       // actions.clickAndHold(fakeMail.fakeMail).moveToElement(vendorRegisterPage.vendorEmail).release().build().perform();








    }
}
