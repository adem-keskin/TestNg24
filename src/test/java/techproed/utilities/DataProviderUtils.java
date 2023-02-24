package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {
    @DataProvider
    public Object[][] musteriVerileri(){
        Object [][] musteriGirisBilgileri = {
                {"menejer1","12345","istanbul"},
                {"menejer2","98765","izmir"},
                {"mejejer3","5678","Denizli"}
        };
        return musteriGirisBilgileri;
    }
    @DataProvider
    public Object[][] musteriHizmetleriVerileri(){
        Object [][] musteriHizmetleriGirisBilgileri = {
                {"adam1","3456"},
                {"ali2","1234"},
                {"nancy3","7890"}
        };
        return musteriHizmetleriGirisBilgileri;
    }
    @DataProvider
    public Object[][] personelVerileri(){
        Object [][] personelGirisBilgileri = {
                {"rukiye1","abc1"},
                {"mehmet2","123r"},
                {"emin3","3edc"},
                {"baran3","4asd"},
                {"okumus3","6e45"}
        };
        return personelGirisBilgileri;
    }
    //    Excelden dataprovider a data gelir
//    Burdan da Test case e gider
    @DataProvider
    public Object[][] customerData(){
        //        DataProviderTest2 ile bu metot arasindaki tek fark bu metotda datalar Excelden gelir.
        //        Bu kullanim daha guzeldir
        String path="./src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path,sheetName);
        Object[][] musteriBilgileri = excelUtils.getDataArrayWithoutFirstRow();
        return musteriBilgileri;
    }
}