import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class firsttest {
    @Test
    public void test(){
       // WebDriverManager.firefoxdriver().setup();
        WebDriverManager.firefoxdriver().arch64().setup();
        Configuration.startMaximized = true;
        Selenide.open("https://fb.com");
        $(byName("email")).setValue("email-is-magaliti");
        $(byName("pass")).setValue("paroli").pressEnter();
        sleep(5000);
    }




}
