package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SelenideElements {
    public SelenideElement table1 = $("table#table1");
    public ElementsCollection rows = table1.$$("tr");

    public SelenideElement toolTipButton = $("#toolTipButton");
    public SelenideElement text = $(".tooltip-inner");

    public SelenideElement input = $(".gLFyf");

}
