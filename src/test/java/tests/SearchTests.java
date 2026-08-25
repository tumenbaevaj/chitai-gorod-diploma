package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.MainPage;

@Owner("Jibek Tumenbaeva")
@Feature("Search")
public class SearchTests extends TestBase {

    MainPage mainPage = new MainPage();

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

    @ValueSource(strings = {
            "Джамиля",
            "Плаха"
    })
    @ParameterizedTest(name = "Search results should contain book {0}")
    void searchResultsShouldContainEnteredBookTest(String bookTitle) {
        mainPage.openPage()
                .searchFor(bookTitle)
                .checkResultsContain(bookTitle);
    }

    @Test
    @DisplayName("Search for a non-existent book should show no results")
    void nonexistentBookSearchTest() {
        mainPage.openPage()
                .searchFor("qwerty123456789")
                .checkNoResultsFound();
    }
}
