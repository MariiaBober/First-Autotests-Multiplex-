import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Configuration.baseUrl;

public class BaseTest {

    @BeforeClass
    public void beforeClass() {
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1366x768";
        baseUrl = "https://multiplex.ua";
        Configuration.savePageSource = false;

    }

}
