import org.testng.annotations.Test;
import steps.SelenideSteps;
import utils.SetUpSelenide;

import java.awt.*;

import static com.codeborne.selenide.Selenide.open;

public class Selenide4Homework extends SetUpSelenide {

    @Test
    public static void tableMethod(){
        open("https://the-internet.herokuapp.com/tables");

        SelenideSteps selenideSteps = new SelenideSteps();

        selenideSteps.getNamesAndBalances();
        selenideSteps.checkFrank();
    }
    @Test
    public static void hover(){
        open("https://demoqa.com/tool-tips");

        SelenideSteps selenideSteps = new SelenideSteps();

        selenideSteps.moveToButton();
        selenideSteps.checkText();
    }
    @Test
    public static void google() throws AWTException {
        open("https://www.google.com/");

        SelenideSteps selenideSteps = new SelenideSteps();

        selenideSteps.inputValue();
        selenideSteps.pressEnter();
        selenideSteps.goToFirstLink();

    }
}
