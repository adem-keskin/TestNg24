package techproed.tests.medine;

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

public class US17_TC01 {

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
        16. Kullanici urun cesitlerinin buludugu dropdowndan Variable Product secenegini oldugunu dogrular.
        17. Kullanici Variable Product u seçer.
        18. Kullanici Variable Product un seçili oldugunu dogrular.
         */
        Select productType = new Select(product2.productType);
        Assert.assertTrue(productType.getOptions().contains(product2.variable));
        productType.selectByValue("variable");
        ReusableMethods.waitFor(2);
        Assert.assertTrue(product2.variable.isDisplayed());

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


    // 16. Kullanici Variable Product secenegini secer.
        Select productType = new Select(product2.productType);
        productType.selectByValue("variable");

    // 17. Kullanici Product Title kismina veri girer.
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

    // 24. Kullanici Categori secer.
        ReusableMethods.clickByJS(product2.categorieBookMedien);
    // 25. Kullanici Submit e tiklar.
        ReusableMethods.clickByJS(product2.submitButton);
        ReusableMethods.waitFor(3);
    // 26. Kullanici ürün basariyla eklendi yazisini dogrular.
        Assert.assertTrue(product2.successMessage.isDisplayed()); //????
        ReusableMethods.waitFor(3);


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
    */
        ReusableMethods.medineStoreManager();
        ReusableMethods.waitFor(3);
    /*
    15. Kullanici Product Listesinden bir ürün secer.
    16. Kullanici secilen ürünün göründügünü dogrular.
    17. Kullanici sayfanin sol alt kisminda bulunan Attributes menüsüne tiklar.
    18. Kullanici Color butonununa tiklar.
    19. Kullanici Color dropdownunda bulunan renklerden birini secer.
    20. Kullanici Color alaninda tikladigi rengin göründügünü dogrular.
    21. Kullanici Size butonununa tiklar.
    22. Kullanici Size dropdownunda bulunan sizelardan birini secer.
    23. Kullanici Size alaninda tikladigi size in göründügünü dogrular.
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
//Driver.getDriver().switchTo().alert().sendKeys("sari");
    /*
    15. Kullanici Product Listesinden bir ürün secer.
    16. Kullanici secilen ürünün göründügünü dogrular.
    17. Kullanici sayfanin sol alt kisminda bulunan Attributes menüsüne tiklar.
    18. Kullanici Color butonununa tiklar.
    19. Kullanici ADD NEW butonununa tiklar.
    20. Kullanici acilan Allert kutucuguna yeni color u girer.

    21. Kullanici OK butonuna tiklar.
    22. Kullanici Color alaninda girilen rengin göründügünü dogrular.
    23. Kullanici Size butonununa tiklar.
    24. Kullanici ADD NEW butonununa tiklar.
    25. Kullanici acilan Allert kutucuguna yeni size i girer.
    26. Kullanici OK butonuna tiklar.
    27. Kullanici Size alaninda girilen size in göründügünü dogrular.
    28. Kullanici Submit e tiklar.
    29. Kullanici Variations a tiklar.
    30. Kullanici Color dropdownunda eklenen yeni color un gorundugunu dogrular.
    31. Kullanici Size dropdownunda eklenen yeni color un gorundugunu dogrular.
     */


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
        ReusableMethods.waitFor(3);

    /*
    15. Kullanici Product Listesinden bir ürün secer.
    16. Kullanici secilen ürünün göründügünü dogrular.
    17. Kullanici sayfanin sol alt kisminda bulunan Attributes menüsüne tiklar.
    18. Kullanici Color butonununa tiklar.
    19. Kullanici Color dropdownunda bulunan renklerden birini secer.
    20. Kullanici Color alaninda tikladigi rengin göründügünü dogrular.
    21. Kullanici Color un üzerindeki Active kutucugunu aktif hale getirir.
    22. Kullanici Size butonununa tiklar.
    23. Kullanici Size dropdownunda bulunan sizelardan birini secer.
    24. Kullanici Size alaninda tikladigi size in göründügünü dogrular.
    25. Kullanici Size un üzerindeki Active kutucugunu aktif hale getirir.
    26. Kullanici Submit e tiklar.
    27. Kullanici View e tiklar.
    28. Kullanici acilan Yeni sayfada Specification menüsüne tiklar.
    29. Kullanici secilen colorun gorundugunu dogrular.
    30. Kullanici secilen size in gorundugunu dogrular.
     */


        Driver.closeDriver();
    }


    @Test
    public void test06() {


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
        Assert.assertTrue(product2.pratikDusunme2ListImage.isDisplayed());
        ReusableMethods.waitFor(3);


        Driver.closeDriver();

    }


}
