import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FourthHomework {
    @Test
    public static void assertsUsage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");

        for (int numberOfRows = 1; numberOfRows <= 4; numberOfRows++) {

            WebElement names = driver.findElement(By.xpath("//table[\"table1\"]/tbody/tr[" +
                    numberOfRows + "]/td[2]"));


                    String cellText2 = driver.findElement(By.xpath("//table[\"table1\"]/tbody/tr[" +
                    numberOfRows + "]/td[2]")).getText();
            String cellText4 = driver.findElement(By.xpath("//table[\"table1\"]/tbody/tr[" +
                    numberOfRows + "]/td[4]")).getText();

            System.out.println(cellText2 + " " + cellText4);

         //   Assert.assertEquals(names,"Frank");
            }
        driver.quit();
        }
        @Test
        public static void actionClasses() {
            WebDriver driver = new ChromeDriver();
            Actions actions = new Actions(driver);

            driver.get("https://demoqa.com/tool-tips");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement tipBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolTipButton")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tipBox);
            actions.moveToElement(tipBox).perform();
            WebElement tipText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));
            Assert.assertTrue(tipText.isDisplayed());

            driver.quit();
        }

        @Test
        public static void robotClasses() throws AWTException {
            WebDriver driver = new ChromeDriver();
            Robot robot = new Robot();
            driver.get("https://www.google.com/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));

            input.sendKeys("Selenium Robot Class example");
            robot.keyPress(KeyEvent.VK_ENTER);

            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            driver.quit();
        }
    }


