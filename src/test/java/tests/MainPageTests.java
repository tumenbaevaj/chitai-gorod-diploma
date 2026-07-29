package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Main page should open successfully")
    void mainPageShouldOpenTest() {
        mainPage.openPage()
                .checkSearchInputVisible();
    }

    @Test
    @DisplayName("Catalog should open successfully")
    void catalogShouldOpenTest() {
        mainPage.openPage()
                .openCatalog()
                .checkCatalogIsVisible();
    }

    @Test
    @DisplayName("Search field should accept a book title")
    void searchFieldValueTest() {
        mainPage.openPage()
                .enterSearchQuery("Белый пароход")
                .checkSearchValue("Белый пароход");
    }

    @Test
    @DisplayName("Search results should contain the requested author")
    void authorSearchTest() {
        mainPage.openPage()
                .searchFor("Чингиз Айтматов")
                .checkResultsContain("Чингиз Айтматов");
    }

    @Test
    @DisplayName("Search results should contain the requested book")
    void bookSearchTest() {
        mainPage.openPage()
                .searchFor("Белый пароход")
                .checkResultsContain("Белый пароход");
    }
}