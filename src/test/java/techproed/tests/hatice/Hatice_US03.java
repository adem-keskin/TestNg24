package techproed.tests.hatice;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.pages.HomePageUS3;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;


import java.io.IOException;

@Listeners(techproed.utilities.Listeners.class)
public class Hatice_US03 {

    @Test
    public void pozitiveTestUS3TC1TC2() throws IOException, InterruptedException {

        ReusableMethods.loginSingIn();
        ReusableMethods.waitFor(2);
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage "));
        HomePageUS3 homePage3=new HomePageUS3();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.myAccount);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        ReusableMethods.waitFor(2);
        homePage3.phone.clear();
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage3.accountChangeMessage.getText(),"Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotFirstNameUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("negativefirstname"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        ReusableMethods.waitFor(2);
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage3.firstNameMessage.getText().contains("First name is a required field."));
        ReusableMethods.getScreenshot("NegativeFirstname");
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();

    }

    @Test
    public void negativeTestNotLastNameUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("negativelastname"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        homePage3.streetAddress.clear();
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Negative Lastname");
        Assert.assertTrue(homePage3.lastNameMessage.getText().contains("Last name is a required field."));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotStreetAddressUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        homePage3.streetAddress.clear();
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("negativeStreetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        ReusableMethods.getScreenshot("Negative StreetAddress");
        Assert.assertTrue(homePage3.streetAddressMessage.getText().contains("Street address is a required field."));
        ReusableMethods.waitFor(3);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotPostCodeUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        homePage3.streetAddress.clear();
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("negativePostCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        homePage3.phone.clear();
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        Assert.assertTrue(homePage3.postCodeMessage.getText().contains("Postcode / ZIP is a required field."));
        ReusableMethods.getScreenshot("Negative PostCode");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotTownCityUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        homePage3.streetAddress.clear();
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("negativeTownCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        homePage3.phone.clear();
        homePage3.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        Assert.assertTrue(homePage3.townCityMessage.getText().contains("Town / City is a required field."));
        ReusableMethods.getScreenshot("Negative TownCity");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotPhoneUS3() throws IOException {

        ReusableMethods.loginSingIn();
        Driver.getDriver().get(ConfigReader.getProperty("allureHomePage"));
        HomePageUS3 homePage3=new HomePageUS3();
        homePage3.myAccount.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.adresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.addButonu);
        homePage3.firstName.clear();
        homePage3.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage3.lastName.clear();
        homePage3.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select=new Select(homePage3.country);
        select.selectByVisibleText("Germany");
        homePage3.streetAddress.clear();
        homePage3.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage3.postCode.clear();
        homePage3.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage3.townCity.clear();
        homePage3.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        select=new Select(homePage3.state);
        select.selectByVisibleText("Bavaria");
        homePage3.phone.clear();
        homePage3.phone.sendKeys(ConfigReader.getProperty("negativePhone"));
        ReusableMethods.verifyElementDisplayed(homePage3.emailAddress);
        homePage3.saveAddressButonu.submit();
        Assert.assertTrue(homePage3.phoneMessage.getText().contains("Phone is a required field."));
        ReusableMethods.getScreenshot("Negative Phone");
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage3.logOut);
        Driver.closeDriver();
    }

}
