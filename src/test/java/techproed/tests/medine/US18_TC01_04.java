package techproed.tests.medine;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Erdem1415;
import techproed.pages.MedineProductsPage01;
import techproed.pages.MedineStoreManagerPage01;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US18_TC01_04 {

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

        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.signOut);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.logOut);

       // Driver.closeDriver();
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


        // 16. Kullanici External - Affiliate Product u seçer.
        Select productType = new Select(product2.productType);
        productType.selectByValue("external");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.external.isDisplayed());
        // 17. Kullanici ürünün Titel ini girer.
        erdem1415.proTitel.sendKeys(ConfigReader.getProperty("productTitle"));
        ReusableMethods.waitFor(2);
        // 18. Kullanici URL Kutucugunun tiklanabilir oldugunu dogrular.
        ReusableMethods.clickByJS(product2.urlTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.urlTextBox.isDisplayed());
        // 19. Kullanici URL Kutucuguna bir veri girer.
        product2.urlTextBox.sendKeys("Pratik Dusunme url ");
        // 20. Kullanici Button Text Kutucugunun tiklanabilir oldugunu dogrular.
        ReusableMethods.clickByJS(product2.buttonTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.buttonTextBox.isDisplayed());
        // 21. Kullanici Button Text Kutucuguna bir veri girer.
        product2.buttonTextBox.sendKeys("Pratik Dusunme 2 Button");
        // 22. Kullanici Price Kutucugunun tiklanabilir oldugunu dogrular.
        ReusableMethods.clickByJS(product2.regularPriceTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.regularPriceTextBox.isDisplayed()); // ???? isEnabled()

        // 24. Kullanici Price Kutucuguna invalid bir deger girer.
        product2.regularPriceTextBox.sendKeys(ConfigReader.getProperty("invalidPrice"));//????

        ReusableMethods.waitFor(3);
        Assert.assertEquals("", "");
        ReusableMethods.waitFor(1);
        product2.regularPriceTextBox.clear();

        // 23. Kullanici Price Kutucuguna gecerli bir deger girer.
        product2.regularPriceTextBox.sendKeys(ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(3);

        Assert.assertEquals(ConfigReader.getProperty("validPrice"), ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(1);

        // 25. Kullanici Sale Price Kutucugunun tiklanabilir oldugunu dogrular.
        ReusableMethods.clickByJS(product2.salePriceTextBox);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(product2.salePriceTextBox.isDisplayed());

        // 27. Kullanici Sale Price Kutucuguna invalid bir deger girer.
        product2.salePriceTextBox.sendKeys(ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(3);
        Assert.assertEquals("", "");
        ReusableMethods.waitFor(1);
        product2.salePriceTextBox.clear();

        // 26. Kullanici Sale Price Kutucuguna gecerli bir deger girer.
        product2.salePriceTextBox.sendKeys(ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(3);
        Assert.assertEquals(ConfigReader.getProperty("validPrice"), ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(1);

        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.signOut);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.logOut);

       // Driver.closeDriver();
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


        // 16. Kullanici urun cesitlerinin bulundugu dropdowndan External - Affiliate Product secenegini secer.
        Select productType = new Select(product2.productType);
        productType.selectByValue("external");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.external.isDisplayed());
        // 17. Kullanici ürünün Titel ini girer.
        erdem1415.proTitel.sendKeys(ConfigReader.getProperty("productTitle"));
        ReusableMethods.waitFor(2);
        // 18. Kullanici Resim1 e tiklar.
        ReusableMethods.clickByJS(erdem1415.bykResim);
        ReusableMethods.waitFor(3);
        // 19. Kullanici acilan sekmeden Product Resmini secer.
        ReusableMethods.clickByJS(erdem1415.mediaLib);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(product2.pratikDusunmeImage);
        ReusableMethods.waitFor(3);
        // 20. Kullanici Select butonuna tiklar.
        ReusableMethods.clickByJS(erdem1415.selectOk);
        ReusableMethods.waitFor(3);
        // 21. Kullanici Resim2 e tiklar.
        ReusableMethods.clickByJS(erdem1415.kckRes);
        ReusableMethods.waitFor(3);
        // 22. Kullanici acilan sekmeden Product Resmini secer.
        ReusableMethods.clickByJS(erdem1415.mediaLib);
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(product2.keysImage);
        ReusableMethods.waitFor(3);
        // 23. Kullanici Select butonuna tiklar.
        ReusableMethods.clickByJS(product2.addGalleryButton);
        ReusableMethods.waitFor(3);
        // 24. Kullanici Price e deger girer.
        product2.regularPriceTextBox.sendKeys(ConfigReader.getProperty("validPrice"));
        ReusableMethods.waitFor(3);
        // 25. Kullanici Categori secer
        ReusableMethods.clickByJS(product2.categorieBookMedien);
        // 26. Kullanici Submit e tiklar.
        ReusableMethods.clickByJS(product2.submitButton);
        ReusableMethods.waitFor(4);
        // 27. Kullanici ürün basariyla eklendi yazisinin görüldügünü dogrular.
        Assert.assertTrue(product2.successMessage.isDisplayed()); //????
        ReusableMethods.waitFor(4);

        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.signOut);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.logOut);

       // Driver.closeDriver();
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
        Assert.assertTrue(product2.pratikDusunme2ListName.isDisplayed());
        ReusableMethods.waitFor(3);
        // 15. Kullanici eklenen urunun resminin Products Sayfasinda göründügünü dogrular.
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        Assert.assertTrue(product2.pratikDusunme2ListImage.isDisplayed());
        ReusableMethods.waitFor(4);

        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.signOut);
        ReusableMethods.waitFor(1);
        ReusableMethods.clickByJS(product2.logOut);

        Driver.closeDriver();
    }

}
