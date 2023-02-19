package techproed.tests.hilal.us10;

import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TC02 {

    @Test
    public void weekTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        allureToYouHomePage.becomeAVendor.click();

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();



    }
}
