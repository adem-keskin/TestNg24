package techproed.tests.ugur;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.US_07Compare;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;


public class US_07CompareTest {
    /*
    1-Kullanici,allure2you.com sayfasina gider
    2-Kullanici arama kutusunua tiklar
    3-Kullanici aramak istedigi urunu arama kutusuna yazar
    4-Kullanici arama butonunu tiklar
    5-Kullanici,urun sayfasindaki karsilastirma butonuna tiklar
    6-Kullanici,karsilastirmak icin  en fazla 4 urun secer
    7-Kullanici acilan bolumde START COMPARE butonunu tiklar
    6-Kullanici secilen urunlerden istedigini silip yeni urunler ekler
    */


    @Test
    public void compareTest() throws InterruptedException {

        US_07Compare us07Compare = new US_07Compare();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        us07Compare.searchBox.sendKeys("Samsung Galaxy S23 Ultra 512 GB Krem", Keys.ENTER);
        us07Compare.compareButton.click();

        us07Compare.searchBox.sendKeys("Samsung Galaxy S23 Ultra 512 GB Yeşil", Keys.ENTER);
        us07Compare.compareButton.click();

        us07Compare.searchBox.sendKeys("Multi Functional Apple iPhone", Keys.ENTER);
        us07Compare.compareButton.click();

        us07Compare.searchBox.sendKeys("iPhone 12, 64GB, Black", Keys.ENTER);
        us07Compare.compareButton.click();

        Thread.sleep(3000);

        us07Compare.startCompareButton.click();

        Thread.sleep(2000);

        Assert.assertTrue(us07Compare.comparePage.isDisplayed());

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);

        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(5000);

        us07Compare.firstDelete.click();
        Thread.sleep(3000);

        us07Compare.secondDelete.click();
        Thread.sleep(3000);
        us07Compare.thirdDelete.click();
        Thread.sleep(3000);
        us07Compare.fourthDelete.click();
        Thread.sleep(2000);
        Assert.assertTrue(us07Compare.emptyComparePage.isDisplayed());


        us07Compare.searchBox.sendKeys(" Lc Waikiki", Keys.ENTER);
        us07Compare.compareButton.click();
        Thread.sleep(3000);

        us07Compare.searchBox.sendKeys("Johnny Silverhand Hoodie", Keys.ENTER);
        us07Compare.compareButton.click();
        Thread.sleep(3000);

        us07Compare.searchBox.sendKeys(" Sport Women’s Wear", Keys.ENTER);
        us07Compare.compareButton.click();
        Thread.sleep(3000);

        us07Compare.searchBox.sendKeys("Coat Pool Comfort Jacket", Keys.ENTER);
        us07Compare.compareButton.click();
        Thread.sleep(3000);

        us07Compare.startCompareButton.click();

        Thread.sleep(2000);

        Assert.assertTrue(us07Compare.comparePage.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);
        Driver.closeDriver();

    }
}
