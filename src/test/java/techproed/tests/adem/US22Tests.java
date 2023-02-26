package techproed.tests.adem;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US22Tests {

    @Test
    public void US22_TC01() {
        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();

        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.signInButton.click();

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));

        allureToYouHomePage.singInTextButton.click();

        ReusableMethods.waitFor(3);

        allureAccountPage.searchBox.sendKeys("Apple MacBook Pro 2015 | 13.3", Keys.ENTER);

        allureAccountPage.addToCart.click();

        allureAccountPage.addToCartBox.click();

        allureAccountPage.checkOutBox.click();

        ReusableMethods.waitFor(5);

        allureAccountPage.enterYourCodeOption.click();

        allureAccountPage.couponCodeBox.sendKeys("IJK23VSX89", Keys.ENTER);

        allureAccountPage.placeOrderButton.submit();

        Assert.assertTrue(allureAccountPage.shoppingEndeText.isDisplayed());


    }
}
