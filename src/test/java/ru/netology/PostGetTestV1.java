package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostGetTestV1 {

    @Test
    void shouldReturnBody() {
        // Given - When - Then
        // Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                // отправляемые данные (заголовки и query можно выставлять аналогично)


                // Выполняемые действия
                .when()

                .post("/post")


                // Проверки
                .then()

                .statusCode(200)
                .body("data", equalTo("some data"));
    }
}