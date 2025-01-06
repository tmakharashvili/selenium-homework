import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.WebFormSteps;
import utils.SetUpClass;

import java.util.List;


public class WebFormsTest extends SetUpClass {
    @Test
    public static void anothertest() {
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        WebFormSteps webFormSteps = new WebFormSteps();

        webFormSteps.clickProgramLanguageFiend();
        webFormSteps.selectSQL();
        webFormSteps.checkSelectedOption();
        webFormSteps.selectUncheckedOptions();
        webFormSteps.clickYellowButton();
        webFormSteps.checkSelectedButton();
        webFormSteps.clickSelectedAndDisabledfield();
        webFormSteps.checkOrangeStatus();

        driver.quit();
    }
}

