package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CatalogComponent {
    private final SelenideElement catalogButton =
            $("[data-testid-button-header='catalog']");

    private final SelenideElement booksCategory =
            $$("[data-testid-button-catalog-menu-category='label']")
                    .findBy(exactText("Книги"));

    public void openCatalog() {
        catalogButton
                .shouldBe(visible)
                .shouldBe(enabled)
                .click();
    }

    public void checkCatalogIsVisible() {
        booksCategory
                .shouldBe(visible)
                .shouldHave(exactText("Книги"));
    }
}
