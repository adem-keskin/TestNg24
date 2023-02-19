package techproed.tests.kyubr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import techproed.pages.US06HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US21_TC001 {

    //Kullanici anasayfayi acar
    //Kullanici 'search box' kutusuna tiklar
    //Kullanici  'search box'  kutusuna urun adi girer
    //Kullanici girmis oldugu urunun sayfasina gider
    //Kullanici  'ADD TO CART' butonuna tiklar
    //Kullanici sayfadaki sag ust kosede 'chart' butonuna tiklar
    //Kullanici 'view chart' ve 'checkout' butonlarini gorur
    //Kullanici ' view chart' butonuna tiklar
    //Kullanici sepette Ekledigi urunu gorur
    //Kullanici kupon bolumune kupon kodunu yazar
    //Kullanici 'APPLY COUPON' butonuna tiklar
    //Kullanici  'PRCOEED TO CHECKOUT' butonuna tiklar.
    //Kullanici yeni acilan sayfayi  gorur.
    //Kullanici tum fatura adres bilgilerini eksiksiz girer.
    //Kullanici sayfada 'payment method' bolumunu gorur
    //Kullanici bir odeme yontemi secer
    //Kullanici tum bilgilerini eksiksiz girdikten sonra 'PLACE ORDER' butonuna tiklar


    US06HomePage us06HomePage;//IJH56YNU8

    @Test
    public void US21Test1() {

        Driver.getDriver().get(ConfigReader.getProperty("allere2you_url"));
        us06HomePage= new US06HomePage();
        assert us06HomePage.spendingGoodYazisi.isDisplayed();//ilk sayfada oldugumuzu gostersin diye yazdim.
        us06HomePage.searchbox.click();
        us06HomePage.searchbox.sendKeys("Macbook Pro 2015", Keys.ENTER);

        assert us06HomePage.pinkSweatshirtUrunu.isDisplayed();//urun sayfasinda olup olmadigimizi gostermek icin

//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.PAGE_DOWN).perform();
        us06HomePage.addToCart.click();

        //ReusableMethods.waitFor(5);
        us06HomePage.cartButton.click();

        assert us06HomePage.viewCardButton.isDisplayed();
        assert us06HomePage.checkoutButton.isDisplayed();

        us06HomePage.viewCardButton.click();

        assert us06HomePage.productYazsisi.isDisplayed();//urun sayfasinda olup olmadigimizi gostermek icin


        us06HomePage.couponTextBox.sendKeys("IJK23VSX89",Keys.TAB);

        Actions actions1 = new Actions(Driver.getDriver());
        actions1.sendKeys(Keys.PAGE_DOWN);
        ReusableMethods.waitFor(5);
        us06HomePage.applyCouponButton.click();

        us06HomePage.proceedToCheckoutButton.click();

        assert us06HomePage.billingDetailsYazisi.isDisplayed();//yeni bir ayfaya gectigimizi gostermek icin yazildi.

        //us06HomePage.firstNameBox.sendKeys("Mia",Keys.TAB,"daphne",Keys.TAB,Keys.TAB,Keys.TAB,"12",
        //Keys.TAB,Keys.TAB,"miami",Keys.TAB,Keys.TAB,"32256",Keys.TAB,"5555-555-555",Keys.TAB,"bhugii@gmail.com");

        Select select = new Select(us06HomePage.ulkeDegistirme);
        select.selectByIndex(1);

        ReusableMethods.waitFor(5);
//        Actions actions2 = new Actions(Driver.getDriver());
//        actions2.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        //Driver.getDriver().manage().window().fullscreen();
        us06HomePage.payAtTheDoorButton.click();

        ReusableMethods.waitFor(5);
        us06HomePage.placeOrderButton.click();

        assert us06HomePage.thankYouText.isDisplayed();

    }
}
