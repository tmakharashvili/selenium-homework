import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

        List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));

        checkboxes.forEach(checkbox -> {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        });
        driver.findElement(By.xpath("//input[@value = 'yellow']")).click();
        driver.findElement(By.xpath("//select[@id = 'fruit-selects']")).click();
        driver.findElement(By.xpath("//select[@id = 'fruit-selects']//option[@disabled = 'disabled']"));
        driver.quit();
    }
}