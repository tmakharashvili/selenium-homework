import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.WaitsSteps;
import utils.SetUpClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class WaitsTest extends SetUpClass {
    @Test
    public static void mySecondTest(){
        driver.get("https://demoqa.com/progress-bar");

        WaitsSteps waitsSteps = new WaitsSteps();

        waitsSteps.clickStartButton();
        waitsSteps.waitFor100();
        waitsSteps.checkprogressBar();

        driver.quit();
    }
}
