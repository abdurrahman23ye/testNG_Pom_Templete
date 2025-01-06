package tests.test01;

import org.testng.annotations.Test;

import pages.youTubeMainPage;
import utulities.*;

public class test001 extends TestBaseCross {

    //bu testi cross için tekrardan düzenledim extends önemli driver methodtan gelmemeli ya da üzerinde
    //çalışılmalı

  //  youTubeMainPage youTubeMainPage=new youTubeMainPage();

    @Test
    public void test01() {
      //  extentTest=extentReports.createTest("test01","login");
        driver.get(ConfigReader.getProperty("youtubeUrl"));

       /* extentTest.info("page opened");

        extentTest.pass("success");

        youTubeMainPage.searchBox.sendKeys("aaa");

        extentTest.info("sended messsage to searchbox");

        extentTest.pass("success");

        */





    }
}
