package tests.test01;

import org.testng.annotations.Test;

import pages.youTubeMainPage;
import utulities.Driver;
import utulities.configReader;

public class test001 {

    youTubeMainPage youTubeMainPage=new youTubeMainPage();

    @Test
    public void test01() {
        Driver.getDriver().get(configReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys("aaa");



    }
}
