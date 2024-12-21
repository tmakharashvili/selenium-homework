import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class WaitsTest {
    @Test
    public static void mySecondTest(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.xpath("//button[@id='startStopButton']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[@role='progressbar' and @aria-valuenow='100']")));


        WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
        String progressValue = progressBar.getAttribute("aria-valuenow");
        Assert.assertEquals("100",progressValue);

        driver.quit();
    }
}
