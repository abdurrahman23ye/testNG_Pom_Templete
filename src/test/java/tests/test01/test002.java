package tests.test01;

import org.testng.annotations.Test;
import org.testng.xml.XmlGroups;
import pages.youTubeMainPage;
import utulities.Driver;
import utulities.configReader;

import javax.swing.*;

public class test002 {

    youTubeMainPage youTubeMainPage=new youTubeMainPage();

    @Test(groups = {"03"})
    public void test01() {
        Driver.getDriver().get(configReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys("aaa");



    }

    @Test(groups = {"01","02"})
    public void test02() {
        Driver.getDriver().get(configReader.getProperty("youtubeUrl"));

        youTubeMainPage.searchBox.sendKeys("bbb");



    }
}
