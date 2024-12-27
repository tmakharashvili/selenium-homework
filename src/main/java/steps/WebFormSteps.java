package steps;

import elements.WebFormsElementsClass;
import org.testng.Assert;
import utils.SetUpClass;

public class WebFormSteps extends WebFormsElementsClass {
    public void clickProgramLanguageFiend(){
        ProgramLanguageField.click();
    }
    public void selectSQL(){
        SQL.click();
    }
    public void checkSelectedOption(){
        Assert.assertTrue(SelectedOption.isSelected());
    }
    public void clickYellowButton(){
        YellowRadioButton.click();
    }
    public void checkSelectedButton(){
        Assert.assertTrue(YellowRadioButton.isSelected());
    }
    public void selectUncheckedOptions(){
        checkboxes.forEach(checkbox -> {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        });
    }
    public void clickSelectedAndDisabledfield(){
        SelectedAndDisabledfield.click();
    }
    public void checkOrangeStatus(){
        Assert.assertFalse(OrangeOption.isEnabled());
    }

}
