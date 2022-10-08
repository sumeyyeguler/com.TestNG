package tests.day21_reusableMethods_HtmlReports;

import org.testng.annotations.Test;
import tests.day16_notations.C04_DependsOnMethods;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C02_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {
        // amazon sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
        Driver.closeDriver();
    }
}
