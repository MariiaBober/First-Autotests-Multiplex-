import WebPages.MainPage;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.hamcrest.MatcherAssert.assertThat;

public class FirstSelenideTest extends BaseTest {

    @Test
    public void checkChangeLangRu() {
        MainPage mainPage = new MainPage();

        mainPage.openMainPage();
        mainPage.clickSideBarMenu();
        mainPage.clikChangeLangRu();
        mainPage.checkLoginButtonText();

    }

    @Test
    public void checkFacebookButton() {
        MainPage mainPage = new MainPage();

        mainPage.openMainPage();
        mainPage.clickSideBarMenu();
        mainPage.checksideMenuFacebookButton();

    }

    @Test
    public void checkTelegramButton() {
        MainPage mainPage = new MainPage();

        mainPage.openMainPage();
        mainPage.clickSideBarMenu();
        mainPage.checkSideMenuTelegramButton();

    }

    @Test
    public void checkPhoneNomber() {
        MainPage mainPage = new MainPage();

        mainPage.openMainPage();
        mainPage.clickSideBarMenu();
        mainPage.checksideMenuPhoneNomber();

    }


}
