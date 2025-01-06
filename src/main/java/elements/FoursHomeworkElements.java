package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.SetUpClass;

import java.time.Duration;

public class FoursHomeworkElements extends SetUpClass {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    public WebElement tipBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolTipButton")));
    public WebElement tipText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
  //  public WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
}
