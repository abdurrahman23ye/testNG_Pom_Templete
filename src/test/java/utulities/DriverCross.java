package utulities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverCross {

    private DriverCross(){}
   // driverdan farklar
    //1. drivercross classı
    //2.signleton uyarlaması
    //3.driver a browser parametresi eklenir
    //4.browser değerinde bir şekilde hata olabilir diye driver ın null kalmamasına yönelir kod
    // get driver a eklebir
    //5. browser parametresi switch koşulu yapılır
    //6. crossbrowser a özel class gerekli,browser parametresi için(testbasecross)
    //7. test yapılacak classlar crossdriver a extend olacak
    //8. crosbrowserxml i düzenlenir

    //* html ya olmaz ya da ben bilmiyorum
    //proje de buna göre tekrar düzenlenmeli

    static WebDriver driver;

    public static WebDriver getDriver(String browser){

        browser = (browser == null) ? ConfigReader.getProperty("browser") : browser;

        if(driver==null) {

            switch (browser)
            {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                default:
                    driver = new ChromeDriver();

            }


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static WebDriver closeDriver(){

        if(driver!=null) {
            driver.close();
            driver=null;

        }
        return driver;


    }
}
