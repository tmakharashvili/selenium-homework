import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static net.bytebuddy.implementation.MethodDelegation.to;

public class CommandsTest {

    @Test
    public static void firstTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).isEnabled();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"message\"]")).isDisplayed();
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("Bootcamp");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).clear();

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        System.out.println(driver.findElement(By.id("column-a")).getLocation().y);
        System.out.println(driver.findElement(By.id("column-b")).getLocation().y);

        driver.quit();

    }
}
