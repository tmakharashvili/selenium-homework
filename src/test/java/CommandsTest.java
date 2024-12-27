import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import steps.CommandsSteps;
import utils.SetUpClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static net.bytebuddy.implementation.MethodDelegation.to;

public class CommandsTest extends SetUpClass {

    @Test
    public static void firstTest(){

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        CommandsSteps commandsSteps = new CommandsSteps();

        commandsSteps.ClickEnableButton();
        commandsSteps.inputIsEnabled();
        commandsSteps.textIsVisible();
        commandsSteps.checkDisableButton();
        commandsSteps.enterBootcamp();
        commandsSteps.clearInput();

        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        commandsSteps.checkURL();

        System.out.println(driver.findElement(By.id("column-a")).getLocation().y);
        System.out.println(driver.findElement(By.id("column-b")).getLocation().y);

        driver.quit();

    }
}
