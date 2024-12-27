package steps;

import elements.CommansElements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.w3c.dom.Text;


public class CommandsSteps extends CommansElements {

    public void ClickEnableButton(){
        EnableButton.click();
    }
    public void inputIsEnabled(){
        Input.isEnabled();
    }
    public void textIsVisible(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
    }
    public void checkDisableButton(){
        EnableButton.getText().equals("Disabled");
    }
    public void enterBootcamp(){
        Input.sendKeys("Bootcamp");
    }
    public void clearInput(){
        Input.clear();
    }
    public void checkURL(){
        wait.until(ExpectedConditions.urlToBe("https://the-internet.herokuapp.com/drag_and_drop"));
    }


}
