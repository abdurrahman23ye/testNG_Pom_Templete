package tests.test01;

import org.testng.annotations.Test;
import pages.youTubeMainPage;
import utulities.Driver;
import utulities.ConfigReader;
import utulities.TestBaseReport;

public class test002 extends TestBaseReport {

    youTubeMainPage youTubeMainPage=new youTubeMainPage();

    @Test(groups = {"03"})
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys("aaa");



    }

    @Test(groups = {"01","02"})
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys("bbb");



    }
}
