package utulities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    private Driver(){}

    //çok önemli ve olmazsa olmaz bir durum değil ama bir şekilde çoklu kullanım olursa driver obje ile çağrılmasın ***private ile
    // değer atanmasın teknik adı->singleton

   static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) {

            switch (ConfigReader.getProperty("browser"))
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
