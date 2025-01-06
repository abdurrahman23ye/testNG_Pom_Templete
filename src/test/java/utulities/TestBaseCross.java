package utulities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {
    //defauult özellikleri yüklenmesini istediğimiz bir test ortmaı varsa extends kullanılarak temiz
    //kod yazımı gerçekleşebilir

    protected WebDriver driver;
   @Parameters("browser")
    @BeforeMethod
    public void setUp (@Optional String browser) {

       driver = DriverCross.getDriver(browser);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void termination () {

        //   driver.close();
    }
}
