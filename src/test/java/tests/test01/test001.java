package tests.test01;

import org.testng.annotations.Test;
import utulities.Driver;

public class test001 {

    @Test
            public void test01() {
        Driver.getDriver().get("https://www.youtube.com");
        Driver.getDriver().get("https://www.google.com");

    }
}
