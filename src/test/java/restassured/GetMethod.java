package restassured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.core.IsEqual.*;

public class GetMethod {
    public static void main(String[] args) {
        given()
            .baseUri("https://jsonplaceholder.typicode.com/")
            .get("posts/1")
        .then()
                .statusCode(200)
                .body("id", equalTo(1));


        test();
    }

    public static  void test(){
        RestAssured.baseURI = "https://www.example.com";
        String body = "some json string";
        given()
                .header("Content-Type", "application/json")
	            .auth().basic("username", "password")
                .body(body)
        .when()
                .post("product/")
        .then()
                .log().all()
	            .statusCode(404);
               // .body("id", equalTo("20"));
    }
}