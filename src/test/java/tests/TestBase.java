package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Attachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void setupSelenideEnv() {
        Configuration.baseUrl = System.getProperty(
                "baseUrl",
                "https://www.chitai-gorod.ru"
        );

        Configuration.browser = System.getProperty(
                "browser",
                "chrome"
        );

        Configuration.browserVersion = System.getProperty(
                "browserVersion",
                ""
        );

        Configuration.browserSize = System.getProperty(
                "browserSize",
                "1920x1080"
        );

        Configuration.headless = Boolean.parseBoolean(
                System.getProperty("headless", "false")
        );

        Configuration.timeout = 10000;

        String remoteUrl = System.getProperty(
                "remoteUrl",
                "https://user1:1234@selenoid.autotests.cloud/wd/hub"
        );

        if (remoteUrl != null && !remoteUrl.isBlank()) {
            Configuration.remote = remoteUrl;

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(
                    "selenoid:options",
                    Map.<String, Object>of(
                            "enableVNC", true,
                            "enableVideo", true
                    )
            );

            Configuration.browserCapabilities = capabilities;
        }
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attachments.screenshotAs("Last screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        if (Configuration.remote != null) {
            Attachments.addVideo();
        }
        closeWebDriver();
    }
}
