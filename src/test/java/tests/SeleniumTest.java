package tests;

import Pages.Dashboard;
import Pages.HomePage;
import Pages.LeavePage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumTest {
    public static WebDriver driver;

    static ExtentReports reports;
    static ExtentTest test;
    static ExtentReports extent = new ExtentReports();



    @BeforeSuite
    public static void setup(){

         driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);

        try {
            HomePage.Enterloginusername();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        HomePage.EnterLoginPassword();
        HomePage.ClickonLoginbutton();

    }

    @Test
    void DashboardActivity() {
        test = extent.createTest("Validate the DashboardActivity", "This Test can validate the Dashboard text and Get that texts");
        try {
            Dashboard.myactiontabGetText();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Dashboard.buzzlatestpostGetText();
        Dashboard.quicklaunchtabGetText();
    }

    @Test
    void LeavePageActivity(){
        test = extent.createTest("Validate the LeavePageActivity","This test can validate the Leave Module Activity which includes:Apply for Leave");
        try {
            LeavePage.gotoleavemodule();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            LeavePage.GoToApplyLeave();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            LeavePage.SelectLeavetypedropDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @AfterSuite
    public static void CleanUp()
    {
        extent.flush();
    }

}
