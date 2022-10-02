package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
     /*
    POM'de Driver icin TestBase class'ina extends etmek yerine
    Driver class'indan static method'lar kullanarak
    driver olusturup, ilgili ayarlarin yapilmasi
    ve en sonda driver'in kapatilmasi tercih edilmistir.
    POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini
    engellemek icin
    Singleton pattern kullanimi benimsenmistir.
    Singleton Pattern : tekli kullanim, bir class'in farkli class'lardan
    obje olusturularak kullanimini engellemek icin kullanilir.
    Bunu saglamak icin yapmamiz gereken sey oldukca basit
    obje olusturmak icin kullanilan constructor'i private yaptiginizda
    bsaka class'larda Driver class'indan obje olusturulmasi mumkun OLAMAZ
     */

   static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.close();
            driver=null;
        }
    }
}
