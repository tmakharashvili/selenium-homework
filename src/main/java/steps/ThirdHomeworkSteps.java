package steps;

import elements.ThirdHomeworkElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static utils.SetUpClass.driver;

public class ThirdHomeworkSteps extends ThirdHomeworkElements {
    public void scrollPage3times(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 0; i < 3; i++) {
            js.executeScript("scrollBy(0, 500);");
        }
    }
    public void scrollPage(){
        JavascriptExecutor jScript = (JavascriptExecutor) driver;
        jScript.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void footerIsVisible(){
        Assert.assertTrue(footer.isDisplayed());

    }

}
