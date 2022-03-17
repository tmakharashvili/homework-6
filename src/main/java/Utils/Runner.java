package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Runner {
    @BeforeTest
    public static void setUp (){
        Configuration.browser="chrome";
        Configuration.browserSize="1440x900";
        Selenide.open("https://wishlist.ge/");
    }
    @AfterTest
    public static void tearDown (){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
    }
}
