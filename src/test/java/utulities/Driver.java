package utulities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

   static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) {
            driver = new ChromeDriver();
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
