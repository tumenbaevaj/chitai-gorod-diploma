package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Owner("Jibek Tumenbaeva")
@Feature("Catalog")
public class CatalogTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Catalog button should be visible")
    void catalogButtonShouldBeVisibleTest() {
        mainPage.openPage()
                .checkCatalogButtonIsVisible();
    }

    @Test
    @DisplayName("Catalog should open successfully")
    void catalogShouldOpenTest() {
        mainPage.openPage()
                .openCatalog()
                .checkCatalogIsVisible();
    }


}
