package com.crowdshiftdemo.quarkus.services;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class accountopeningTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/openaccount")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}