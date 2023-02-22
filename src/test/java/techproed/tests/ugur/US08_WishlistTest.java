package techproed.tests.ugur;



import org.openqa.selenium.Keys;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.US08_Wishlist;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class US08_WishlistTest {

//1-Kullanici,allure2you.com sayfasina gider
//2-Kullanici arama kutusuna tiklar
//3-Kullanici aramak istedigi urunu arama kutusuna yazar
//4-Kullanici arama butonunu tiklar
//5-Kullanici begendigi urunu WHISLIST bolumune ekler
//6-Kullanici WHISLIST e ekledigi urunleri goruntuler
//7-Kullanici QUICK VIEW butonuna tiklar
//8-Kullanici QUICK VIEW ile urunlerin ozelliklerini goruntuler
//9-Kullanici  ADD TO CART butonu ile urunleri CART a atar
//10-Kullanici sag ust kosedeki CART butonuna tiklar.
//11-Kullanici VIEW CART ve CHECKOUT  butonlarini gorur.
//12-Kullanici VIEW CART a tiklar
//13-Kullanici sepetteki ekledigi urunu goruntuler
//14-Kullanici PROCEED TO CHECKOUT butonunu tiklar
//15-Kullanici acilan sayfadaki tum bilgileri eksiksiz girer
//16-Kullanici sayfada PAYMENT METHODS bolumunu gorur
//17-Kullanici PLACE ORDER butonuna tiklar
//18-Kullanici THANK YOU YOUR ORDER HAS BEEN RECEIVED mesajini gorur


    @Test
    public void US08_Test() throws InterruptedException {

        US08_Wishlist us08Whishlist = new US08_Wishlist();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));


        us08Whishlist.searchBox.sendKeys("Sweatshirt Los Angeles", Keys.ENTER);
        us08Whishlist.whishButton.click();


        Thread.sleep(3000);


        us08Whishlist.searchBox.sendKeys("Sweatshirt Rose", Keys.ENTER);
        us08Whishlist.whishButton.click();

        us08Whishlist.whishlistButton.click();


        Assert.assertTrue(us08Whishlist.pageTitle.isDisplayed());//Whishlist
        Thread.sleep(3000);

        us08Whishlist.quickView.click();
        Thread.sleep(3000);
        us08Whishlist.xButton.click();
        Thread.sleep(3000);
        us08Whishlist.addToCart.click();
        Thread.sleep(3000);
        Assert.assertEquals(us08Whishlist.alertBoxMessage.getText(), "VIEW CART “Sweatshirt Rose” has been added to your cart.");

        us08Whishlist.quickView.click();
        Thread.sleep(2000);
        us08Whishlist.xButton.click();
        Thread.sleep(3000);
        us08Whishlist.addToCart.click();
        Assert.assertEquals(us08Whishlist.alertBoxMessage.getText(), "VIEW CART “Sweatshirt Los Angeles” has been added to your cart.");

        us08Whishlist.cartButton.click();

        assert us08Whishlist.viewCartButton.isDisplayed();
        assert us08Whishlist.checkoutButton.isDisplayed();

        us08Whishlist.viewCartButton.click();

        assert us08Whishlist.firstProductDisplayed.isDisplayed();
        assert us08Whishlist.secondProductDisplayed.isDisplayed();
        Thread.sleep(3000);

        assert us08Whishlist.shooppingCartPage.isDisplayed();
        us08Whishlist.proceedToCheckout.sendKeys(Keys.ENTER);

        assert us08Whishlist.checkoutPage.isDisplayed();


        us08Whishlist.billingFirstName.sendKeys("Ugur",Keys.TAB,"Tastan",Keys.TAB,Keys.TAB,"United Kingdom",Keys.TAB);
        us08Whishlist.streetAddress.sendKeys("Street 1",Keys.TAB,Keys.TAB,"London",Keys.TAB,Keys.TAB,"W1A 1AA",Keys.TAB,"+123333422", Keys.TAB,"abc@gmail.com",Keys.ENTER);


        assert us08Whishlist.paymentMethods.isDisplayed();


        us08Whishlist.placeOrder.submit();

        assert us08Whishlist.orderMessage.isDisplayed();

        Driver.closeDriver();



    }
}