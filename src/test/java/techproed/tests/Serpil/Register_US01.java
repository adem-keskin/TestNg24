package techproed.tests.Serpil;

import com.fasterxml.jackson.core.JsonpCharacterEscapes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.US01_Register;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.security.Key;

public class Register_US01 {


    US01_Register register = new US01_Register();
    Actions actions = new Actions(Driver.getDriver());


    @Test
    public void test_TC01() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        // String expectedUrl1="https://allure2you.com/"; bu sekılde de olur
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        //3-Kullanici sag ust kosede Register butonuna tiklar
        register.registerButton.click();

        //4-Kullanici SIGN UP sayfasinin acildigini dogrular
        ReusableMethods.waitFor(2);
        Assert.assertTrue(register.signUpYaziElementi.isDisplayed());

        //5-Kullanici username textbox'i bos birakir

        ReusableMethods.waitFor(3);
        register.usernameTexBox.click();

        register.usernameTexBox.sendKeys(Keys.TAB);
        ReusableMethods.waitFor(2);

        //6-Kullanici sign up buttonuna tiklar
        register.signUpButton.click();


        //7-Kullanici "Fülle dieses Feld aus" yazisini gordugunu dogrular
        // String massage= register
        //  register.registerButton.getAttribute("ValidationMassage");
        //  Assert.assertEquals(message "Fülle dieses Feld aus");


    }

    @Test
    public void test_TC02() {

        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

        ReusableMethods.waitFor(4);
        //3-Kullanici sag ust kosede Register butonuna tiklar
        register.registerButton.click();

        //4-Kullanici Username texbox'a gecerli bir Username girer
        register.usernameTexBox.sendKeys("hallo54");
        //5-Kullanici e-mail textbox bos birakir
        actions.sendKeys(Keys.TAB).perform();

        //6-Kullanici "Fülle dieses Feld aus" yazisini gordugunu dogrular
        //  register.getAttribute("ValidationMassage");


    }

    @Test
    public void test_TC03() {
        //1- Kullanici url 'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // 2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");
        //3-Kullanici sag ust kosede Register butonuna tiklar
        register.registerButton.click();
        // 4-Kullanici Username texbox'a gecerli bir Username girer
        register.usernameTexBox.sendKeys("hello", Keys.ENTER);
        // 5-Kullanici E-mail textbox'a valid e-mail girer
        register.emailTextBox.sendKeys("hellohello12@gmail.com");
        // 6-Kullanici Password texbox'i bos birakir

        //  7-Kullanici "Fülle dieses Feld aus" yazisini gordugunu dogrular
        // register.registerButton.getAttribute("ValidationMassage");


    }

  @Test
  public void test_TC04() {


    //1- Kullanici url 'e gider
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    //2- Kullanici anasayfaya geldigini dogrulamali
    String actualUrl = Driver.getDriver().getCurrentUrl();
    String expectedUrl = ConfigReader.getProperty("url");
    Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");

    //3-Kullanici sag ust kosede Register butonuna tiklar
    register.registerButton.click();
    //4-Kullanici Username texbox'a gecerli bir Username girer
    register.usernameTexBox.sendKeys("hello",Keys.ENTER);
    //5-Kullanici E-mail textbox'a valide e-mail girer
      register.emailTextBox.sendKeys("hellohello12@gmail.com");
    //6-Kullanici "I agree to the privacy policy buttonu secilmemeli
    actions.sendKeys(Keys.TAB);


    //7-Kullanici "Klicke dieses Kätchen wenn du fortfahren möchtest" yazisini gordugunu dogrula
    ReusableMethods.waitFor(1);
    register.signUpButton.click();

     Assert.assertFalse(register.IAgreeButton.isSelected(),"Kutucuk secıldı");

}


    @Test
    public void test_US05() {
        //  1- Kullanici url 'e gider
        Driver.getDriver().

                get(ConfigReader.getProperty("url"));
        //2- Kullanici anasayfaya geldigini dogrulamali
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");
        Assert.assertEquals(actualUrl, expectedUrl, "URL uyusmuyor");
        //3-Kullanici sag ust kosede Register butonuna tiklar
        register.registerButton.click();
        //4-Kullanici Username texbox'a gecerli bir Username girer
        register.usernameTexBox.sendKeys("hello_3");
        //5-Kullanici E-mail textbox'a valid e-mail girer
        register.emailTextBox.sendKeys("hello_711@gmail.com");
        //6-Kullanici Password textbox'a Password girer
        register.emailTextBox.sendKeys("teamSelenium24");
        //7- Kullanici "I agree to the privacy policy buttonu secmeli
        register.IAgreeButton.click();
        //8-Kullanici sign up buttonuna tiklar
        register.signUpButton.click();
        //9-Kullanici basarili giris yaptigini dogrular
        Assert.assertTrue(register.basariliGirisYaziElementi.isDisplayed());
        System.out.println(register.basariliGirisYaziElementi.getText());



    }
}