import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.ThirdHomeworkSteps;
import utils.SetUpClass;

import java.util.List;

public class ThirdHomework extends SetUpClass {
    @Test
    public static void assertsUsage() {

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        ThirdHomeworkSteps thirdHomeworkSteps = new ThirdHomeworkSteps();

        thirdHomeworkSteps.scrollPage3times();

        driver.navigate().to("https://demoqa.com/text-box");


        WebElement submit = driver.findElement(By.id("submit"));
        JavascriptExecutor jS = (JavascriptExecutor) driver;
        jS.executeScript("arguments[0].scrollIntoView(true);", submit);

        Assert.assertTrue(submit.isDisplayed());
        boolean active = submit.isEnabled();


        driver.navigate().to("https://www.selenium.dev/");

        thirdHomeworkSteps.scrollPage();
        thirdHomeworkSteps.footerIsVisible();

     //   WebElement footer = driver.findElement(By.xpath("/html/body/div/footer"));
     //   Assert.assertTrue(footer.isDisplayed());

        driver.quit();
        }
    }

