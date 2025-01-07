package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.SetUpSelenide;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class SeventhHomeworkElements extends SetUpSelenide {

    public SelenideElement floatingMenu = $("a[href='/floating_menu']");
    public SelenideElement body = $("body");
    public SelenideElement menu = $("#menu");

    public SelenideElement dynamicContent = $("a[href='/dynamic_content']");
    public SelenideElement text = $("div#content");
    public SelenideElement image = $("div#content img");

    public SelenideElement toDoList = $("#to-do-list");
    public SelenideElement toDoInput = $(byXpath("//*//div [@id='container']//input [@placeholder='Add new todo']"));
    public SelenideElement list = $x("//*[@id=\"container\"]/ul");
    public SelenideElement task2 = $(By.xpath("//*[@id='container']//ul//li[5]"));
    public SelenideElement deleteTask2 = $(By.xpath("//*[@id='container']//ul//li[5]//i[@class='fa fa-trash']"));

    public SelenideElement sortableDataTables = $(byXpath("//*//a [text() = 'Sortable Data Tables']"));
    public ElementsCollection rows = $$("table#table2 tbody tr");
    public SelenideElement firstNames = $(".first-name");
    public SelenideElement lastnameAfterSort = $("table#table2 tbody tr:first-child td:nth-child(1)");
    public SelenideElement firstnameAfterSort = $("table#table2 tbody tr:first-child td:nth-child(2)");
    public SelenideElement emailAfterSort = $("table#table2 tbody tr:first-child td:nth-child(3)");

}
