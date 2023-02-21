package techproed.tests.kyubr;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import techproed.pages.US06HomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US06_TC001 {

    //Kullanici anasayfayi acar
//Kullanici 'search box' kutusuna tiklar
//Kullanici  'search box'  kutusuna urun adi girer
//Kullanici girmis oldugu urunun sayfasina gider
//Kullanici  'ADD TO CART' butonuna tiklar
//Kullanici sayfadaki sag ust kosede 'cart' hucresine tiklar
//Kullanici 'View Cart' butonuna tiklar
//Kullanici 'View Cart' ve 'Checkout' butonlarini gorur.
//Kullanici sepette keledigi urunu gorur. +
//Kullanici sepet sayfasinda urunun miktarini artirir veya azaltir   (+1)

//Kullanici update cart butonuna tiklar. +
//Kullanici proceed to checkout butonuna tiklar +
//Kullanici acilan sayfasinda tum bilgileri eksiksik  girer +
//Kullanici acilan sayfada fatura adresini gorur+
//Kullanici sayfada 'payment method' bolumunu gorur+

//Kullanici sayfada bir odeme yontemi secer +
//Kullanici tum bilgilerini eksiksiz girdikten sonra 'PLACE ORDER' butonuna tiklar+
//Kullanici alisverisini tamamlar.+
//Kullanici 'Thank you. Your order has been received.'  yazisini gorur.

    US06HomePage us06HomePage;

    @Test
    public void US06Test (){
        Driver.getDriver().get(ConfigReader.getProperty("allere2you_url"));
        us06HomePage = new US06HomePage();
        us06HomePage.searchbox.click();
        us06HomePage.searchbox.sendKeys("Apple MacBook Pro 2015", Keys.ENTER);
        us06HomePage.addToCart.click();
        us06HomePage.cartButton.click();



        assert us06HomePage.viewCardButton.isDisplayed();
        assert us06HomePage.checkoutButton.isDisplayed();

        us06HomePage.viewCardButton.click();

        assert us06HomePage.shoppingCart.isDisplayed();

        us06HomePage.plusButton.click();
        us06HomePage.updateCartButton.click();

        ReusableMethods.waitFor(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(9);

        us06HomePage.proceedToCheckoutButton.click();

        us06HomePage.firstNameBox.sendKeys("Max",Keys.TAB,"Max");
        us06HomePage.streetAddressBox.sendKeys("New York",Keys.TAB,"12");
        us06HomePage.townCityBox.sendKeys("NY",Keys.TAB,Keys.TAB,"01210",Keys.TAB,"012312345",Keys.TAB,"abcdg@gmil.com");


        assert us06HomePage.paymentMethodsText.isDisplayed();

        ReusableMethods.waitFor(5);

        us06HomePage.placeOrderButton.click();

        ReusableMethods.waitFor(10);
        assert us06HomePage.orderConfirmationText.isDisplayed();

        Driver.closeDriver();



    }
}
