package tests.API;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AuthorizationTest {

    @Test
    public void testOfAuthorization() {
        given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "  \"userName\": \"JohnDoe69\",\n" +
                        "  \"password\": \"Test1111@\"\n" +
                        "}")
                .when()
                .post("https://demoqa.com/Account/v1/Authorized")
                .then()
                .statusCode(200);
    }
}
