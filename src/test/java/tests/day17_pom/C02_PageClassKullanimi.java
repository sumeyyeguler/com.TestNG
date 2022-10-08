package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_PageClassKullanimi {

    @Test
    public void test01() {
        AmazonPage amazonPage=new AmazonPage();

        // amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        // nutella aratalim
        amazonPage.aramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        // sonuc yazisinin nutella icerdigini test edelim
        String actualSonuc=amazonPage.aramaSonucElementi.getText();
        String arananKelime="nutella";

        Assert.assertTrue(actualSonuc.contains(arananKelime));
    }
}