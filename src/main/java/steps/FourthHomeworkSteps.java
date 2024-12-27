package steps;

import elements.FoursHomeworkElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.time.Duration;

public class FourthHomeworkSteps extends FoursHomeworkElements {
    public void moveToTipBox(){
        Actions actions = new Actions(driver);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tipBox);
        actions.moveToElement(tipBox).perform();

    }
    public void checkTollTipText(){
        Assert.assertTrue(tipText.isDisplayed());
    }

 //   public void enterTextInField(){
 //       input.sendKeys("Selenium Robot Class example");
 //   }

}
