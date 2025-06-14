package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Log;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        Log.startTestCase("Browser Setup");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Log.info("Opened OrangeHRM");
    }

    @AfterMethod
    public void tearDown() {
        Log.endTestCase("Browser Teardown");
        if (driver != null) {
            driver.quit();
        }
    }
}