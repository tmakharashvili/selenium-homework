package steps;

import elements.WaitsElementsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static utils.SetUpClass.driver;

public class WaitsSteps extends WaitsElementsClass {

    public void clickStartButton(){
        StartButton.click();
    }
    public void checkprogressBar(){
        Assert.assertTrue(ProgressBar.getText().contains("100"));
    }
    public void waitFor100(){
        wait.until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[@role='progressbar' and @aria-valuenow='100']")));
    }

}
