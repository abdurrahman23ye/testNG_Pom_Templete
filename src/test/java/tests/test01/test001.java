package tests.test01;

import org.testng.annotations.Test;

import pages.youTubeMainPage;
import utulities.Driver;
import utulities.ConfigReader;
import utulities.TestBaseReport;

public class test001 extends TestBaseReport {

    youTubeMainPage youTubeMainPage=new youTubeMainPage();

    @Test
    public void test01() {
        extentTest=extentReports.createTest("test01","login");
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));

        extentTest.info("page opened");

        extentTest.pass("success");

        youTubeMainPage.searchBox.sendKeys("aaa");

        extentTest.info("sended messsage to searchbox");

        extentTest.pass("success");





    }
}
