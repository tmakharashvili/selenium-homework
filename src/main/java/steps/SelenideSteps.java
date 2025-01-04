package steps;

import elements.SelenideElements;
import utils.SetUpSelenide;

import javax.xml.xpath.XPath;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SelenideSteps extends SelenideElements {

    public void getNamesAndBalances() {
        for (int numberOfRows = 1; numberOfRows <= 4; numberOfRows++) {

            String username = $(byXpath("//table[\"table1\"]/tbody/tr[" + numberOfRows + "]/td[2]")).getText();
            String balance = $(byXpath("//table[\"table1\"]/tbody/tr[" + numberOfRows + "]/td[4]")).getText();

            System.out.println("User: " + username + ", Balance: " + balance);

        }
    }
        public boolean checkFrank() {
            return rows.filterBy(text("Frank")).size() > 0;
    }

    public void moveToButton(){
        toolTipButton.hover();
    }
    public void checkText(){
        text.shouldHave(text("You hovered over the Button"));
    }

    public void inputValue(){
        input.sendKeys("Selenium Robot Class example");
    }
    public void pressEnter() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public void goToFirstLink() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


}