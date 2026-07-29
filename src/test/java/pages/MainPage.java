package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement confirmCityButton =
            $$("button").findBy(text("Да, я здесь"));

    private final SelenideElement catalogButton =
            $("[data-testid-button-header='catalog']");

    private final SelenideElement booksCategory =
            $$("[data-testid-button-catalog-menu-category='label']")
                    .findBy(exactText("Книги"));

    private final SelenideElement searchInput =
            $("#app-search");

    @Step("Open Chitai-Gorod main page")
    public MainPage openPage() {
        open("/");
        confirmCityIfVisible();
        return this;
    }

    @Step("Confirm the selected city if the pop-up is displayed")
    public MainPage confirmCityIfVisible() {
        if (confirmCityButton.is(visible, Duration.ofSeconds(5))) {
            confirmCityButton.click();
        }
        return this;
    }

    @Step("Open the catalog")
    public MainPage openCatalog() {
        catalogButton
                .shouldBe(visible)
                .shouldBe(enabled)
                .click();

        return this;
    }

    @Step("Check that the catalog is opened")
    public MainPage checkCatalogIsVisible() {
        booksCategory
                .shouldBe(visible)
                .shouldHave(exactText("Книги"));

        return this;
    }

    @Step("Check that the search field is visible")
    public MainPage checkSearchInputVisible() {
        searchInput.shouldBe(visible);
        return this;
    }

    @Step("Enter search query: {query}")
    public MainPage enterSearchQuery(String query) {
        searchInput
                .shouldBe(visible)
                .setValue(query);

        return this;
    }

    @Step("Check that search field contains: {expectedValue}")
    public MainPage checkSearchValue(String expectedValue) {
        searchInput.shouldHave(value(expectedValue));
        return this;
    }

    @Step("Search for: {query}")
    public SearchResultsPage searchFor(String query) {
        searchInput
                .shouldBe(visible)
                .setValue(query)
                .pressEnter();

        return new SearchResultsPage();
    }
}
