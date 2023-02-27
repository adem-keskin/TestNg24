package techproed.tests.hilal.us09;

import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TC01 {

    @Test
    public void becomeAVendorLoginTest() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        VendorRegisterPage vendorRegisterPage = new VendorRegisterPage();

        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        //02- Admin Register butonuna tıklar
        allureToYouHomePage.registerButton.click();

        //03- Admin "Become a Vendor" butonuna tıklar
        // allureToYouHomePage.becomeAVendor.click();
        ReusableMethods.clickByJS(allureToYouHomePage.becomeAVendor);
        ReusableMethods.waitFor(2);

        //04- Admin Vendor Registration sayfasına yönlendirilir
        vendorRegisterPage.vendorRegistrationTitle.click();

        Driver.closeDriver();



    }
}
