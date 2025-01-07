package steps;

import elements.SeventhHomeworkElements;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

public class SeventhHomeworkSteps extends SeventhHomeworkElements {
    public void goToFloatingMenu(){
        floatingMenu.click();
    }
    public void scrollPage(){
        body.scrollTo();
    }
    public void checkMenuVisibility(){
        boolean isMenuVisible = menu.isDisplayed();
        assertTrue(isMenuVisible, "Floating menu is not visible");
    }
    public void goToDynamicContent(){
        dynamicContent.click();
    }

    public void checkTextsAndImagesAfterRefresh(){
    String initialText = text.getText();
    String initialImage = image.getAttribute("src");

        for (int i = 0; i < 3; i++) {
            refresh();

            String newText = text.getText();
            assertNotEquals("Text hasn't changed after refresh", initialText, newText);

            String newImage = image.getAttribute("src");
            assertNotEquals("Image hasn't changed after refresh", initialImage, newImage);

            initialText = newText;
            initialImage = newImage;
        }
    }

    public void goToDoList(){
        toDoList.click();
    }
    public void moveToToDo () {
        switchTo().window(1);
    }
    public void addNewTasks(){
        toDoInput.setValue("task1").pressEnter();
        toDoInput.setValue("task2").pressEnter();
        toDoInput.setValue("task3").pressEnter();
    }
    public void checkToDoList(){
        list.shouldHave(text("task1"));
        list.shouldHave(text("task2"));
        list.shouldHave(text("task3"));
    }
    public void deleteTask2(){
        task2.hover();
        deleteTask2.click();
    }
    public void checkTasks(){
        list.shouldHave(text("task1"));
        list.shouldHave(text("task3"));
        list.shouldNotHave(text("task2"));
    }

    public void goToSortableDataTable(){
        sortableDataTables.click();
    }
    public void findDoeAndCheckEmail(){
        String lastName = "Doe";
        String expectedEmail = "jdoe@hotmail.com";

        rows.findBy(text(lastName)).shouldHave(text(expectedEmail));
    }
    public void sortByFirstnames(){
        firstNames.click();
    }
    public void checkFirstRowData(){
        lastnameAfterSort.shouldHave(text("Bach"));
        firstnameAfterSort.shouldHave(text("Frank"));
        emailAfterSort.shouldHave(text("fbach@yahoo.com"));
    }

}
