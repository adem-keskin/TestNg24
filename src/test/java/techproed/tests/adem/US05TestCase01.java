package techproed.tests.adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.MyAccountPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US05TestCase01 {

    @Test
    public void US05_TC01() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(myAccountPage.myAccountText.isDisplayed());

        myAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        myAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        myAccountPage.singInButton.submit();

    }
}