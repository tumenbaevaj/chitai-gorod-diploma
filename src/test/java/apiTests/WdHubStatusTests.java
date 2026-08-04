package apiTests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class WdHubStatusTests extends ApiTestBase {
    @Test
    void messageTest() {
        given()
                .log().all()
                .auth().preemptive().basic("user1", "1234")
                .when()
                .get("/wd/hub/status")
                .then()
                .log().all()
                .statusCode(200)
                .body(
                        "value.message",
                        is("Selenoid v3.0.7 built at 2026-08-01_11:46:48AM")
                );
    }

    @Test
    void readyTest() {
        given()
                .log().all()
                .auth().preemptive().basic("user1", "1234")
                .when()
                .get("/wd/hub/status")
                .then()
                .log().all()
                .statusCode(200)
                .body("value.ready", is(true));
    }

    @Test
    void schemaTest() {
        given()
                .log().all()
                .auth().preemptive().basic("user1", "1234")
                .when()
                .get("/wd/hub/status")
                .then()
                .log().all()
                .statusCode(200)
                .body(matchesJsonSchemaInClasspath(
                        "schemas/status_response_schema.json"
                ));
    }

    @Test
    void unauthorizedUserStatusTest() {
        given()
                .log().all()
                .when()
                .get("/wd/hub/status")
                .then()
                .log().all()
                .statusCode(401)
                .body(containsString("Authorization Required"));
    }
}
