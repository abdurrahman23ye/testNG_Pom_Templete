package tests.test01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.youTubeMainPage;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.TestBaseReport;

public class DataProviders  {

    pages.youTubeMainPage youTubeMainPage = new youTubeMainPage();

    @DataProvider
    public static Object[][] datas() {

        Object[][] dataArray = {{"aaa"}, {"bbb"}};
        return dataArray;
    }

    @Test(dataProvider = "datas")
    public void test01(String data) {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys(data);


    }
}