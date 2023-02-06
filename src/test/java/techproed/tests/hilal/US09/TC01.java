package techproed.tests.hilal.US09;

import org.testng.annotations.Test;
import techproed.pages.AllureToYouVendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TC01 {

    @Test
    public void VendorTest() {

        AllureToYouVendorRegisterPage allureToYouVendorRegisterPage = new AllureToYouVendorRegisterPage();
        //01- Admin ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("allure_home_page"));

        //02- Admin Register butonuna tıklar
        allureToYouVendorRegisterPage.RegisterButton.click();

        //03- Admin çıkan Pop-Up ın görünürlüğünü doğrular

        //04- Admin "Become a Vendor" butonuna tıklar

        //05- Admin Vendor Registration sayfasına yönlendirilir

        Driver.closeDriver();



    }
}
