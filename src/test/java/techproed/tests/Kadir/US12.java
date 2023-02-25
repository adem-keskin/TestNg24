package techproed.tests.Kadir;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePageUS12;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class US12 {
    @Test
    public void pozitiveFullTestUS12TC1() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);

        ;
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test
    public void pozitiveBosCompanyTestUS12TC2() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);

        ;
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);

        Driver.closeDriver();
    }

    @Test
    public void pozitiveBosApartmentUS12TC3() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);

        ;
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertEquals(homePage.accountChangeMessage.getText(), "Address changed successfully.");
        ReusableMethods.getScreenshot("Pozitif");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();



    }
    @Test
    public void negativeBosFirstNameTestUS12TC4() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);

        ;
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.firstNameMessage.getText().contains("First name is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("BosFirstname");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test
    public void negativeBosLastNameTestUS12TC5() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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

        //  homePage.apartman.clear();
        //  homePage.apartman.sendKeys(ConfigReader.getProperty("apartman"));
        // ReusableMethods.waitFor(2);

        homePage.townCity.clear();
        homePage.townCity.sendKeys(ConfigReader.getProperty("townCity"));
        ReusableMethods.waitFor(2);

        homePage.postCode.clear();
        homePage.postCode.sendKeys(ConfigReader.getProperty("postCode"));
        ReusableMethods.waitFor(2);


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);
        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.lastNameMessage.getText().contains("Last name is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("BosLastname");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test
    public void negativeBosStreetTestUS12TC6() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.streetAddressMessage.getText().contains("Street address is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("BosStreet");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }


    @Test
    public void negativeBosPostCodeTestUS12TC7() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.postCodeMessage.getText().contains("Postcode / ZIP is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("BosPostCode");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }


    @Test
    public void negativeBosTownCityTestUS12TC8() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.townCityMessage.getText().contains("Town / City is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("bosTownCity");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test
    public void negativeBosPhoneTestUS12TC9() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("bosPhone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.phoneMessage.getText().contains("Phone is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("bosPhone");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test
    public void negativeBosEmailTestUS12TC10() throws IOException, InterruptedException {
        techproed.utilities.ReusableMethods.loginSingIn1("testngteam24@yahoo.com", "qateam2424");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePageUS12 homePage = new HomePageUS12();
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


        homePage.phone.clear();
        homePage.phone.sendKeys(ConfigReader.getProperty("Phone"));
        ReusableMethods.waitFor(2);


        Select select1 = new Select(homePage.state);
        select1.selectByVisibleText("Bremen");
        ReusableMethods.waitFor(2);


        ReusableMethods.verifyElementDisplayed(homePage.emailAddress);
        homePage.emailAddress.clear();


        homePage.saveAddressButonu.submit();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(homePage.townCityMessage.getText().contains("Email address is a required field."));
        Driver.closeDriver();
        ReusableMethods.getScreenshot("bosEmail");
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

}
