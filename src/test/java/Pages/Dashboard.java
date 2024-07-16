package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static tests.SeleniumTest.driver;

public class Dashboard {

    public static String myactiontab = "//p[normalize-space()='My Actions']";

    public static String quicklaunchtab = "//p[normalize-space()='Quick Launch']";

    public static String buzzlatestpost = "//p[normalize-space()='Buzz Latest Posts']";

    public static void myactiontabGetText() throws InterruptedException {

        Thread.sleep(5000);

        String ExpectedactionTab = "My Actions";
        String ActualactionTab = driver.findElement(By.xpath(myactiontab)).getText();

        Assert.assertEquals(ExpectedactionTab, ActualactionTab);
    }
    public static void quicklaunchtabGetText(){
        driver.findElement(By.xpath(quicklaunchtab)).getText();

    }
    public static void buzzlatestpostGetText(){
        driver.findElement(By.xpath(buzzlatestpost)).getText();

    }


}
