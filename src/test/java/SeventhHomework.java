import org.testng.annotations.Test;
import steps.SeventhHomeworkSteps;
import utils.SetUpSelenide;
import static com.codeborne.selenide.Selenide.*;

public class SeventhHomework extends SetUpSelenide {
    SeventhHomeworkSteps seventhHomeworkSteps = new SeventhHomeworkSteps();

    @Test
    public void testFloatingMenu(){
        open("https://the-internet.herokuapp.com/");

        seventhHomeworkSteps.goToFloatingMenu();
        seventhHomeworkSteps.scrollPage();
        seventhHomeworkSteps.checkMenuVisibility();
    }

    @Test
    public void dynamicContent(){
        open("https://the-internet.herokuapp.com/");

        seventhHomeworkSteps.goToDynamicContent();
        seventhHomeworkSteps.checkTextsAndImagesAfterRefresh();
    }

    @Test
    public void toDoApp(){
        open("https://webdriveruniversity.com/");

        seventhHomeworkSteps.goToDoList();
        seventhHomeworkSteps.moveToToDo();
        seventhHomeworkSteps.addNewTasks();
        seventhHomeworkSteps.checkToDoList();
        seventhHomeworkSteps.deleteTask2();
        seventhHomeworkSteps.checkTasks();
    }

    @Test
    public void dataTables(){
        open("https://the-internet.herokuapp.com/");

        seventhHomeworkSteps.goToSortableDataTable();
        seventhHomeworkSteps.findDoeAndCheckEmail();
        seventhHomeworkSteps.sortByFirstnames();
        seventhHomeworkSteps.checkFirstRowData();
    }
}
