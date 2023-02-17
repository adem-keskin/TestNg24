package techproed.utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import techproed.pages.MedineProductsPage01;
import techproed.pages.MedineStoreManagerPage01;

public class MedineReusable {


    /*
    SIGN IN
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
    public static void signIn() {
        MedineProductsPage01 product = new MedineProductsPage01();
        Actions actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Allure2You"));
        product.signInButton.click();
        Assert.assertTrue(product.signInPage.isDisplayed());
        product.signInUsername.sendKeys("testngteam24@yahoo.com", Keys.TAB);
        product.signInPassword.sendKeys("qateam2424", Keys.ENTER);
        ReusableMethods.waitFor(3);
        product.myAccountButton.click();
        Assert.assertTrue(product.helloText.isDisplayed());


    }

    /*
    STORE MANAGER-PRODUCTS
    10. Kullanici Dashboard da bulunan menuden Store Manager butonuna tiklar.
    11. Kullanici Store Manager sayfasinda oldugunu dogrular.
    12. Kullanici soldaki menuden Product yazisina tiklar .
    13. Kullanici Product sayfasinda oldugunu dogrular.
     */
    public static void storeManager() {
        MedineStoreManagerPage01 product2 = new MedineStoreManagerPage01();
        Actions actions = new Actions(Driver.getDriver());
        product2.storeManagerButton.click();
        Assert.assertTrue(product2.storeManagerText.isDisplayed());
        product2.productsButton.click();
        Assert.assertTrue(product2.productsText.isDisplayed());

    }

    /*
    ADD NEW-ADD PRODUCT
    14. Kullanici Add New butonuna tiklar.
    15. Kullanici Add Product sayfasinda oldugunu dogrular.
     */
    public static void addNewProduct() {
        MedineStoreManagerPage01 product2 = new MedineStoreManagerPage01();
        Actions actions = new Actions(Driver.getDriver());
        product2.addNewProductDashboardButton.click();
        Assert.assertTrue(product2.addProductText.isDisplayed());

    }
}
