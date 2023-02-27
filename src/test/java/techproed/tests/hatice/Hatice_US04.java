package techproed.tests.hatice;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.pages.HomePageUS4;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;
import java.io.IOException;

@Listeners(techproed.utilities.Listeners.class)
public class Hatice_US04 {
    @Test
    public void pozitiveTestUS4TC1TC2() throws IOException, InterruptedException {

        ReusableMethods.loginSingIn();
        HomePageUS4 homePage4 = new HomePageUS4();
        homePage4.myAccount.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage4.adresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage4.addButonu);
        homePage4.firstName.clear();
        homePage4.firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        homePage4.lastName.clear();
        homePage4.lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        Select select = new Select(homePage4.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);
        homePage4.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress1"));
        homePage4.postCode.clear();
        homePage4.postCode.sendKeys(ConfigReader.getProperty("postCode1"));
        homePage4.townCity.clear();
        homePage4.townCity.sendKeys(ConfigReader.getProperty("townCity1"));
        select = new Select(homePage4.state);
        select.selectByVisibleText("Bavaria");
        homePage4.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage4.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("PozitifUS4");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotFirstNameUS4() throws IOException {
        ReusableMethods.loginSingIn();
        HomePageUS4 homePage4 = new HomePageUS4();
        homePage4.myAccount.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage4.adresses);
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(homePage4.addButonu);
        homePage4.firstName.clear();
        homePage4.firstName.sendKeys(ConfigReader.getProperty("negativefirstname"));
        homePage4.lastName.clear();
        homePage4.lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        Select select = new Select(homePage4.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);
        homePage4.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress1"));
        homePage4.postCode.clear();
        homePage4.postCode.sendKeys(ConfigReader.getProperty("postCode1"));
        homePage4.townCity.clear();
        homePage4.townCity.sendKeys(ConfigReader.getProperty("townCity1"));
        select = new Select(homePage4.state);
        select.selectByVisibleText("Bavaria");
        homePage4.saveAddressButonu.submit();
        ReusableMethods.getScreenshot("NegativeFirstname");
        Assert.assertTrue(homePage4.firstNameMessage.getText().contains("First name is a required field."));
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotLastNameUS4() throws IOException {
        ReusableMethods.loginSingIn();
        HomePageUS4 homePage4 = new HomePageUS4();
        homePage4.myAccount.click();
        ReusableMethods.clickByJS(homePage4.adresses);
        ReusableMethods.clickByJS(homePage4.addButonu);
        homePage4.firstName.clear();
        homePage4.firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        homePage4.lastName.clear();
        homePage4.lastName.sendKeys(ConfigReader.getProperty("negativelastname"));
        Select select = new Select(homePage4.country);
        select.selectByVisibleText("Germany");
        homePage4.streetAddress.clear();
        homePage4.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress1"));
        homePage4.postCode.clear();
        homePage4.postCode.sendKeys(ConfigReader.getProperty("postCode1"));
        homePage4.townCity.clear();
        homePage4.townCity.sendKeys(ConfigReader.getProperty("townCity1"));
        select = new Select(homePage4.state);
        select.selectByVisibleText("Bavaria");
        homePage4.saveAddressButonu.submit();
        ReusableMethods.getScreenshot("Negative Lastname");
        Assert.assertTrue(homePage4.lastNameMessage.getText().contains("Last name is a required field."));
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotStreetAddressUS4() throws IOException {
        ReusableMethods.loginSingIn();
        HomePageUS4 homePage4 = new HomePageUS4();
        homePage4.myAccount.click();
        ReusableMethods.clickByJS(homePage4.adresses);
        ReusableMethods.clickByJS(homePage4.addButonu);
        homePage4.firstName.clear();
        homePage4.firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        homePage4.lastName.clear();
        homePage4.lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        Select select = new Select(homePage4.country);
        select.selectByVisibleText("Germany");
        homePage4.streetAddress.clear();
        homePage4.streetAddress.sendKeys(ConfigReader.getProperty("negativeStreetAddress"));
        homePage4.postCode.clear();
        homePage4.postCode.sendKeys(ConfigReader.getProperty("postCode1"));
        homePage4.townCity.clear();
        homePage4.townCity.sendKeys(ConfigReader.getProperty("townCity1"));
        select = new Select(homePage4.state);
        select.selectByVisibleText("Bavaria");
        homePage4.saveAddressButonu.submit();
        ReusableMethods.getScreenshot("Negative StreetAddress");
        Assert.assertTrue(homePage4.streetAddressMessage.getText().contains("Street address is a required field."));
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotPostCodeUS4() throws IOException {
        ReusableMethods.loginSingIn();
        HomePageUS4 homePage4 = new HomePageUS4();
        homePage4.myAccount.click();
        ReusableMethods.clickByJS(homePage4.adresses);
        ReusableMethods.clickByJS(homePage4.addButonu);
        homePage4.firstName.clear();
        homePage4.firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        homePage4.lastName.clear();
        homePage4.lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        Select select = new Select(homePage4.country);
        select.selectByVisibleText("Germany");
        homePage4.streetAddress.clear();
        homePage4.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress1"));
        homePage4.postCode.clear();
        homePage4.postCode.sendKeys(ConfigReader.getProperty("negativePostCode"));
        homePage4.townCity.clear();
        homePage4.townCity.sendKeys(ConfigReader.getProperty("townCity1"));
        select = new Select(homePage4.state);
        select.selectByVisibleText("Bavaria");
        homePage4.saveAddressButonu.submit();
        Assert.assertTrue(homePage4.postCodeMessage.getText().contains("Postcode / ZIP is a required field."));
        ReusableMethods.getScreenshot("Negative PostCode");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void negativeTestNotTownCityUS3() throws IOException {
        ReusableMethods.loginSingIn();
        HomePageUS4 homePage = new HomePageUS4();
        homePage.myAccount.click();
        ReusableMethods.clickByJS(homePage.adresses);
        ReusableMethods.clickByJS(homePage.addButonu);
        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));
        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("negativeTownCity"));
        select = new Select(homePage.state);
        select.selectByVisibleText("Bavaria");
        homePage.saveAddressButonu.submit();
        Assert.assertTrue(homePage.townCityMessage.getText().contains("Town / City is a required field."));
        ReusableMethods.getScreenshot("Negative TownCity");
        Driver.closeDriver();
    }


}