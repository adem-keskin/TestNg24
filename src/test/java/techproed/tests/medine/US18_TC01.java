package techproed.tests.medine;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Erdem1415;
import techproed.pages.MedineProductsPage01;
import techproed.pages.MedineStoreManagerPage01;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US18_TC01 {

    MedineProductsPage01 product = new MedineProductsPage01();
    MedineStoreManagerPage01 product2 = new MedineStoreManagerPage01();
    Erdem1415 erdem1415 = new Erdem1415();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void test01() {

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
        ReusableMethods.medineSignIn();
    /*
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.medineAddNewProduct();
        ReusableMethods.waitFor(3);

    /*
    16. Kullanici urun cesitlerinin bulundugu dropdowndan External - Affiliate Product secenegini oldugunu dogrular.
    17. Kullanici External - Affiliate Product u seçer.
     */
        Select productType = new Select(product2.productType);
        Assert.assertTrue(productType.getOptions().contains(product2.external));
        productType.selectByValue("external");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.external.isDisplayed());

        Driver.closeDriver();
    }
    @Test
    public void test02() {

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
        ReusableMethods.medineSignIn();
    /*
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.medineAddNewProduct();
        ReusableMethods.waitFor(3);

    /*
    16. Kullanici External - Affiliate Product u seçer.
    17. Kullanici ürünün Titel ini girer.
    18. Kullanici URL Kutucugunun tiklanabilir oldugunu dogrular.
    19. Kullanici URL Kutucuguna bir veri girer.
    20. Kullanici Button Text Kutucugunun tiklanabilir oldugunu dogrular.
    21. Kullanici Button Text Kutucuguna bir veri girer.
    22. Kullanici Price Kutucugunun tiklanabilir oldugunu dogrular.
    23. Kullanici Price Kutucuguna gecerli bir deger girer.
    24. Kullanici Price Kutucuguna invalid bir deger girer.
    25. Kullanici Sale Price Kutucugunun tiklanabilir oldugunu dogrular.
    26. Kullanici Sale Price Kutucuguna gecerli bir deger girer.
    27. Kullanici Sale Price Kutucuguna invalid bir deger girer.
     */

        Driver.closeDriver();
    }

    @Test
    public void test03() {

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
        ReusableMethods.medineSignIn();
    /*
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.medineAddNewProduct();
        ReusableMethods.waitFor(3);

    /*
    16. Kullanici urun cesitlerinin bulundugu dropdowndan External - Affiliate Product secenegini secer.
    17. Kullanici ürünün Titel ini girer.
    18. Kullanici Resim1 e tiklar.
    19. Kullanici acilan sekmeden Product Resmini secer.
    20. Kullanici Select butonuna tiklar.
    21. Kullanici Resim2 e tiklar.
    22. Kullanici acilan sekmeden Product Resmini secer.
    23. Kullanici Select butonuna tiklar.
    24. Kullanici Price e deger girer.
    25. Kullanici Categori secer
    26. Kullanici Submit e tiklar.
    27. Kullanici ürün basariyla eklendi yazisinin görüldügünü dogrular.
     */

        Driver.closeDriver();
    }

    @Test
    public void test04() {

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
        ReusableMethods.medineSignIn();
    /*
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.waitFor(3);


    // 14. Kullanici eklenen urunun isminin Products Sayfasinda göründügünü dogrular.
    // 15. Kullanici eklenen urunun resminin Products Sayfasinda göründügünü dogrular.


        Driver.closeDriver();
    }

}
