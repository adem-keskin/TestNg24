package techproed.tests.kyubr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.US06HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US20_TC001 {

    //Kullanici anasayfayi acar
    //Kullanici 'Sign In' butonuna tiklar
    //Kullanici email hucresine , email adresi girer
    //Kullanici password hucresine sifresini girer
    //Kullanici 'Sign In' butonuna tiklar
    //Kullanici 'my account' butonuna tiklar
    //Kullanici 'Store Manager' butonuna tiklar
    //Kullanici Coupons butonuna tiklar
    //Kullanici 'Add new' butonuna tiklar
    //Kullanici 'Add Coupon' sayfasina gider
    //Kullanici 'Code' hucresine  bir kod yazar.
    //Kullanici 'Description' kismina yazi yazar
    //Kullanici 'Discount Type' kismindaki secim yapar
    //Kullanici ' Coupon  Amount ' hucresine sayisal bir deger girer
    //Kullanici 'Coupon expiry date' hucresine istenilen formata uygun bir tarih tiklar
    //Kullanici 'Allow free shipping' hucresine tiklar
    //Kullanici 'Show on store' hucresine tiklar ++++++
    //Kullanici sayfanin asagisindaki 'SUBMIT' butonuna tiklar
    //"Kullanici sayfada 'Coupon Successfully Published.' yazisini gorur
    //"
    //Kullanici Coupons butonuna tiklar
    //Kullanici acilan sayfada olustudugu kodu gorur

    US06HomePage us06HomePage;

    @Test
    public void US20Test1() {

        Driver.getDriver().get(ConfigReader.getProperty("allere2you_url"));
        us06HomePage = new US06HomePage();
        us06HomePage.signInButton.click();
        us06HomePage.emailBox.sendKeys("testngteam24@yahoo.com", Keys.TAB);
        us06HomePage.passwordBox.sendKeys("qateam2424", Keys.TAB);

        us06HomePage.girisBolumundekSignInButton.click();
        ReusableMethods.waitFor(5);
        us06HomePage.myAccountButton.click();
        ReusableMethods.waitFor(5);

        assert us06HomePage.myAccountBasligi.isDisplayed();//fazladan oldu


        us06HomePage.storeManagerButton.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        us06HomePage.couponsButton.click();

        ReusableMethods.waitFor(7);
        //Driver.getDriver().manage().window().fullscreen();
        us06HomePage.addNewButton.click();





        us06HomePage.codeBox.sendKeys("IOJK23VSX89", Keys.TAB, "This coupon is valid for all my products."
                , Keys.TAB, Keys.SPACE, Keys.ENTER, Keys.TAB);
        us06HomePage.cuponAmount.sendKeys("10");



        us06HomePage.couponExpiryDateBox.sendKeys("2023-02-25", Keys.TAB,Keys.SPACE,Keys.TAB,Keys.SPACE);

        //Driver.getDriver().manage().window().fullscreen();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(6);



        Actions action = new Actions(Driver.getDriver());
        actions.moveToElement(us06HomePage.allowFreeShippingButton).build().perform();


        // us06HomePage.allowFreeShippingButton.click();
        assert us06HomePage.allowFreeShippingButton.isDisplayed();//gorunurlugunu yazdik

        //us06HomePage.showOnStoreBox.click();
        assert us06HomePage.showOnStoreBox.isDisplayed();//butonun gorunur oldugunu yazdik
        Driver.closeDriver();

    }
}
