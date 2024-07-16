package Pages;

import org.openqa.selenium.By;

import static tests.SeleniumTest.driver;

public class HomePage {

    public static String LoginUsername = "input[placeholder='Username']";

    public static String LoginPassword = "input[placeholder='Password']";

    public static String Loginbutton = "button[type='submit']";

    public static void Enterloginusername() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.cssSelector(LoginUsername)).sendKeys("Admin");
    }

    public static void EnterLoginPassword(){
        driver.findElement(By.cssSelector(LoginPassword)).sendKeys("admin123");

    }

    public static void ClickonLoginbutton(){
        driver.findElement(By.cssSelector(Loginbutton)).click();
    }

}
