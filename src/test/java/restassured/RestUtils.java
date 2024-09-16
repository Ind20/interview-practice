package restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.given;

public class RestUtils {
    String baseUrl = "https://fakestoreapi.com/";
    RequestSpecification rs = RestAssured.given();
    Response response;
    public void setUri(String endPoint) {
        RestAssured.baseURI= baseUrl+endPoint;
    }
    public void setContentType() {
        rs = given().contentType("Application.JSON");
    }

    public void getRequest() {
        response = rs.when().get();
    }
    public int getStatusCode(){
        return response.getStatusCode();
    }

    public String getJsonPath(String string){
        JsonPath jp = response.jsonPath();
        return jp.get(string).toString();

    }
}
