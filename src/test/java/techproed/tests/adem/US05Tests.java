package techproed.tests.adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureAccountPage;
import techproed.pages.AllureToYouHomePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class US05Tests {
    @Test
    public void US05_TC01() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(allureAccountPage.myAccountText.isDisplayed());
    }

    @Test
    public void US05_TC02() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        allureAccountPage.displayNameBox.sendKeys(ConfigReader.getProperty("displayName"));

        allureAccountPage.rememberMeBox.click();

        allureAccountPage.singInButton.submit();

        allureAccountPage.accountDetailsButton.click();

        allureAccountPage.saveChangesButton.submit();

    }

    @Test
    public void US05_TC03() {

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        allureAccountPage.singInButton.submit();

        allureAccountPage.accountDetailsButton.click();

        Driver.getDriver().switchTo().frame(0);
        allureAccountPage.descriptionBox.clear();
        allureAccountPage.descriptionBox.sendKeys(ConfigReader.getProperty("description"));

        Driver.getDriver().switchTo().defaultContent();

        allureAccountPage.saveChangesButton.submit();

    }

    @Test
    public void US05_TC04(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage allureAccountPage = new AllureAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        allureAccountPage.singInButton.submit();

        allureAccountPage.accountDetailsButton.click();

        allureAccountPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        allureAccountPage.changePasswordButton.sendKeys(ConfigReader.getProperty("passwordNew"));
        allureAccountPage.confirmChangePasswordButton.sendKeys(ConfigReader.getProperty("passwordNew"));
        // Burada Password degisecegi icin diger testcaselerde sonica etki edebilir!
        allureAccountPage.saveChangesButton.submit();
        Assert.assertEquals(allureAccountPage.alertBox.getText(), "Account details changed successfully.");

    }

}