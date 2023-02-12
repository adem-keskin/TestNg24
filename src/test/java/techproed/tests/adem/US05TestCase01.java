package techproed.tests.adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.AllureToYouHomePage;
import techproed.pages.MyAccountPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class US05TestCase01 {
    @Test
    public void US05_TC01(){

        AllureToYouHomePage allureToYouHomePage = new AllureToYouHomePage();
        MyAccountPage myAccountPage = new MyAccountPage();

        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));

        allureToYouHomePage.myAccountButton.click();
        Assert.assertTrue(myAccountPage.myAccountText.isDisplayed());

        myAccountPage.usernameBox.sendKeys(ConfigReader.getProperty("email"));

        myAccountPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));

        myAccountPage.rememberMeBox.click();

        myAccountPage.singInButton.submit();

        myAccountPage.accountDetailsButton.click();

        myAccountPage.firstNameBox.clear();
        myAccountPage.firstNameBox.sendKeys(ConfigReader.getProperty("firstName"));
        myAccountPage.lastNameBox.clear();
        myAccountPage.lastNameBox.sendKeys(ConfigReader.getProperty("lastName"));


        myAccountPage.displayNameBox.clear();

        myAccountPage.displayNameBox.sendKeys(ConfigReader.getProperty("displayName"));

        myAccountPage.emailBox.clear();
        myAccountPage.emailBox.sendKeys(ConfigReader.getProperty("email"));


        Driver.getDriver().switchTo().frame(0);
        myAccountPage.descriptionBox.clear();
        myAccountPage.descriptionBox.sendKeys(ConfigReader.getProperty("description"));

        Driver.getDriver().switchTo().defaultContent();

        myAccountPage.currentPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.changePasswordButton.sendKeys(ConfigReader.getProperty("password2"));
        myAccountPage.confirmChangePasswordButton.sendKeys(ConfigReader.getProperty("password2"));

        myAccountPage.saveChangesButton.submit();
        Assert.assertEquals(myAccountPage.alertBox.getText(), "Account details changed successfully.");
        ReusableMethods.waitFor(3);

        myAccountPage.singInButton.submit();


    }
}