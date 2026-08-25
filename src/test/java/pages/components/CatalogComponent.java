package pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogComponent {
    private final SelenideElement catalogButton =
            $("[data-testid-button-header='catalog']");

    private final SelenideElement booksCategory =
            $$("[data-testid-button-catalog-menu-category='label']")
                    .findBy(exactText("Книги"));

    @Step("Open the catalog")
    public void openCatalog() {
        catalogButton
                .shouldBe(visible)
                .shouldBe(enabled)
                .click();
    }

    @Step("Check that the catalog is visible")
    public void checkCatalogIsVisible() {
        booksCategory
                .shouldBe(visible)
                .shouldHave(exactText("Книги"));
    }

    @Step("Check that the catalog button is visible")
    public void checkCatalogButtonIsVisible() {
        catalogButton.shouldBe(visible);
    }
}
