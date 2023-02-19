package techproed.tests.hilal.us10;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.VendorRegisterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import javax.swing.*;

public class TC01 {

    @Test
    public void tooShortTest() {

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

        //05- Admin password butonuna tıklar
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitFor(2);
        vendorRegisterPage.vendorPassword.click();


        //06- Admin parola girer
        vendorRegisterPage.vendorPassword.sendKeys("123");

        //07- Admin "too short" uyarı mesajını görür





    }

}
