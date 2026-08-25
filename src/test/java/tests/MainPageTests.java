package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Owner("Jibek Tumenbaeva")
@Feature("Main Page")
public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Main page should open successfully")
    void mainPageShouldOpenTest() {
        mainPage.openPage()
                .checkSearchInputVisible();
    }


}