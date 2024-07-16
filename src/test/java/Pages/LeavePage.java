package Pages;

import org.openqa.selenium.By;

import static tests.SeleniumTest.driver;

public class LeavePage {
    public static String Leavemodule = " //span[normalize-space()='Leave']";
    public static String ApplyLeave = " //a[normalize-space()='Apply']";
    public static String SelectLeavetype = " //div[@class='oxd-select-text oxd-select-text--active']";

    public static void gotoleavemodule() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(Leavemodule)).click();
    }

    public static void GoToApplyLeave() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath(ApplyLeave)).click();
    }

    public static void SelectLeavetypedropDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(SelectLeavetype)).click();
    }



}
