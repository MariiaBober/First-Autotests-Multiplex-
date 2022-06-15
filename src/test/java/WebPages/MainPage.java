package WebPages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.conditions.webdriver.Url;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String pageUrl = "/";

    SelenideElement sideBarButton = $("body > div.header.header-index > div > img");
    SelenideElement ruLangButton = $("body > div.left_menu.js-left-menu.on > div > ul > li:nth-child(1) > a");
    SelenideElement loginButton = $("body > div.header.header-index > div > a.lk_link");
    SelenideElement sideMenuTelegramButton = $("body > div.left_menu.js-left-menu.on > div > div:nth-child(6) > div.menu_soc > a:nth-child(4)");
    SelenideElement sideMenuPhoneNomber = $("body > div.left_menu.js-left-menu.on > div > div:nth-child(5) > div.menu_soc > a.menu-block-phone");
    SelenideElement sideMenuFacebookButton = $("body > div.left_menu.js-left-menu.on > div > div:nth-child(6) > div.menu_soc > a:nth-child(1)");


    public void openMainPage(){
        Selenide.open(baseUrl + pageUrl);

    }
    public void clickSideBarMenu(){
        sideBarButton.shouldBe(visible).click();

    }

    public void clikChangeLangRu(){
        ruLangButton.shouldBe(visible).click();

    }

    public void checkLoginButtonText(){
        loginButton.shouldBe(visible).shouldHave(text("Войти"));

    }


    public void checkSideMenuTelegramButton(){
        sideMenuTelegramButton.shouldBe(visible).shouldHave(text("Telegram"));
    }

    public void checksideMenuPhoneNomber(){
        sideMenuPhoneNomber.shouldBe(visible).shouldHave(text("0 800 505 333"));
    }

    public void checksideMenuFacebookButton()
    {sideMenuFacebookButton.shouldBe(visible).shouldHave(text("Facebook"));



    }

}
