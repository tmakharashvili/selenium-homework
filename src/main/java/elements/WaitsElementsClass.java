package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.SetUpClass;

public class WaitsElementsClass extends SetUpClass {

public WebElement StartButton = driver.findElement(By.xpath("//button[@id='startStopButton']"));
public WebElement  ProgressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
    String progressValue = ProgressBar.getAttribute("aria-valuenow");

}
