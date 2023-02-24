package techproed.tests.erdem;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.Erdem1415;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import static techproed.utilities.Driver.driver;

public class US15 {
    @Test
    public void TC01() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        //TC01
        Assert.assertTrue(erdem1415.inventory.isDisplayed());
        Assert.assertTrue(erdem1415.seo.isDisplayed());
        Assert.assertTrue(erdem1415.atributes.isDisplayed());
        Assert.assertTrue(erdem1415.linked.isDisplayed());
        Assert.assertTrue(erdem1415.toptan.isDisplayed());
        Assert.assertTrue(erdem1415.advenced.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void TC02() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        //TC02-01
        erdem1415.inventory.click();
        erdem1415.sku.sendKeys(ConfigReader.getProperty("sku"));
        //TC02-02
        ReusableMethods.waitFor(2);
        erdem1415.mngStok.click();
        ReusableMethods.waitFor(2);
        erdem1415.stokQty.clear();
        ReusableMethods.waitFor(2);
        erdem1415.stokQty.sendKeys("3");
        ReusableMethods.waitFor(2);

        Select allowBack = new Select(erdem1415.allowBackorders);
        allowBack.selectByVisibleText("Allow");
        Assert.assertTrue(erdem1415.allowgör.isDisplayed());
        ReusableMethods.waitFor(2);
        //TC02-03
        erdem1415.mngStok.click();
        Select status = new Select(erdem1415.stokStatus);
        status.selectByVisibleText("In stock");
        String sectigimOption = status.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        Assert.assertTrue(sectigimOption.equals("In stock"));
        ReusableMethods.waitFor(2);

        //TC02-04
        erdem1415.soldInduvidalty.click();
        System.out.println(erdem1415.sku.getText());
        Assert.assertTrue(erdem1415.soldInduvidalty.isSelected());
        Driver.closeDriver();

    }

    @Test
    public void TC03() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        //TC03-01-02
        erdem1415.shipping.click();

        erdem1415.weigt.sendKeys("15a", Keys.TAB, "3oto", Keys.TAB, "4oto", Keys.TAB, "5oto");
        //TC03-03
        Select shipping = new Select(erdem1415.shippingClass);
        shipping.selectByIndex(0);
        String sectigimOption = shipping.getFirstSelectedOption().getText();
        System.out.println("SECTİGİM OPTİON : " + sectigimOption);
        //TC03-04
        Select proTime = new Select(erdem1415.procesTime);
        proTime.selectByIndex(1);
        String varsayilanText = proTime.getFirstSelectedOption().getText();
        Assert.assertEquals("1 business day", varsayilanText);
        Driver.closeDriver();
    }

    @Test
    public void TC04() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        //TC04-01
        erdem1415.atributes.click();
        erdem1415.colorClick.click();
        Assert.assertTrue(erdem1415.colorClick.isSelected());
        erdem1415.colorAddNew.click();
        driver.switchTo().alert().sendKeys("colordeneme3");
        ReusableMethods.waitFor(2);
        driver.switchTo().alert().accept();

        Select clrDD = new Select(erdem1415.colorDD);
        clrDD.selectByVisibleText("aaddd");
        String varsayilanText = clrDD.getFirstSelectedOption().getText();
        Assert.assertEquals("aaddd", varsayilanText);
        ReusableMethods.waitFor(2);
        driver.switchTo().alert().accept();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(erdem1415.colorSelectAll);
        //erdem1415.colorSelectAll.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(erdem1415.colorSelectNone);
        erdem1415.colorSelectNone.click();
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
    @Test
    public void TC0402() throws InterruptedException {
        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        //TC04-02
        erdem1415.atributes.click();
        erdem1415.sizeClick.click();
        //erdem1415.sizeAddNew.click();
        // driver.switchTo().alert().sendKeys("otosize");
        ReusableMethods.waitFor(2);
        //driver.switchTo().alert().accept();
        Select sizeDD = new Select(erdem1415.sizeDD);
        sizeDD.selectByVisibleText("otosize");
        String sizeText = sizeDD.getFirstSelectedOption().getText();
        Assert.assertEquals("otosize", sizeText);
        ReusableMethods.clickByJS(erdem1415.sizeSelectAll);
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.clickByJS(erdem1415.sizeSelectNone);
        //driver.switchTo().alert().accept();
        Driver.closeDriver();

    }

    @Test
    public void TC05() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        erdem1415.linked.click();
        erdem1415.upSells.click();
        Assert.assertTrue(erdem1415.upSells.isDisplayed());
        erdem1415.upSells.sendKeys("upsellsyazi", Keys.TAB, "crossSelsyazi");
        erdem1415.crossSells.click();
        Assert.assertTrue(erdem1415.crossSells.isDisplayed());
        //erdem1415.crossSells.sendKeys("crossSelsyaz");
        Driver.closeDriver();

    }

    @Test
    public void TC06() throws InterruptedException {


        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        //TC06-01
        erdem1415.seo.click();
        erdem1415.enterFocusKeyword.sendKeys("otoEnterFocusKex");
        //TC06-02
        erdem1415.metaDescrption.sendKeys("otoMetaDES");
        Driver.closeDriver();

    }

    @Test
    public void TC07() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();

        //TC07-01
        erdem1415.toptan.click();
        Select pType = new Select(erdem1415.pieceType);
        pType.selectByVisibleText("Carton");
        String varsayilanText = pType.getFirstSelectedOption().getText();
        Assert.assertEquals("Carton", varsayilanText);

        //TC07-02
        Assert.assertTrue(erdem1415.UnitsPerPiece.isDisplayed());
        erdem1415.UnitsPerPiece.clear();
        erdem1415.UnitsPerPiece.sendKeys("2");

        //TC07-03
        Assert.assertTrue(erdem1415.minOrderQuantity.isDisplayed());
        erdem1415.minOrderQuantity.clear();
        erdem1415.minOrderQuantity.sendKeys("3");
        Driver.closeDriver();
    }

    @Test
    public void TC08() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();
        ReusableMethods.addNew();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).perform();
        // TC08-01
        ReusableMethods.clickByJS(erdem1415.advenced);
        //erdem1415.enableRewiews.click();
        Assert.assertTrue(erdem1415.enableRewiews.isSelected());
        Assert.assertTrue(erdem1415.menuOrder.isDisplayed());
        erdem1415.menuOrder.sendKeys("1");
        //08-02
        Assert.assertTrue(erdem1415.purchasNote.isDisplayed());
        erdem1415.purchasNote.sendKeys("oto satin alma notu");
        Driver.closeDriver();

    }


    @Test
    public void TC06dogrulama() {
        Erdem1415 erdem1415 = new Erdem1415();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        ReusableMethods.waitFor(2);
        erdem1415.SignIn.click();
        ReusableMethods.waitFor(2);
        erdem1415.usernameBox.sendKeys(ConfigReader.getProperty("emailerdem"));
        erdem1415.passwordBox.sendKeys(ConfigReader.getProperty("passworderdem"));
        erdem1415.singInButton.submit();
        ReusableMethods.waitFor(2);
        erdem1415.myAcc.click();
        ReusableMethods.waitFor(2);
        erdem1415.storeManager.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        erdem1415.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.Baslik02.click();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        //erdemus1415.seo.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", erdem1415.seo);
        Assert.assertTrue(erdem1415.enterKeyDog.isDisplayed());
        Assert.assertTrue(erdem1415.metaDesDogrulama.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void TC07dogrulama() {
        Erdem1415 erdem1415 = new Erdem1415();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        ReusableMethods.waitFor(2);
        erdem1415.SignIn.click();
        ReusableMethods.waitFor(2);
        erdem1415.usernameBox.sendKeys(ConfigReader.getProperty("emailerdem"));
        erdem1415.passwordBox.sendKeys(ConfigReader.getProperty("passworderdem"));
        erdem1415.singInButton.submit();
        ReusableMethods.waitFor(2);
        erdem1415.myAcc.click();
        ReusableMethods.waitFor(2);
        erdem1415.storeManager.click();
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(1);
        erdem1415.products.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.Baslik02.click();
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN).perform();
        //TC07-02-03
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //erdemus1415.toptan.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", erdem1415.toptan);
        ReusableMethods.waitFor(3);
        Assert.assertTrue(erdem1415.ünitsperDog.isDisplayed());
        Assert.assertTrue(erdem1415.minOrdDog.isDisplayed());
        Driver.closeDriver();

    }
    @Test
    public void dogrulamalar15() throws InterruptedException {

        Erdem1415 erdem1415 = new Erdem1415();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        ReusableMethods.waitFor(2);
        erdem1415.SignIn.click();

        erdem1415.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));
        erdem1415.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));
        erdem1415.singInButton.submit();
        ReusableMethods.waitFor(2);
        // TC02-01-02
        erdem1415.search.sendKeys("Baslik02.04", Keys.ENTER);
        Assert.assertTrue(erdem1415.skuDog.isDisplayed());

        //TC03-01
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        erdem1415.specification.click();
        Assert.assertTrue(erdem1415.weigthDogru.isDisplayed());

        //TC03-02
        Assert.assertTrue(erdem1415.dimenDogru.isDisplayed());
        Driver.closeDriver();

    }
}
