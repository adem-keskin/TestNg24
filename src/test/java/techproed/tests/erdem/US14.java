package techproed.tests.erdem;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Erdem1415;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;

import static techproed.utilities.Driver.driver;


public class US14 {

    @Test
    public void TC01() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        Assert.assertTrue(erdem1415.addProduckt.isDisplayed());
        //actions.sendKeys(Keys.ARROW_DOWN).perform();

        Select select = new Select(erdem1415.productTypeDD);
        List<WebElement> typeList = select.getOptions();

        for (WebElement w : typeList) {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
        }
        //BITTI

    }

    @Test
    public void TC02bykRes() throws InterruptedException {
        //TC02-01,TC02-02
        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        // String bykResimDosyaYolu = System.getProperty("C:\\Users\\hanno\\Desktop\\TestNGProje\\Screenshot_1.png");
        erdem1415.bykResim.click();
        erdem1415.selectFiles.click();
        ReusableMethods.uploadFilePath("C:\\Users\\hanno\\Desktop\\TestNGProje\\Screenshot_1.png");
        ReusableMethods.waitFor(3);
        erdem1415.selectOk.click();
        Assert.assertTrue(erdem1415.bykResGör.isDisplayed());




     /*
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.kckRes.click();
        //erdem1415.UploadFiles.click();
        erdem1415.selectFiles.click();
        ReusableMethods.uploadFilePath("C:\\Users\\hanno\\Desktop\\TestNGProje\\Screenshot_1.png");
        ReusableMethods.waitFor(3);
        erdem1415.selectOk.click();

      */

        //TC02-03,TC02,04

    }
    @Test
    public void TC02kckRes() throws InterruptedException {
        //TC02-01,TC02-02
        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.kckRes.click();
        erdem1415.mediaLib.click();
        erdem1415.kckResEkle.click();
        erdem1415.addToGalery.click();
        // Assert.assertTrue(erdem1415.kckResGör.isDisplayed());

        //BITTI

    }

    @Test
    public void TC03() throws InterruptedException {


        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //TC03-01
        erdem1415.proTitel.sendKeys(ConfigReader.getProperty("baslik"));
        ReusableMethods.waitFor(2);
        Assert.assertTrue(erdem1415.proTitel.isDisplayed());

        //TC03-02
        driver.switchTo().frame(0);
        erdem1415.shortDes.sendKeys(ConfigReader.getProperty("short"));
        Assert.assertTrue(erdem1415.shortDogrulama.isDisplayed());
        driver.switchTo().parentFrame();

        //TC03-03
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.switchTo().frame(1);
        erdem1415.des.sendKeys("des");
        Assert.assertTrue(erdem1415.desDogrulama.isDisplayed());
        System.out.println(erdem1415.desDogrulama.getText());

        //BITTI

    }

    @Test
    public void TC04() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(erdem1415.Categories.isDisplayed());
        System.out.println(erdem1415.Categories.getText());
        System.out.println(erdem1415.arabalarCategory.getText());
        Assert.assertTrue(erdem1415.arabalarCategory.isDisplayed());
        erdem1415.arabalarClick.click();
        Assert.assertTrue(erdem1415.arabalarClick.isSelected());

        //BITTI
    }

    @Test
    public void TC05() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //TC05-01
        erdem1415.addNewCateg.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.categoryName.sendKeys(ConfigReader.getProperty("catname"));
        Assert.assertTrue(erdem1415.CategoryNameGörünme.isDisplayed());

        //TC05-02
        Select select = new Select(erdem1415.parentCategDD);
        select.selectByVisibleText("New Arrivals");
        Assert.assertTrue(erdem1415.parentCategoryGörünme.isDisplayed());
        String sectigimOption = select.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        erdem1415.categoryAddButton.click();
        //Assert.assertTrue(erdem1415.eklenenCategoryGörünme.isDisplayed());

        //BITTI

    }

    @Test
    public void TC06() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        Assert.assertTrue(erdem1415.productBrands.isDisplayed());
        System.out.println(erdem1415.productBrands.getText());
        System.out.println(erdem1415.ackBrands.getText());
        Assert.assertTrue(erdem1415.ackBrands.isDisplayed());
        erdem1415.ackBrands.click();
        Assert.assertTrue(erdem1415.ackBrands.isSelected());
        //BITTI
    }

    @Test
    public void TC07() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //TC07-01
        erdem1415.addNewProductBrandsButton.click();
        erdem1415.productBrandsNameBox.sendKeys(ConfigReader.getProperty("brandsname"));

        //TV07-02
        Select select = new Select(erdem1415.parentTaxonomiDD);
        select.selectByVisibleText("Green Grass");
        String sectigimOption = select.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        erdem1415.bransAddButton.click();
        //driver.switchTo().alert().accept();

        //BTTI ASAGIDA AYRICA DUGRULAMA YAPTIM
    }

    @Test
    public void TC08() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //TC08-01
        erdem1415.tagsBox.sendKeys("otomasyonTag1");
        //TC08-02
        erdem1415.tagsChooseButton.click();
        erdem1415.hazirTags.click();
        System.out.println(erdem1415.tagsBox.getText());
        Assert.assertTrue(erdem1415.tagsBox.isDisplayed());
        //BTTI ASAGIDA AYRICA DUGRULAMA YAPTIM
    }

    @Test
    public void TC09() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        //TC09
        Select select = new Select(erdem1415.categoryVisibiityDD);
        List<WebElement> catevisblty = select.getOptions();
        for (WebElement w : catevisblty) {
            System.out.println(w.getText());
            w.click();
            Assert.assertTrue(w.isDisplayed());

        }
        //BITTI
    }

    @Test

    public void Dogrulamalar14() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        ReusableMethods.waitFor(2);
        erdem1415.SignIn.click();
        erdem1415.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));
        erdem1415.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));
        erdem1415.singInButton.submit();
        ReusableMethods.waitFor(2);
        //TC03-01
        erdem1415.search.sendKeys("Baslik02.04",Keys.ENTER);
        // TC07,TC08
        Assert.assertTrue(erdem1415.brandsgör.isDisplayed());
        Assert.assertTrue(erdem1415.tagsGör.isDisplayed());
        System.out.println(erdem1415.brandsgör.getText());
        System.out.println(erdem1415.tagsGör.getText());

    }
}




