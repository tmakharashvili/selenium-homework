import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class WebFormsTest {
    @Test
    public static void anothertest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']")).click();
        driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']//option[@value = 'sql']")).click();
        boolean selected = driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']//option[@value = 'sql']")).isSelected();

        WebElement dropdownElement = driver.findElement(By.id("dropdowm-menu-1"));

        Select dropdown = new Select(dropdownElement);
        WebElement language = driver.findElement(By.xpath("//select[@class = 'dropdown-menu-lists' and @id = 'dropdowm-menu-1']//option[@value = 'sql']"));
        language.click();
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        Assert.assertEquals("sql", selectedOption.getAttribute("value"));


        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));

        checkboxes.forEach(checkbox -> {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        });

        driver.findElement(By.xpath("//input[@value = 'yellow']")).click();

        WebElement yellowRadioButton = driver.findElement(By.xpath("//input[@value = 'yellow']"));
        Assert.assertTrue(yellowRadioButton.isSelected());

        driver.findElement(By.xpath("//select[@id = 'fruit-selects']")).click();
        driver.findElement(By.xpath("//select[@id = 'fruit-selects']//option[@disabled = 'disabled']"));

        WebElement orangeOption = driver.findElement(By.xpath("//select[@id = 'fruit-selects']//option[@disabled = 'disabled']"));
        Assert.assertFalse(orangeOption.isEnabled());

        driver.quit();
    }
}

