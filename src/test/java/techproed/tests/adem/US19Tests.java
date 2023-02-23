package techproed.tests.adem;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureShoppingStore;
import techproed.pages.AllureToYouHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US19Tests {
    @Test
    public void US19_TC01(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();

        AllureAccountPage allureAccountPage = new AllureAccountPage();
        AllureShoppingStore allureShoppingStore = new AllureShoppingStore();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.signInButton.click();

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));

        allureAccountPage.rememberMeBox.click();

        allureToYouHomePage.singInTextButton.click();

        ReusableMethods.waitFor(3);

        allureShoppingStore.searchBox.sendKeys("Apple MacBook Pro 2015 | 13.3",Keys.ENTER);

    }

    @Test
    public void US19_TC02(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();
        AllureShoppingStore allureShoppingStore = new AllureShoppingStore();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();

        allureAccountPage.singInButton.submit();

        allureShoppingStore.searchBox.sendKeys("Apple MacBook Pro 2015 | 13.3",Keys.ENTER);

        allureAccountPage.addToCart.click();

        allureAccountPage.addToCartBox.click();

    }

    @Test
    public void US19_TC03(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));

        allureAccountPage.singInButton.click();

        allureAccountPage.addresses.click();

        allureAccountPage.adressEditing.click();

        allureAccountPage.saveAdress.submit();

    }

    @Test
    public void US19_TC04(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));

        allureAccountPage.singInButton.click();

        allureAccountPage.orders.click();

        allureAccountPage.viewButton.click();

        Assert.assertTrue(allureAccountPage.orderDetailText.isDisplayed());

    }

    @Test
    public void US19_TC05(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("vendorEmail"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("vendorPassword"));

        allureAccountPage.singInButton.click();

        ReusableMethods.waitFor(3);

        allureAccountPage.addToCartBox.click();

        allureAccountPage.checkOutBox.click();

        allureAccountPage.payAtTheDoor.submit();

        ReusableMethods.waitFor(5);

        allureAccountPage.placeOrderButton.click();
    }

}
