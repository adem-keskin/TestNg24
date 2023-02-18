package techproed.tests.hilal.us09;

import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TC02 {

    @Test
    public void getEmailTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        allureToYouHomePage.becomeAVender.click();

        //04- Admin Vendor Registration sayfasına yönlendirilir
        allureToYouHomePage.vendorRegistrationTitle.click();

        //05- Admin yeni sekmede ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("fakemail"));

        //06- Admin ana sayfadaki copy butonuna tıklar


        //07- Admin ilk sekmeye geri döner
        //08- Admin email textbox ına tıklar
        //09- Admin email adresini yapıştırır

    }
}
