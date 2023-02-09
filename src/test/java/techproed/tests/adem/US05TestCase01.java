package techproed.tests.adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.MyAccountPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US05TestCase01 {

 @Test
    public void US05_TC01() throws InterruptedException {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();


        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        Thread.sleep(3000);

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(myAccountPage.myAccountText.isDisplayed());
        //Thread.sleep(2000);


        myAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));
        //Thread.sleep(2000);

        myAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        //Thread.sleep(2000);

        myAccountPage.singInButton.submit();
        //Thread.sleep(2000);


    }
}