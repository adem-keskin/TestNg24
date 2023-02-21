package techproed.tests.adem;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureShoppingStore;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.AllureAccountPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US19Test {
    @Test
    public void US19_TC01(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();
        AllureShoppingStore allureShoppingStore = new AllureShoppingStore();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(allureAccountPage.myAccountText.isDisplayed());

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendoremail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorpassword"));

        allureAccountPage.rememberMeBox.click();

        allureAccountPage.singInButton.submit();

        allureAccountPage.ordersButton.click();

        allureAccountPage.goShopButton.click();

        allureShoppingStore.searchBox.sendKeys(ConfigReader.getProperty("product"));        //TC1

        allureAccountPage.addToCart.click();
        

    }
}
