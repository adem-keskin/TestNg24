package techproed.tests.medine;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.MedineProductsPage01;
import techproed.pages.MedineStoreManagerPage01;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US16_TC01 {
    MedineProductsPage01 product = new MedineProductsPage01();
    MedineStoreManagerPage01 product2 = new MedineStoreManagerPage01();
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


        // 16. Kullanici Add Product sayfasinda Simple Product default olarak göründügünü dogrular.
        // product2.productType.click();
        Select productType = new Select(product2.productType);
        productType.selectByValue("simple");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.simple.isDisplayed());
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

        //16. Kullanici Virtual Seceneginin secilebilir oldugunu dogrular. // ????
        product2.virtualCheckbox.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.virtualCheckbox.isSelected());


        //17. Kullanici  Downloadable Seceneginin secilebilir oldugunu dogrular.
        product2.downloadableCheckbox.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.downloadableCheckbox.isSelected());
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

        // 16. Kullanici Price Kutucugunun tiklanabilir oldugunu dogrular.
        ReusableMethods.clickByJS(product2.regularPriceTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.regularPriceTextBox.isDisplayed()); // ???? isEnabled()

        ReusableMethods.clickByJS(product2.salePriceTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.salePriceTextBox.isDisplayed());


        // 17. Kullanici Price Kutucuguna gecerli bir deger girer.
        // 18. Kullanici Price Kutucuguna invalid bir deger girer.
        // 19. Kullanici Sale Price Kutucuguna gecerli bir deger girer.
        // 20. Kullanici Sale Price Kutucuguna invalid bir deger girer.

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
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.medineAddNewProduct();

        //16. Kullanici Simple Product secenegini secer.
        //17. Kullanici Virtual kutucugunu secer.
        //18. Kullanici Product Title kismina veri girer.
        //19. Kullanici Resim1 e tiklar.
        //20. Kullanici acilan sekmeden Product Resmini secer.
        //21. Kullanici Select butonuna tiklar.
        //22. Kullanici Resim2 e tiklar.
        //23. Kullanici acilan sekmeden Product Resmini secer.
        //24. Kullanici Select butonuna tiklar.
        //25. Kullanici Price e deger girer.
        //26. Kullanici Categori secer
        //27. Kullanici Submit e tiklar.
        //28. Kullanici ürün basariyla eklendi yazisini dogrular.

        Driver.closeDriver();
    }

    @Test
    public void test05() {
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

        //14. Kullanici eklenen urunun isminin Products Sayfasinda göründügünü dogrular.
        //15. Kullanici eklenen urunun resminin Products Sayfasinda göründügünü dogrular.

        Driver.closeDriver();
    }
}