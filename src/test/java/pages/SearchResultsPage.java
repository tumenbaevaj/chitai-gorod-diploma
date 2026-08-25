package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {

    @Step("Check that search results contain: {expectedText}")
    public SearchResultsPage checkResultsContain(String expectedText) {
        $("body").shouldHave(text(expectedText));
        return this;
    }

    @Step("Check that no search results were found")
    public SearchResultsPage checkNoResultsFound() {
        $("body").shouldHave(text("не принес результатов"));
        return this;
    }
}
