import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ThirdHomework {
    @Test
    public static void assertsUsage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 3; i++) {
            js.executeScript("scrollBy(0, 500);");
        }  //აქ ვერ ჩავსვი ყველა სქროლის შემდეგ ასერტი


        driver.navigate().to("https://demoqa.com/text-box");

        WebElement element = driver.findElement(By.id("submit"));
        JavascriptExecutor jS = (JavascriptExecutor) driver;
        jS.executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertTrue(element.isDisplayed());
        boolean active = element.isEnabled();


        driver.navigate().to("https://www.selenium.dev/");
        JavascriptExecutor jScript = (JavascriptExecutor) driver;
        jScript.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement footer = driver.findElement(By.xpath("/html/body/div/footer"));
        Assert.assertTrue(footer.isDisplayed());

        driver.quit();
        }
    }

