package restassured;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class DeleteExample {
    public static void main(String[] args) {

        String id = "20";
        Response res = given().header("Content-type", "application/json")
                .auth().basic("username", "password")
                .when()
                .delete(id);

            res.then().log().all();
    }
}
