package utils;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class SetUpSelenide {
    @BeforeTest
    public static void setupSelenide(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

    }
}
