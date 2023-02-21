package techproed.tests.adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.AllureAccountPage_a;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US05Test {
    @Test
    public void US05_TC01(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        AllureAccountPage_a allureAccountPage = new AllureAccountPage_a();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(allureAccountPage.myAccountText.isDisplayed());

        allureAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        allureAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        allureAccountPage.rememberMeBox.click();

        allureAccountPage.singInButton.submit();

        allureAccountPage.accountDetailsButton.click();

        allureAccountPage.firstNameBox.clear();
        allureAccountPage.firstNameBox.sendKeys(ConfigReader.getProperty("firstName"));
        allureAccountPage.lastNameBox.clear();
        allureAccountPage.lastNameBox.sendKeys(ConfigReader.getProperty("lastName"));


        allureAccountPage.displayNameBox.clear();

        allureAccountPage.displayNameBox.sendKeys(ConfigReader.getProperty("displayName"));

        allureAccountPage.emailBox.clear();
        allureAccountPage.emailBox.sendKeys(ConfigReader.getProperty("email"));


        Driver.getDriver().switchTo().frame(0);
        allureAccountPage.descriptionBox.clear();
        allureAccountPage.descriptionBox.sendKeys(ConfigReader.getProperty("description"));

        Driver.getDriver().switchTo().defaultContent();

        allureAccountPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        allureAccountPage.changePasswordButton.sendKeys(ConfigReader.getProperty("password2"));
        allureAccountPage.confirmChangePasswordButton.sendKeys(ConfigReader.getProperty("password2"));

        allureAccountPage.saveChangesButton.submit();
        Assert.assertEquals(allureAccountPage.alertBox.getText(), "Account details changed successfully.");
        ReusableMethods.waitFor(3);

    }
}