package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.SetUpClass.driver;

public class WebFormsElementsClass {
    public WebElement ProgramLanguageField = driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']"));
    public WebElement SQL = driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']//option[@value = 'sql']"));
    public WebElement SelectedOption = driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']//option[@value = 'sql']"));
    public WebElement YellowRadioButton = driver.findElement(By.xpath("//input[@value = 'yellow']"));
    protected List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));
    public WebElement SelectedAndDisabledfield = driver.findElement(By.xpath("//select[@id = 'fruit-selects']"));
    public WebElement OrangeOption = driver.findElement(By.xpath("//select[@id = 'fruit-selects']//option[@disabled = 'disabled']"));



}
