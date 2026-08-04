package apiTests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class ApiTestBase {
    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://selenoid.autotests.cloud";
    }
}
