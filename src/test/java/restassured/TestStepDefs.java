package restassured;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestStepDefs extends RestUtils {

    @Given("i set uri for {string} endpoint")
    public void iSetUriForEndpoint(String string) {
        try {
            setUri(string);
            Hooks.getExtentTest().log(Status.PASS, "i set the base uri");
        } catch (Exception e) {
            e.printStackTrace();
            Hooks.getExtentTest().log(Status.FAIL, "Not able to set the base uri");
        }
    }

    @When("i set the content type")
    public void i_set_the_content_type() {
        try {
            setContentType();
            Hooks.getExtentTest().log(Status.PASS, "i set the content type");
        } catch (Exception e) {
            e.printStackTrace();
            Hooks.getExtentTest().log(Status.FAIL,"i set the content type");
        }
    }

    @When("i get the api endpoint")
    public void i_get_the_api_endpint() {
        try {
            getRequest();
            Hooks.getExtentTest().log(Status.PASS, "i get the api endpoint");
        } catch (Exception e) {
            e.printStackTrace();
            Hooks.getExtentTest().log(Status.FAIL,"i get the api endpoint");

        }
    }

    @Then("i check the status as {string}")
    public void i_check_the_status_as(String status) {
        try {
            setUri("products");
            String actualStatus = String.valueOf(getStatusCode());
            Assert.assertEquals(actualStatus, status, "Status is not 200");
            Hooks.getExtentTest().log(Status.PASS,"i check the status");
        } catch (Exception e) {
            e.printStackTrace();
            Hooks.getExtentTest().log(Status.FAIL,"i check the status");
        }
    }

    @Then("i check the rate of product with id {int} is {string}")
    public void i_check_the_rate_of_product_with_id_is(Integer int1, String string) {
        try {
            String actualRate = getJsonPath("rating["+(int1-1)+"].rate");
            Assert.assertEquals(actualRate, string, "rate is not matching");
            Hooks.getExtentTest().log(Status.PASS,"i check the rate of product");
        } catch (Exception e) {
            e.printStackTrace();
            Hooks.getExtentTest().log(Status.FAIL," check the rate of product");
        }
    }
}
