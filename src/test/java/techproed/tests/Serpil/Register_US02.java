package techproed.tests.Serpil;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.US01_Register;
import techproed.pages.US02_Register;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class Register_US02 {


    US01_Register register1 = new US01_Register();

    US02_Register register2 = new US02_Register();


    @Test
    public void test_TC01() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        //3-Kullanici username textbox'a  daha once kaydettigi Username'i girer
        register1.registerButton.click();
        ReusableMethods.waitFor(1);
        register1.usernameTexBox.sendKeys("hello_12", Keys.ENTER);

        //4-Kullanici  Email textbox'a  valid  Email adresi girer
        register1.emailTextBox.sendKeys("hello_711@gmail.com");
        //5-Kullanici Password textbox'a  valid  Password  girer
        register1.passwordTextBox.sendKeys("teamSelenium24");
        //6- Kullanici "I agree to the privacy policy buttonu secmeli
        register1.IAgreeButton.click();
        //7-Kullanici sign up buttonuna tiklar
        register1.signUpButton.click();

        //8-Kullanici  An account is already registered with that username.
        // yazisinin oldugunu dogrular

        ReusableMethods.waitFor(1);
        Assert.assertTrue(register2.yanlisUsernameYaziElementi.isDisplayed());

        ReusableMethods.waitFor(2);

    }


    @Test
    public void test_TC02() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        ReusableMethods.waitFor(2);

        //3-Kullanici Username text box'a valid Username girer
        register1.registerButton.click();
        ReusableMethods.waitFor(1);
        register1.usernameTexBox.sendKeys("hello", Keys.ENTER);
        //4-Kullanici Email textbox'a daha once kaydettigi Email adressi girer
        register1.emailTextBox.sendKeys("hello_711@gmail.com");
        //5-Kullanici Password textbox'a valid Password girer
        register1.passwordTextBox.sendKeys("teamSelenium24");
        //6- Kullanici "I agree to the privacy policy buttonu secmeli
        register1.IAgreeButton.click();
        //7-Kullanici sign up buttonuna tiklar
        register1.signUpButton.click();

        //8-Kullanici "An account is already registered with your email address.
        // Please log in."  yazisini gordugunu dogrular
        Assert.assertTrue(register2.AnAccYaziElementi.isDisplayed());
        System.out.println(register2.AnAccYaziElementi.getText());

    }

    @Test
    public void test_TC03() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        //3-Kullanici Username text box'a valid Username girer
        register1.registerButton.click();
        ReusableMethods.waitFor(1);
        register1.usernameTexBox.sendKeys("hello", Keys.ENTER);

        //4-Kullanici Email textbox'a valid Email adressi girer
        register1.emailTextBox.sendKeys("hello_711@gmail.com");

        //5-Kullanici password textbox'a daha once kaydettigi Passwordu girer
        register1.passwordTextBox.sendKeys("teamSelenium24");

        //6- Kullanici "I agree to the privacy policy buttonu secmeli
        register1.IAgreeButton.click();

        //7-Kullanici sign up buttonuna tiklar
        register1.signUpButton.click();

        //8-Kullanici daha once kayitli Password'i girdiginde herhangi bir hata almamaktadir


    }


    @Test
    public void test_TC04() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        //3-Kullanici Username text box'a valid Username girer
        register1.registerButton.click();
        ReusableMethods.waitFor(1);
        register1.usernameTexBox.sendKeys("hello", Keys.ENTER);

         //4-Kullanici Email textbox'a daha once kaydettigi Email adressi girer
        register1.emailTextBox.sendKeys("hello_711@gmail.com");

        //5-Kullanici password textbox'a daha once kaydettigi Passwordu girer
        register1.passwordTextBox.sendKeys("teamSelenium24");

        //6- Kullanici "I agree to the privacy policy buttonu secmeli
        register1.IAgreeButton.click();

        //7-Kullanici sign up buttonuna tiklar
        register1.signUpButton.click();
    }

    @Test
    public void test_TC05() {
        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        //3-Kullanici Username text box'a valid Username girer
        register1.registerButton.click();
        ReusableMethods.waitFor(1);
        register1.usernameTexBox.sendKeys("hello", Keys.ENTER);

        //4-Kullanici Email textbox'a daha once kaydettigi Email adressi girer
        register1.emailTextBox.sendKeys("hello_711@gmail.com");

        //5-Kullanici password textbox'a daha once kaydettigi Passwordu girer
        register1.passwordTextBox.sendKeys("teamSelenium24");

        //6- Kullanici "I agree to the privacy policy buttonu secmeli
        register1.IAgreeButton.click();

        //7-Kullanici sign up buttonuna tiklar
        register1.signUpButton.click();

        //8-Kullanici "An account is already registered with your email address." uyari yazisini gordugunu dogrular
        Assert.assertTrue(register2.AnAccYaziElementi.isDisplayed());
        System.out.println(register2.AnAccYaziElementi.getText());

    }
}