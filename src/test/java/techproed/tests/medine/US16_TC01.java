package techproed.tests.medine;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.MedineAddProductPage01;
import techproed.pages.MedineProductsPage01;
import techproed.utilities.Driver;
import techproed.utilities.MedineReusable;

public class US16_TC01 {
    MedineProductsPage01 product = new MedineProductsPage01();
    MedineAddProductPage01 product2 = new MedineAddProductPage01();
    Actions actions = new Actions(Driver.getDriver());

@Test
    public void testCase01() {
    /*
    1. Kullanici Url'e gider.
    2. Kullanici anasayfaya geldigini dogrular.
    3. Kullanici Signin yazisina tiklar.
    4. Kullanici Signin(login) sayfasinin acildigini dogrular.
    5. Kullanici "Username or email address" textboxuna emailini yada username ini girer.
    6. Kullanici password textbox'a passwordunu girer.
    7. Kullanici SIGN IN butonuna tiklar.
    8. My Account yazisina tiklar.
    9. Kullanici giris yaptigini dogrular.
     */
    MedineReusable.signIn();
    /*
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
    */
    MedineReusable.storeManager();
    MedineReusable.addNewProduct();

// 16. Kullanici Add Product sayfasinda Simple Product default olarak göründügünü dogrular.
    // product2.productType.click();
    Select productType = new Select(product2.productType);
    productType.selectByValue("simple");
    MedineReusable.waitFor(2);
    //Assert.assertTrue(product2.simple.isDisplayed());
    Driver.closeDriver();



}

}
