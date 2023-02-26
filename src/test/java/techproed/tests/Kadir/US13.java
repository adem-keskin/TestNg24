package techproed.tests.Kadir;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePageUS13;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class US13 {

    @Test
    public void pozitiveFullTestUS13TC1() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }

    @Test
    public void pozitiveBosCompanyTestUS13TC2() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("boscompanyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }


    @Test
    public void pozitiveBosApartmanTestUS13TC3() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("bosApartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();



    }

    @Test
    public void negativeBosFirstNameTestUS13TC4() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions
                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("bosfirstname"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.firstNameMessage.getText(), "First name is a required field.");
        ReusableMethods.getScreenshot("bosfirstname");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }

    @Test
    public void negativeBosLastNameTestUS13TC5() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions
                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("boslastname"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.lastNameMessage.getText(), "Last name is a required field.");
        ReusableMethods.getScreenshot("boslastname");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void negativeBosStreetTestUS13TC6() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions
                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("bosStreetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.streetAddressMessage.getText(), "Street address is a required field.");
        ReusableMethods.getScreenshot("bosStreetAddress");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }


    @Test
    public void negativeBosPostCodeTestUS13TC7() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("bosPostCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);

        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.postCodeMessage.getText(), "Postcode / ZIP is a required field.");
        ReusableMethods.getScreenshot("bosPostCode");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }

    @Test
    public void negativeBosTownCityTestUS13TC8() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS13 homePage = new HomePageUS13();
        homePage.myAccount.click();
        techproed.utilities.ReusableMethods.waitFor(2);


        homePage.adresses.click();
        ReusableMethods.waitFor(2);

        Actions actions = new Actions(Driver.getDriver());

        actions

                .sendKeys(Keys.PAGE_DOWN).perform();


        homePage.addButonu.click();
        ReusableMethods.waitFor(2);


        //  ReusableMethods.clickByJS(homePage.adresses);
        // ReusableMethods.waitFor(2);

        // ReusableMethods.clickByJS(homePage.addButonu);
        //   ReusableMethods.waitFor(2);


        homePage.firstName.clear();
        homePage.firstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitFor(2);

        homePage.lastName.clear();
        homePage.lastName.sendKeys(ConfigReader.getProperty("lastName"));


        homePage.companyName.clear();
        homePage.companyName.sendKeys(ConfigReader.getProperty("companyName"));
        ReusableMethods.waitFor(2);

        Select select = new Select(homePage.country);
        select.selectByVisibleText("Germany");
        ReusableMethods.waitFor(2);

        homePage.streetAddress.clear();
        homePage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        ReusableMethods.waitFor(2);

        homePage.apartment.clear();
        homePage.apartment.sendKeys(ConfigReader.getProperty("apartment"));
        ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("bosTownCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);

        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.townCityMessage.getText(), "Town / City is a required field.");
        ReusableMethods.getScreenshot("bosTownCity");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }


}
